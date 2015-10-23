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

$("#t_button").bind("click",testJquery);