function customerRegister(){

    var customerInfoObject = new Object();
    customerInfoObject.memberId = document.getElementById("username").value;
    customerInfoObject.memberPassword = document.getElementById("password1").value;
    customerInfoObject.confirmPassword = document.getElementById("password2").value;
    customerInfoObject.memberEmail = document.getElementById("email").value;
    customerInfoObject.memberNickname = document.getElementById("nickname").value;
    customerInfoObject.roleName = "ROLE_CUSTOMER";

    console.log(typeof customerInfoObject, customerInfoObject);

    let signUpResult = Apis.createMember(customerInfoObject).then(response => {
    	console.log(response);
    if(response.response === "success"){
    	alert("회원가입 성공");

        location.href = "../views/login.jsp";
    } else {
    	alert("회원가입 실패");
    }});
    
}
