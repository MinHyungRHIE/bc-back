DROP DATABASE IF EXISTS `back`;

CREATE DATABASE IF NOT EXISTS `back`
	DEFAULT CHARSET utf8 
    DEFAULT COLLATE utf8_general_ci;

CREATE USER IF NOT EXISTS 'master'@'localhost' IDENTIFIED BY 'Test1234';

GRANT ALL PRIVILEGES ON back.* TO 'master'@'localhost';

USE back;

DROP TABLE IF EXISTS `member_role`;
DROP TABLE IF EXISTS `role_privilege`;
DROP TABLE IF EXISTS `member`;
DROP TABLE IF EXISTS `role`;
DROP TABLE IF EXISTS `privilege`;

DROP TABLE IF EXISTS `service_address`;
DROP TABLE IF EXISTS `service_category`;

DROP TABLE IF EXISTS `service_registration`;
DROP TABLE IF EXISTS `service_history`;

DROP TABLE IF EXISTS `service_init`;

-- Member
CREATE TABLE `member` (
	`member_id`        VARCHAR(50)  NOT NULL COMMENT '회원아이디', -- member_id
	`member_password`  VARCHAR(100)  NOT NULL COMMENT '비밀번호', -- member_password
	`member_email`     VARCHAR(50)  NOT NULL COMMENT '이메일', -- member_email
	`member_nickname`  VARCHAR(50)  NOT NULL COMMENT '닉네임', -- member_nickname
	`member_join_date` DATETIME     NOT NULL DEFAULT NOW() COMMENT '가입일', -- member_join_date
	`member_img`       VARCHAR(255)  NULL     COMMENT '프로필이미지', -- member_img
	`member_isActive`  BOOLEAN      NOT NULL DEFAULT TRUE COMMENT '회원상태 (True=활성화, False=비활성화)', -- member_IsActive
	`career`           VARCHAR(255) NULL     COMMENT '경력', -- career
	`certi`            VARCHAR(255) NULL     COMMENT '자격증', -- certi
	`introduce`        MEDIUMTEXT   NULL     COMMENT '자기소개' -- introduce
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Member
ALTER TABLE `member`
	ADD CONSTRAINT `PK_Member` -- Member 기본키
		PRIMARY KEY (
			`member_id` -- member_id
		);
ALTER TABLE `member`
	ADD CONSTRAINT `UK_Member` -- Member 유일키
		UNIQUE (
			`member_email` -- member_id
		);
        
-- Service_Init
CREATE TABLE `service_init` (
	`service_id`            INT(12)     NOT NULL COMMENT '서비스번호', -- service_id
    `member_id`       	    VARCHAR(50)  NOT NULL COMMENT '회원아이디', -- member_id
	`service_title`         VARCHAR(50) NOT NULL COMMENT '서비스명', -- service_title
	`account_bank`          VARCHAR(50) NULL     COMMENT '계좌은행', -- account_bank
	`account_number`        VARCHAR(100)  NULL     COMMENT '계좌번호', -- account_number
	`category_id`           INT(12)     NOT NULL COMMENT '카테고리번호', -- category_id
	`service_isDelete`      BOOLEAN     NOT NULL DEFAULT FALSE COMMENT '서비스삭제상태( T:삭제됨;비활성, F:삭제;활성)', -- service_IsDelete
	`hashTag`               JSON        NULL     COMMENT '해시태그', -- hashTag
	`service_modified_date` DATETIME    NOT NULL DEFAULT NOW() COMMENT '최근수정일', -- service_modified_Date
	`service_img_uri`       JSON        NULL     COMMENT '서비스 이미지 경로', -- service_img_uri
	`service_description`   MEDIUMTEXT   NOT NULL COMMENT '서비스내용' -- service_description
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Service_Init
ALTER TABLE `service_init`
	ADD CONSTRAINT `PK_Service_Init` -- Service_Init 기본키
		PRIMARY KEY (
			`service_id` -- service_id
		);
ALTER TABLE `service_init`
	MODIFY COLUMN `service_id` INT(12) NOT NULL AUTO_INCREMENT COMMENT '서비스등록번호';        

ALTER TABLE `service_init`
	ADD CONSTRAINT `FK_Member_TO_Service_Init` -- Member -> Service_Init
		FOREIGN KEY (
			`member_id` -- member_id
		)
		REFERENCES `member` ( -- Member
			`member_id` -- member_id
		);

-- Service_History
CREATE TABLE `service_history` (
	`service_history_id`    INT(12)     NOT NULL COMMENT '서비스번호', -- service_id
    `service_register_id`   INT(12)      NOT NULL COMMENT '서비스등록번호', -- service_register_id
    `member_id`       	    VARCHAR(50)  NOT NULL COMMENT '회원아이디', -- member_id
	`service_title`         VARCHAR(50) NOT NULL COMMENT '서비스명', -- service_title
	`account_bank`          VARCHAR(50) NULL     COMMENT '계좌은행', -- account_bank
	`account_number`        VARCHAR(100)  NULL     COMMENT '계좌번호', -- account_number
	`category_id`           INT(12)     NOT NULL COMMENT '카테고리번호', -- category_id
	`service_isDelete`      BOOLEAN     NOT NULL DEFAULT FALSE COMMENT '서비스삭제상태( T:삭제됨;비활성, F:삭제;활성)', -- service_IsDelete
	`hashTag`               JSON        NULL     COMMENT '해시태그', -- hashTag
	`service_modified_date` DATETIME    NOT NULL DEFAULT NOW() COMMENT '최근수정일', -- service_modified_Date
	`service_img_uri`       JSON        NULL     COMMENT '서비스 이미지 경로', -- service_img_uri
	`service_description`   MEDIUMTEXT   NOT NULL COMMENT '서비스내용' -- service_description
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Service_Registration
CREATE TABLE `service_registration` (
	`service_register_id`       INT(12)      NOT NULL COMMENT '서비스등록번호', -- service_register_id
    `service_history_id`   	    INT(12)      NOT NULL COMMENT '서비스번호', -- service_id
    `address_id`            	INT(12)      NOT NULL COMMENT '주소ID', -- address_id
	`service_id`                INT(12)      NOT NULL COMMENT '서비스번호', -- service_id
	`service_register_date`     DATETIME     NOT NULL DEFAULT NOW() COMMENT '서비스등록일', -- service_register_Date
	`service_register_isActive` BOOLEAN      NOT NULL DEFAULT FALSE COMMENT '서비스삭제상태(T:활성, F:비활성)', -- service_register_IsActive
	`service_price`             INT(8)       NOT NULL COMMENT '서비스 가격', -- service_price
	`service_price_description` VARCHAR(128) NOT NULL COMMENT '서비스가격 설명' -- service_price_description
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Service_Registration
ALTER TABLE `service_registration`
	ADD CONSTRAINT `PK_Service_Registration` -- Service_Registration 기본키
		PRIMARY KEY (
			`service_register_id` -- service_register_id
		);

ALTER TABLE `service_registration`
	MODIFY COLUMN `service_register_id` INT(12) NOT NULL AUTO_INCREMENT COMMENT '서비스등록번호';

ALTER TABLE `service_registration`
	ADD CONSTRAINT `FK_Service_History_To_Service_Registration` -- Service_History -> Service_Registration
		FOREIGN KEY (
			`service_history_id` -- service_history_id
		)
		REFERENCES `service_history` ( -- service_registration
			`service_history_id` -- service_history_id
		);

-- Service_History
ALTER TABLE `service_histroy`
	ADD CONSTRAINT `PK_Service_History` -- Service_Registration 기본키
		PRIMARY KEY (
			`service_history_id` -- service_register_id
		);

ALTER TABLE `service_histroy`
	MODIFY COLUMN `service_history_id` INT(12) NOT NULL AUTO_INCREMENT COMMENT '서비스등록번호';

ALTER TABLE `service_histroy`
	ADD CONSTRAINT `FK_Service_Registration_To_Service_History` -- Service_Registration -> Service_History
		FOREIGN KEY (
			`service_register_id` -- service_registration
		)
		REFERENCES `service_registration` ( -- service_registration
			`service_register_id` -- service_register_id
		);
-- Service_Address
CREATE TABLE `service_address` (
	`address_id`     INT(12)      NOT NULL COMMENT '주소ID', -- address_id
	`address_state`  VARCHAR(10)  NOT NULL COMMENT '시/도', -- address_state
	`address_city`   VARCHAR(20)  NOT NULL COMMENT '시군구', -- address_city
	`address_dong`   VARCHAR(20)  NOT NULL COMMENT '동/리', -- address_dong
	`address_detail` VARCHAR(100) NULL     COMMENT '자세한주소' -- address_detail
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Service_Address
ALTER TABLE `service_address`
	ADD CONSTRAINT `PK_Service_Address` -- Service_Address 기본키
		PRIMARY KEY (
			`address_id` -- address_id
		);

ALTER TABLE `service_address`
	MODIFY COLUMN `address_id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '주소ID';

-- Service_Category
CREATE TABLE `service_category` (
	`category_id`      INT(12)     NOT NULL COMMENT '카테고리번호', -- category_id
	`category_subject` VARCHAR(50) NOT NULL COMMENT '분야 (요리, 예술, 외국어, 헬스/웰빙, 비즈니스, 일상생활)', -- category_subject
	`category_type`    VARCHAR(50) NOT NULL COMMENT '타입 (체험, 교육)', -- category_type
	`category_period`  VARCHAR(50) NOT NULL COMMENT '기간 (정기, 비정기)', -- category_period
	`category_scale`   VARCHAR(50) NOT NULL COMMENT '규모 (단체, 개인)', -- category_scale
	`category_place`   VARCHAR(50) NOT NULL COMMENT '장소 (실내, 실외)' -- category_place
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Service_Category
ALTER TABLE `service_category`
	ADD CONSTRAINT `PK_Service_Category` -- Service_Category 기본키
		PRIMARY KEY (
			`category_id` -- category_id
		);

ALTER TABLE `service_category`
	MODIFY COLUMN `category_id` INT(12) NOT NULL AUTO_INCREMENT COMMENT '카테고리번호';

-- member_Role
CREATE TABLE `member_role` (
	`member_id` VARCHAR(50) NULL COMMENT 'member_id', -- member_id
	`role_id`   VARCHAR(20) NULL COMMENT 'role_id' -- role_id
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Role
CREATE TABLE `role` (
	`role_id`   VARCHAR(20) NOT NULL COMMENT 'admin, provider, customer', -- role_id
	`role_name` VARCHAR(20) NOT NULL COMMENT 'ADMIN, PROVIDER, CUSTOMER' -- role_name
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Role
ALTER TABLE `role`
	ADD CONSTRAINT `PK_Role` -- Role 기본키
		PRIMARY KEY (
			`role_id` -- role_id
		);

-- Role_Privilege
CREATE TABLE `role_privilege` (
	`role_id`      VARCHAR(20) NULL COMMENT 'role_id', -- role_id
	`privilege_id` VARCHAR(20) NULL COMMENT 'privilege_id' -- privilege_id
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Privilege
CREATE TABLE `privilege` (
	`privilege_id`   VARCHAR(20) NOT NULL COMMENT 'read, write', -- privilege_id
	`privilege_name` VARCHAR(20) NOT NULL COMMENT 'READ, WRITE' -- privilege_name
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Privilege
ALTER TABLE `privilege`
	ADD CONSTRAINT `PK_Privilege` -- Privilege 기본키
		PRIMARY KEY (
			`privilege_id` -- privilege_id
		);

-- Member_Service_Creation
CREATE TABLE `member_service_creation` (
	`member_id`  VARCHAR(50) NULL COMMENT 'member_id', -- member_id
	`service_id` INT(12)     NULL COMMENT 'service_id' -- service_id
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Service_Creation
ALTER TABLE `service_registration`
	ADD CONSTRAINT `FK_Service_Address_TO_Service_Registration` -- Service_Address -> Service_Registration
		FOREIGN KEY (
			`address_id` -- address_id
		)
		REFERENCES `service_address` ( -- Service_Address
			`address_id` -- address_id
		);

-- Service_Creation
ALTER TABLE `service_creation`
	ADD CONSTRAINT `FK_Service_Category_TO_Service_Creation` -- Service_Category -> Service_Creation
		FOREIGN KEY (
			`category_id` -- category_id
		)
		REFERENCES `service_category` ( -- Service_Category
			`category_id` -- category_id
		);

-- Service_Registration
ALTER TABLE `service_registration`
	ADD CONSTRAINT `FK_Service_Creation_TO_Service_Registration` -- Service_Creation -> Service_Registration
		FOREIGN KEY (
			`service_id` -- service_id
		)
		REFERENCES `service_creation` ( -- Service_Creation
			`service_id` -- service_id
		);

-- member_Role
ALTER TABLE `member_role`
	ADD CONSTRAINT `FK_Role_TO_Member_Role` -- Role -> member_Role
		FOREIGN KEY (
			`role_id` -- role_id
		)
		REFERENCES `role` ( -- Role
			`role_id` -- role_id
		);

-- member_Role
ALTER TABLE `member_role`
	ADD CONSTRAINT `FK_Member_TO_Member_Role` -- Member -> member_Role
		FOREIGN KEY (
			`member_id` -- member_id
		)
		REFERENCES `member` ( -- Member
			`member_id` -- member_id
		);

-- Role_Privilege
ALTER TABLE `role_privilege`
	ADD CONSTRAINT `FK_Role_TO_Role_Privilege` -- Role -> Role_Privilege
		FOREIGN KEY (
			`role_id` -- role_id
		)
		REFERENCES `role` ( -- Role
			`role_id` -- role_id
		);

-- Role_Privilege
ALTER TABLE `role_privilege`
	ADD CONSTRAINT `FK_Privilege_TO_Role_Privilege` -- Privilege -> Role_Privilege
		FOREIGN KEY (
			`privilege_id` -- privilege_id
		)
		REFERENCES `privilege` ( -- Privilege
			`privilege_id` -- privilege_id
		);

-- Member_Service_Creation
ALTER TABLE `member_service_creation`
	ADD CONSTRAINT `FK_Member_TO_Member_Service_Creation` -- Member -> Member_Service_Creation
		FOREIGN KEY (
			`member_id` -- member_id
		)
		REFERENCES `member` ( -- Member
			`member_id` -- member_id
		);

-- Member_Service_Creation
ALTER TABLE `member_service_creation`
	ADD CONSTRAINT `FK_Service_Creation_TO_Member_Service_Creation` -- Service_Creation -> Member_Service_Creation
		FOREIGN KEY (
			`service_id` -- service_id
		)
		REFERENCES `service_creation` ( -- Service_Creation
			`service_id` -- service_id
		);
        
 INSERT INTO `privilege` VALUE
  ('read_service', 'READ_SERVICE')
, ('write_service', 'WRITE_SERVICE')
, ('read_me', 'READ_ME')
, ('write_me', 'WRITE_ME')
, ('read_member', 'READ_MEMEBER')
, ('write_member', 'WRITE_MEMEBER')
;

INSERT INTO `role` VALUE
  ('role_admin', 'ROLE_ADMIN')
, ('role_provider', 'ROLE_PROVIDER')
, ('role_customer', 'ROLE_CUSTOMER')
, ('role_guest', 'ROLE_GUEST')
;

INSERT INTO `role_privilege` VALUE
  ('role_admin', 'read_service')
, ('role_admin', 'write_service')
, ('role_admin', 'read_me')
, ('role_admin', 'write_me')
, ('role_admin', 'read_member')
, ('role_admin', 'write_member')

, ('role_provider', 'read_service')
, ('role_provider', 'write_service')
, ('role_provider', 'read_me')
, ('role_provider', 'write_me')
, ('role_provider', 'read_member')

, ('role_customer', 'read_service')
, ('role_customer', 'read_me')
, ('role_customer', 'write_me')
, ('role_customer', 'read_member')

, ('role_guest', 'read_service')
, ('role_guest', 'read_member')
;

SET @adminId = 'pap';
SET @providerId = 'quotia72';
SET @customerId = 'kimseula20';

INSERT INTO `member`
	SELECT @adminId, '1234', 'pap@pap.com','pap',NOW(),NULL,TRUE,NULL,NULL,NULL FROM DUAL;
INSERT INTO `member`
	SELECT @customerId, '1234', 'kimseula20@pap.com','queen',NOW(),NULL,TRUE,NULL,NULL,NULL FROM DUAL;
INSERT INTO `member`
    SELECT @providerId, '1234', 'quotia72@pap.com','wolf',NOW(),NULL,TRUE,'wolf learder','HSK6','ni hao' FROM DUAL;
SELECT * FROM member;

INSERT INTO `member_role`
	SELECT @adminId, 'role_admin' FROM DUAL;
INSERT INTO `member_role`
	SELECT @customerId, 'role_customer' FROM DUAL;
INSERT INTO `member_role`
	SELECT @providerId, 'role_provider' FROM DUAL;

INSERT INTO `service_address`(
	address_state, address_city, address_dong, address_detail)
	VALUES ("경기도 고양시", "일산동구", "장항동", "105-32");

INSERT INTO `service_category`(
	category_subject, category_type, category_period, category_scale, category_place)
    VALUES(
    "비즈니스", "교육","정기","단체","실내");

INSERT INTO `service_creation`(
	service_title, account_bank, account_number, category_id, service_isDelete, hashTag, service_modified_date, service_img_uri, service_description)
    VALUES(
    "중국어 교육", "국민은행", "524231-01-234232",1, FALSE, '["커피","아아","교육","아메리카노","공짜교육"]', NOW(), NULL, "강남에 제일 핫한 알베르라는 카페에서 \n랩을 운영하고 있는 바리스타입니다. ");

INSERT INTO `service_registration`(
	service_id, address_id, service_register_date, service_register_isActive, service_price, service_price_description)
    VALUES(
    1, 1, NOW(), TRUE, "50000","중국어 초특강");