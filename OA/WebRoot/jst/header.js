$(function() {

	$(".nav-stacked li").click(function() {
		$(this).siblings().removeClass("active");
		$(this).addClass("active");
	});

	$(".nav li").click(function() {
		$(this).siblings().removeAttr("class");
		$(this).attr("class","active");
	});
	

	$("#login").click(function() {
		$("#log").show();
	});
	
	$("#out").click(function() {
		$("#log").hide();
	});
});