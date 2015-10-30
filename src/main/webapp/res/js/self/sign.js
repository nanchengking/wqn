function sign() {
    var arr = $("#login_form").serializeArray();
    var user = {};
    for (i in arr) {
        user[arr[i].name] = arr[i].value;
    }
    $.ajax({
        url : '/login/sign',
        type : 'post',
        data : JSON.stringify(user),
        dataType : 'json',
        contentType : "application/json",
        success : function(data) {
            if (data.code == 200) {
                console.log(data.msg);
            } else {
                alert(data.msg);
            }
        }
    });
    console.log("已经发出爬取请求！" + JSON.stringify(user));
}
$("#submit_form").bind('click', sign);

