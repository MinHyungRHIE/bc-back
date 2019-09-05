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
DROP TABLE IF EXISTS `service`;
DROP TABLE IF EXISTS `service_template`;

DROP TABLE IF EXISTS `wishlist`;

-- DESC member;
-- Member
CREATE TABLE `member` (
	`member_id`        		VARCHAR(255)  	PRIMARY KEY  	NOT NULL COMMENT '회원아이디', -- member_id
	`member_password` 		VARCHAR(255)                    NOT NULL COMMENT '비밀번호', -- member_password
	`member_email`     		VARCHAR(255)  	UNIQUE KEY		NOT NULL COMMENT '이메일', -- member_email
	`member_nickname`  		VARCHAR(255)    UNIQUE KEY 		NOT NULL COMMENT '닉네임', -- member_nickname
	`member_join_date` 		DATETIME                        NOT NULL DEFAULT NOW() COMMENT '가입일', -- member_join_date
	`member_img`       		VARCHAR(255)                  	NULL  	 COMMENT '프로필이미지', -- member_img
	`member_isActive` 		BOOLEAN                         NOT NULL DEFAULT TRUE COMMENT '회원상태 (True=활성화, False=비활성화)', -- member_IsActive
	`career`           		VARCHAR(255)                    NULL 	 COMMENT '경력', -- career
	`certi`            		VARCHAR(255) 					NULL     COMMENT '자격증', -- certi
	`introduce`        		MEDIUMTEXT   					NULL 	 COMMENT '자기소개' -- introduce
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;


-- Service_Template (구, service_creation)
CREATE TABLE `service_template` (
	`service_template_id`  	INT(36) 		PRIMARY KEY 	NOT NULL COMMENT '서비스템플릿번호' AUTO_INCREMENT, -- service_id
	`member_id`            	VARCHAR(255) 					NOT NULL COMMENT '멤버아이디', -- member_id
	`service_title`        	VARCHAR(255) 					NOT NULL COMMENT '서비스명', -- service_title
	`account_bank`         	VARCHAR(255) 					NULL  	 COMMENT '계좌은행', -- account_bank
	`account_number`       	VARCHAR(255)  					NULL  	 COMMENT '계좌번호', -- account_number
	`category_id`          	INT(36)     					NOT NULL COMMENT '카테고리번호', -- category_id
	`service_isDelete`     	BOOLEAN    						NOT NULL DEFAULT FALSE COMMENT '서비스삭제상태( T:삭제됨;비활성, F:삭제;활성)', -- service_IsDelete
	`hashTag`              	VARCHAR(255)    				NULL  	 COMMENT '해시태그', -- hashTag 	--JSON
	`service_modified_date` DATETIME    					NOT NULL DEFAULT NOW() COMMENT '최근수정일', -- service_modified_Date
	`service_img_uri`       JSON        					NULL  	 COMMENT '서비스 이미지 경로', -- service_img_uri
	`service_description`   MEDIUMTEXT   					NOT NULL COMMENT '서비스내용' -- service_description
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;
-- member_id, category pk 설정해줘야함 PK값을 줘야 함.........

-- Service( 구 Service_Registration)
CREATE TABLE `service` (
	`service_id`            	INT(36)  PRIMARY KEY   		NOT NULL COMMENT '서비스번호' AUTO_INCREMENT, -- service_id
	`member_id`             	VARCHAR(255) 				NOT NULL COMMENT '멤버아이디', -- member_id
	`service_title`         	VARCHAR(255)	 			NOT NULL COMMENT '서비스명', -- service_title
	`account_bank`          	VARCHAR(255) 				NULL  	 COMMENT '계좌은행', -- account_bank
	`account_number`       		VARCHAR(255)  				NULL  	 COMMENT '계좌번호', -- account_number
	`category_id`           	INT(36)     				NOT NULL COMMENT '카테고리번호', -- category_id
	`service_isDelete`      	BOOLEAN     				NOT NULL DEFAULT FALSE COMMENT '서비스삭제상태( T:삭제됨;비활성, F:삭제;활성)', -- service_IsDelete
	`hashTag`               	VARCHAR(255)				NULL  	 COMMENT '해시태그', -- hashTag 	--JSON
	`service_modified_date` 	DATETIME   					NOT NULL DEFAULT NOW() COMMENT '최근수정일', -- service_modified_Date
	`service_img_uri`       	VARCHAR(255)   				NULL  	 COMMENT '서비스 이미지 경로', -- service_img_uri 	--JSON
    `service_description` 	    MEDIUMTEXT   				NOT NULL COMMENT '서비스내용', -- service_description
	`service_register_date` 	DATETIME  					NOT NULL DEFAULT NOW() COMMENT '서비스등록일', -- service_register_date
	`service_register_isActive`	BOOLEAN     				NOT NULL DEFAULT TRUE COMMENT '서비스활성상태( T:활성, F:비활성)', -- service_register_isAcive
	`service_price`           	INT(36)  	 				NOT NULL COMMENT '서비스가격', -- service_price
	`service_date_description` 	VARCHAR(255)   				NOT NULL COMMENT '서비스기간상세설명', -- service_date_description
	`service_start_date`     	DATETIME   					NOT NULL COMMENT '서비스시작일', -- service_start_date
	`service_end_date`       	DATETIME   					NOT NULL COMMENT '서비스종료일', -- service_end_date
	`address_id`             	INT(36)   					NOT NULL COMMENT '주소ID' -- address_id

) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;
-- category fk, 주소 fk 설정해야함. 여기서 member_id는 fk설정하지 않음........!!!!!

-- Service_Address
CREATE TABLE `service_address` (
	`address_id`     		INT(36) 		 PRIMARY KEY    NOT NULL COMMENT '주소ID' AUTO_INCREMENT, -- address_id
	`address_state`  		VARCHAR(255)  					NOT NULL COMMENT '시/도', -- address_state
	`address_city`   		VARCHAR(255)  					NOT NULL COMMENT '시군구', -- address_city
	`address_dong`   		VARCHAR(255)  					NOT NULL COMMENT '동/리', -- address_dong
	`address_detail` 		VARCHAR(255) 					NULL 	  COMMENT '자세한주소' -- address_detail
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Service_Category
CREATE TABLE `service_category` (
	`category_id`      INT(36)     PRIMARY KEY  NOT NULL COMMENT '카테고리번호' AUTO_INCREMENT, -- category_id
	`category_subject` VARCHAR(255) 			NULL COMMENT '분야 (요리, 예술, 외국어, 헬스/웰빙, 비즈니스, 일상생활)', -- category_subject
	`category_type`    VARCHAR(255) 			NULL COMMENT '타입 (체험, 교육)', -- category_type
	`category_period`  VARCHAR(255) 			NULL COMMENT '기간 (정기, 비정기)', -- category_period
	`category_scale`   VARCHAR(255) 			NULL COMMENT '규모 (단체, 개인)', -- category_scale
	`category_place`   VARCHAR(255) 			NULL COMMENT '장소 (실내, 실외)' -- category_place
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- wishlist
CREATE TABLE `wishlist` (
	`wishlist_id`      INT(36)  		PRIMARY KEY 	NOT NULL COMMENT '찜번호' AUTO_INCREMENT, -- wishlist_id
	`service_id`       INT(36)     						NOT NULL COMMENT '서비스 등록번호', -- service_id
	`member_id`     	VARCHAR(255) 					NOT NULL COMMENT '회원번호', -- member_id
	`wish_date`       DATETIME    						NOT NULL DEFAULT NOW() COMMENT '등록일' -- wish_date
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- member_Role
CREATE TABLE `member_role` (
	`member_id` 	VARCHAR(255) 		NULL COMMENT 'member_id', -- member_id
	`role_id`   	VARCHAR(255) 		NULL COMMENT 'role_id' -- role_id
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Role
CREATE TABLE `role` (
	`role_id`       VARCHAR(255) 	PRIMARY KEY			NOT NULL COMMENT 'admin, provider, customer', -- role_id
	`role_name`	 	VARCHAR(255) 						NOT NULL COMMENT 'ADMIN, PROVIDER, CUSTOMER' -- role_name
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;


-- Role_Privilege
CREATE TABLE `role_privilege` (
	`role_id`      VARCHAR(255) 		NULL COMMENT 'role_id', -- role_id
	`privilege_id` VARCHAR(255) 		NULL COMMENT 'privilege_id' -- privilege_id
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Privilege
CREATE TABLE `privilege` (
	`privilege_id`   	VARCHAR(255)	 PRIMARY KEY 	NOT NULL COMMENT 'read, write', -- privilege_id
	`privilege_name` 	VARCHAR(255) 					NOT NULL COMMENT 'READ, WRITE' -- privilege_name
) ENGINE = `InnoDB` DEFAULT CHARACTER SET = `utf8`;

-- Service
ALTER TABLE `service`
	ADD CONSTRAINT `FK_Service_Address_TO_Service` -- Service_Address -> Service
		FOREIGN KEY (
			`address_id` -- address_id
		)
		REFERENCES `service_address` ( -- Service_Address
			`address_id` -- address_id
		);

-- Service
ALTER TABLE `service`
	ADD CONSTRAINT `FK_Service_Category_TO_Service` -- Service_Category -> Service
		FOREIGN KEY (
			`category_id` -- category_id
		)
		REFERENCES `service_category` ( -- Service_Category
			`category_id` -- category_id
		);

-- Service_Template
ALTER TABLE `service_template`
	ADD CONSTRAINT `FK_Service_Category_TO_Service_Template` -- Service_Category -> Service_Template
		FOREIGN KEY (
			`category_id` -- category_id
		)
		REFERENCES `service_category` ( -- Service_Category
			`category_id` -- category_id
		);

ALTER TABLE `service_template`
	ADD CONSTRAINT `FK_Member_TO_Service_Template` -- Member -> Service_Template 
		FOREIGN KEY (
			`member_id` -- member_id
		)
		REFERENCES `member` ( -- member_id
			`member_id` -- member_id
		);


ALTER TABLE `wishlist`
	ADD CONSTRAINT `FK_Service_TO_Wishlist` -- Service -> wishlist 
		FOREIGN KEY (
			`service_id` -- service_id
		)
		REFERENCES `service` ( -- service_id
			`service_id` -- service_id
		);


ALTER TABLE `wishlist`
	ADD CONSTRAINT `FK_Member_TO_Wishlist` -- Member -> wishlist 
		FOREIGN KEY (
			`member_id` -- member_id
		)
		REFERENCES `member` ( -- member_id
			`member_id` -- member_id
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

USE back;

SELECT * FROM service_template;
SELECT service_price FROM service ORDER BY service_price;
SELECT * FROM service;
SELECT * FROM service_address;
SELECT * FROM service_category;

SELECT * FROM service_template;

DELETE FROM service_category WHERE category_id=2;
-- USE back;

-- DROP TABLE IF EXISTS jsontest;
-- CREATE TABLE jsontest(
-- 	jack JSON
-- );

-- INSERT INTO jsontest VALUES ('
-- 	{
-- 		"pid": 101, 
-- 		"name": "name1"
-- 	}
-- ');

-- INSERT INTO jsontest VALUES('
-- 	{
-- 		"name" : "mhRHIE",
--         "age" : "27",
--         "message" : ["JACK1","JACK2","JACK3"]
--     }
-- ');

-- INSERT INTO jsontest VALUES('["JACK1","JACK2","JACK3"]');

-- SELECT * FROM jsontest;