function customerRegister(){
    var customerInfoObject = new Object();
    customerInfoObject.memberId = document.getElementById("username").value;
    customerInfoObject.memberPassword = document.getElementById("password1").value;
    customerInfoObject.confirmPassword = document.getElementById("password2").value;
    customerInfoObject.memberEmail = document.getElementById("email").value;
    customerInfoObject.memberNickname = document.getElementById("nickname").value;
    customerInfoObject.roleName = "ROLE_CUSTOMER";
    console.log(typeof customerInfoObject, customerInfoObject);

    Apis.createMember(customerInfoObject).then(response => {
        if(response.res === "success"){
            console.log("회원가입 성공");
            Apis.getRequest('/test').then( response =>{
                console.log(response);
            });
        } else {
            console.log("로그인 실패");
        }});
}

document.getElementById('validate_id').addEventListener('click', checkValidate_Id);
function checkValidate_Id() {
	
	
	
    var id = document.getElementById('username').value;
    // var content = new Object();
    //     // content.id = id;
    
    location.href = "signup/check-id/"+id;
    
//    window.parent.location.href = '/check-id/'+id;

    
    
    
//    Apis.ValidateId(id)
//        .then(response => console.log(response))
//        .then(response => {
//            if(response.res === "success"){
//                alert("사용할 수 있는 아이디입니다");
//                checkIdValidate = true;
//            }
//            else {
//                alert("이미 사용 중인 아이디입니다");
//                document.getElementById("username").value.reset();
//                checkIdValidate = false;
//            }
//        });
}

document.getElementById('validate_nickname').addEventListener('click', checkValidate_Nickname);
function checkValidate_Nickname() {
    var nickname = document.getElementById('nickname').value;
    Apis.ValidateNickName(nickname).then(response=>{
        if(response.res === "success"){
            alert("사용할 수 있는 닉네임입니다");
            checkNickValidate = true;
        }else
        {
            alert("이미 사용중인 닉네임입니다");
            checkNickValidate = false;
            document.getElementById("nickname").value.reset();
        }
    });
}

document.getElementById('validate_email').addEventListener('click', checkValidate_email);
function checkValidate_email() {
    var email = document.getElementById('email').value;
    // var content = new Object();
    // content.nickname = nickname;
    // console.log(typeof content, content);
    Apis.ValidateNickName(email).then(response=>{
        if(response.res === "success"){
            alert("사용할 수 있는 이메일입니다");
            checkEmailValidate = true;
        }else
        {
            alert("이미 사용중인 이메일입니다");
            checkEmailValidate = false;
            document.getElementById("email").value.reset();
        }
    });
}
//var xhr;
//
//function makeXhr(val){
//    xhr=new XMLHttpRequest();
//    xhr.open('POST', "http://localhost:9999/signup");
//    xhr.setRequestHeader('Content-type', 'application/json');
//    xhr.send(val);
//
//    xhr.onreadystatechange = function(){
//        if(xhr.readyState == 4){
//            console.log("4");
//            if(xhr.status == 200){
//                console.log("데이터 보내기 성공");
//            } else {
//                console.log("데이터 보내기 실패");
//            }
//        }
//    }
//}
