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
        console.log("회원가입 성공");
        Apis.getRequest('/test').then( response =>{
        	console.log(response);
        });
    } else {
    	console.log("여긴와?")
        console.log("회원가입 실패");
    }});

    
    

}
//
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