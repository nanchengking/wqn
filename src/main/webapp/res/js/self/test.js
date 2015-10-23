function alert_something(a){
    alert(a);
}

function testChangeToHtml(a){
    window.location.replace(a)
}
var i=0;
function testJquery(){
    console.log($("#t_button").text()+i++);
}
function crawlSpider(){
    $.ajax({
        url : '/spider/crawl',
        type : "GET",
        success : function(data) {
            if(data.code==200){
                console.log("已经发出爬取请求！");
            }else{
                alert(data.msg);
            }
        }
    });
}
$("#t_button").bind("click",testJquery);
$("#spider").bind("click",crawlSpider);