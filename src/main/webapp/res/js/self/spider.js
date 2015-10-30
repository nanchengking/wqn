function search() {
    var type=$('#type').val();
    var keyword=$('#keyword').val();
    $.ajax({
        url : '/spider/crawl?type='+type+'&keyword='+keyword,
        type : "GET",
        success : function(data) {
            if (data.code == 200) {
                console.log(data.msg);
            } else {
                alert(data.msg);
            }
        }
    });
    console.log("已经发出爬取请求！");
}
$("#do_search").bind('click', search);

