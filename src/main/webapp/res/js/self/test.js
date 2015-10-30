function alert_something(a) {
    alert(a);
}

function testChangeToHtml(a) {
    location.replace(a)
}
var i = 0;
function testJquery() {
    console.log($("#t_button").text() + i++);
}
function crawlSpider() {
    $.ajax({
        url : '/spider/crawl',
        type : "GET",
        success : function(data) {
            if (data.code == 200) {
                console.log("已经发出爬取请求！");
                console.log(data.msg);
            } else {
                alert(data.msg);
            }
        }
    });
}

function stopSpider() {
    $.ajax({
        url : '/spider/stop',
        type : "GET",
        success : function(data) {
            if (data.code == 200) {
                console.log("已经发出停止请求！");
                console.log(data.msg);
            } else {
                alert(data.msg);
            }
        }
    });
}
function change_to_spider() {
    testChangeToHtml('spider/index');
}

$("#change_to_spider").bind("click", change_to_spider);
$("#stop_spider").bind("click", stopSpider);
$("#t_button").bind("click", testJquery);
$("#spider").bind("click", crawlSpider);