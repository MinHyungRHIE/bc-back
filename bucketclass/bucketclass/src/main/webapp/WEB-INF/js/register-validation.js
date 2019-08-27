var inputReturnValue;
var idReturnValue;
var nickReturnValue;
var emailReturnValue;
var pw1ReturnValue;
var pw2ReturnValue;
var checkIdValidate = false;
var checkNickValidate = false;
var checkEmailValidate = false;

function registerValidation(val, id){
    if(id === "username"){
        idReturnValue = idValidity(val, "id-notify", "아이디는 ", "member_id");
    } else if(id === "nickname"){
        nickReturnValue = idValidity(val, "nick-notify", "닉네임은 ", "member_nickname");
    } else if(id === "email"){
        emailReturnValue = emailValidity(val);
    } else if(id === "password1"){
        pw1ReturnValue = pwValidity(val);
    } else if(id === "password2"){
        pw2ReturnValue = pw2Validity(val);
    }
}

function idValidity(val, tag, Division) {
    //아이디 유효성 검사 (영문소문자, 숫자만 허용)
    for (var i = 0; i < val.length; i++) {
        var ch = val.charAt(i);
        if (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z')) {
            document.getElementById(tag).innerHTML = Division + "대소문자, 숫자만 입력가능합니다.";
            document.getElementById(tag).style.color = "red";
            return false;
        } else {
            document.getElementById(tag).innerHTML = "";
        }
    }

    //아이디 길이 체크 (4~12자)
    if (val.length < 4 || val.length > 12) {
        document.getElementById(tag).innerHTML = Division + "4~12자까지 입력가능합니다.";
        document.getElementById(tag).style.color = "red";
        return false;
    } else {
        document.getElementById(tag).innerHTML = "";
        return true;
    }
} // idvalidate

function pwValidity(val) {
    // 비밀번호 길이 체크(8~16자 까지 허용)
    if (val.length < 8 || val.length > 16) {
        document.getElementById("pw1-notify").innerHTML = "비밀번호를 8~16자까지 입력해주세요.";
        document.getElementById("pw1-notify").style.color = "red";
        return false;
    } else {
        document.getElementById("pw1-notify").innerHTML = "";
        return true;
    }
} // pwValidity

function pw2Validity(secondPassword) {
    var firstPassword = document.getElementById("password1").value;

    if (firstPassword.length == 0) {
        document.getElementById("pw2-notify").innerHTML = "비밀번호를 입력하지 않았습니다.";
        document.getElementById("pw2-notify").style.color = "red";
        return false;
    }
    //비밀번호와 비밀번호 확인 일치여부 체크
    if (secondPassword != firstPassword) {
        document.getElementById("pw2-notify").innerHTML = "비밀번호가 일치하지 않습니다.";
        document.getElementById("pw2-notify").style.color = "red";
        return false;

    } else {
        document.getElementById("pw2-notify").innerHTML = "비밀번호가 일치합니다.";
        document.getElementById("pw2-notify").style.color = "blue";
        return true;
    }
} // pw2Validity

function emailValidity(val) {
    // 이메일 유효성 정규식
    var regex = /([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;

    if (regex.test(val) === false) {
        document.getElementById("email-notify").innerHTML = "잘못된 이메일 형식입니다.";
        document.getElementById("email-notify").style.color = "red";
        val.value = "";
        return false;
    } else {
        document.getElementById("email-notify").innerHTML = "";
        return true;
    }
} // emailValidity

function registerInputValidity() {
    var id = document.getElementById("username"); // 입력 받은 아이디
    var pw = document.getElementById("password1"); // 입력 받은 비밀번호
    var pw2 = document.getElementById("password2");
    var nickname = document.getElementById("nickname");
    var email = document.getElementById("email");

    // 아이디 입력여부 검사
    if (id.value === "") {
        document.getElementById("id-notify").innerHTML = "아이디를 입력하지 않았습니다.";
        document.getElementById("id-notify").style.color = "red";
        id.focus();
        id.select();
        inputReturnValue = false;
    } else {
        document.getElementById("id-notify").innerHTML = "";
        inputReturnValue = true;
    }

    // 닉네임 입력여부 검사
    if (nickname.value === "") {
        document.getElementById("nick-notify").innerHTML = "닉네임을 입력하지 않았습니다.";
        document.getElementById("nick-notify").style.color = "red";
        nickname.focus();
        nickname.select();
        inputReturnValue = false;
    } else {
        document.getElementById("nick-notify").innerHTML = "";
        inputReturnValue = true;
    }

    // 이메일 입력여부 검사
    if (email.value === "") {
        document.getElementById("email-notify").innerHTML = "이메일을 입력하지 않았습니다.";
        document.getElementById("email-notify").style.color = "red";
        email.focus();
        email.select();
        inputReturnValue = false;
    } else {
        document.getElementById("email-notify").innerHTML = "";
        inputReturnValue = true;
    }

    // 비밀번호 입력여부 검사
    if (pw.value === "") {
        document.getElementById("pw1-notify").innerHTML = "비밀번호를 입력하지 않았습니다.";
        document.getElementById("pw1-notify").style.color = "red";
        pw.focus();
        pw.select();
        inputReturnValue = false;
    } else {
        document.getElementById("pw1-notify").innerHTML = "";
        inputReturnValue = true;
    }

    // 비밀번호 확인 입력여부 검사
    if (pw2.value === "") {
        document.getElementById("pw2-notify").innerHTML = "비밀번호 확인을 입력하지 않았습니다.";
        document.getElementById("pw2-notify").style.color = "red";
        pw2.focus();
        pw2.select();
        inputReturnValue = false;
    } else {
        document.getElementById("pw2-notify").innerHTML = "";
        inputReturnValue = true;
    }

    if(idReturnValue === true && nickReturnValue === true && emailReturnValue === true &&
        pw1ReturnValue === true && pw2ReturnValue === true && inputReturnValue === true &&
        checkIdValidate === true && checkNickValidate === true && checkEmailValidate === true){
        customerRegister();
    }

    else if(checkIdValidate === false){
        alert("아이디 중복검사를 해주세요.")
    }

    else if(checkNickValidate === false){
        alert("닉네임 중복검사를 해주세요.")
    }

    else if(checkEmailValidate === false){
        alert("이메일 중복검사를 해주세요.")
    }

    else {
        alert("양식에 맞춰 작성해주세요.");
    }
} // registerInputValidity

