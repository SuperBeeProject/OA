$(function() {
	$("#tei").click(function() {
		$("#tein").show();
		$("#contact").hide();
		$("#attendance").hide();
		$("#announcement").hide();
		$("#info").hide();
		$("#fout").hide();
		$("#tematerial").hide();
		$("#mwarehouse").hide();
	});

	$("#fo").click(function() {
		$("#allout").load("findallorder.action");
		$("#fout").show();
		$("#contact").hide();
		$("#attendance").hide();
		$("#announcement").hide();
		$("#info").hide();
		$("#tein").hide();
		$("#tematerial").hide();
		$("#mwarehouse").hide();
	});

	$("#tem").click(function() {
		$("#alltematerial").load("findallprocurement.action");
		$("#tematerial").show();
		$("#contact").hide();
		$("#attendance").hide();
		$("#announcement").hide();
		$("#info").hide();
		$("#fout").hide();
		$("#tein").hide();
		$("#mwarehouse").hide();
	});

	$("#mwh").click(function() {
		$("#mwarehouse").show();
		$("#contact").hide();
		$("#attendance").hide();
		$("#announcement").hide();
		$("#info").hide();
		$("#fout").hide();
		$("#tematerial").hide();
		$("#tein").hide();
	});
	
	$("#ftein").click(function() {
		$("#teins").show();
		$("#alltein").hide();
	});
	
	$("#btei").click(function() {
		$("#alltein").show();
		$("#teins").hide();
	});
	
	$(".gout").click(function() {
		var ordernumber = $(this).prev().val();
		$("#faout").load("findorderbyordernumber.action","ordernumber="+ordernumber);
		$("#faout").show();
		$("#allout").hide();
	});
	
	$("#bout").click(function() {
		$("#allout").show();
		$("#faout").hide();
	});
	
	$("#allout-first").click(function() {
		var nowpageno = $("#allout-nowpageno").text();
		$("#allout").load("changeoutpageno.action",{"changeno":"first","nowpageno":nowpageno});
	});
	
	$("#allout-up").click(function() {
		var nowpageno = $("#allout-nowpageno").text();
		$("#allout").load("changeoutpageno.action",{"changeno":"up","nowpageno":nowpageno});
	});
	
	$("#allout-down").click(function() {
		var nowpageno = $("#allout-nowpageno").text();
		$("#allout").load("changeoutpageno.action",{"changeno":"down","nowpageno":nowpageno});
	});
	
	$("#allout-last").click(function() {
		var nowpageno = $("#allout-nowpageno").text();
		$("#allout").load("changeoutpageno.action",{"changeno":"last","nowpageno":nowpageno});
	});
	
	$("#tematerial-first").click(function() {
		var nowpageno = $("#tematerial-nowpageno").text();
		$("#alltematerial").load("changetematerialpageNo.action",{"changeno":"first","nowpageno":nowpageno});
	});
	
	$("#tematerial-up").click(function() {
		var nowpageno = $("#tematerial-nowpageno").text();
		$("#alltematerial").load("changetematerialpageNo.action",{"changeno":"up","nowpageno":nowpageno});
	});
	
	$("#tematerial-down").click(function() {
		var nowpageno = $("#tematerial-nowpageno").text();
		$("#alltematerial").load("changetematerialpageNo.action",{"changeno":"down","nowpageno":nowpageno});
	});
	
	$("#tematerial-last").click(function() {
		var nowpageno = $("#tematerial-nowpageno").text();
		$("#alltematerial").load("changetematerialpageNo.action",{"changeno":"last","nowpageno":nowpageno});
	});
});