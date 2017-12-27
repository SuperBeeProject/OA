$(function() {
	  $("#te").click(function() {
		  $("#teo").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#smoney").hide();
		//加载生产审核过的订单列表  
		  $("#allorder").load("order11!findAllOrderByProduct");
	  });

	  $("#sm").click(function() {
		  $("#smoney").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#teo").hide();
	  });

	  $("#examine").click(function() {
		  $("#order").show();
		  $("#allorder").hide();
		//审核订单
		  var id=$(this).parents().siblings(".thisorderid").text();
		  $("#order").load("order12!findByID","orders.orderid="+id);
	  });

	  $("#bo").click(function() {
		  $("#allorder").show();
		  $("#order").hide();
		  $("#allorder").load("order11!findAllOrderByProduct");
	  });
	  
	//通过
	  $("#yes").click(function(){
		  var id1=$(this).siblings("#waitpassid").val();
//		  alert(id1);
		  $.get("order5!pass",{"orders.orderid":id1,"state.stateid":4},function(date){
				if(date=="审核成功"){
					alert("审核成功");
				}
				if(date=="审核失败"){
					alert("审核失败");
				}
			});
	  });
	  
});