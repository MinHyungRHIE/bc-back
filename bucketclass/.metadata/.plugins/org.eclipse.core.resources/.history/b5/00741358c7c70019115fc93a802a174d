function customerRegister(){
    var customerInfo = new Object();
    customerInfo.memberId = document.getElementById("username").value;
    customerInfo.memberPassword = document.getElementById("password1").value;
    customerInfo.memberEmail = document.getElementById("email").value;
    customerInfo.memberNickname = document.getElementById("nickname").value;
    customerInfo.roleName = "ROLE_CUSTOMER";
    Apis.createMember(customerInfo);
}

var xhr;

function makeXhr(val){
    xhr=new XMLHttpRequest();
    xhr.open('POST', "http://localhost:5000/todos");
    xhr.setRequestHeader('Content-type', 'application/json');
    xhr.send(val);

    xhr.onreadystatechange = function(){
        if(xhr.readyState == 4){
            console.log("4");
            if(xhr.status == 200){
                console.log("데이터 보내기 성공");
            } else {
                console.log("데이터 보내기 실패");
            }
        }
    }
}