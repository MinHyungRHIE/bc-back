function initLogin(){
    var mock = true;

    $(function(){
        if(mock){
            startXhr();
        } else {
            Apis.getRequest('/list');
        }
    });
}

var xhr;

function startXhr() {
    xhr = new XMLHttpRequest();
    xhr.open("POST", "../login.json");
    console.log("데이터 불러오기 성공111");
    xhr.send();

    xhr.onreadystatechange = function () {
        if(xhr.readyState == 4){
            console.log("4");
            if(xhr.status == 200){
                console.log("데이터 불러오기 성공222");
                serializeData();
            } else {
                console.log("데이터 불러오기 실패");
            }
        }
    }
}

function serializeData() {
    console.log("serializeData 시작");
    var serviceData = xhr.responseText;
    //데이터 가져오는지 확인
    console.log(typeof serviceData, serviceData);
    //데이터 json으로 바꾸기
    var serializedServiceData = JSON.parse(serviceData);

    var id = document.getElementById("username").value;
    var pwd = document.getElementById("password").value;

    console.log(id, "+", pwd);

    if(id === serializedServiceData["member_ID"] && pwd === serializedServiceData["member_Password"]){
        document.write("로그인 성공");
    }else{
        document.write("로그인 실패");
    }

    console.log(typeof serializedServiceData, serializedServiceData);
}
