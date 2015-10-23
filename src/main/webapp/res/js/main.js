function setContainerHeight() {
	$("body > .container").first().css("min-height",(window.innerHeight-200)+"px");
}
$(document).ready(function() {
	setContainerHeight();
	$(window).resize(function() {
		setContainerHeight();
	})
	setContainerHeight();
})