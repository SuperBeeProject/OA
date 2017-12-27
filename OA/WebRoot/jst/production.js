$(function() {
	  $("#te").click(function() {
		  $("#teo").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#smoney").hide();
		  $("#ars").hide();
		  $("#irs").hide();
		//查询所有待审核的订单 
		  $("#allorder").load("order9!findAllOrders");
		  $("#irsmonti").hide();
		  $("prsmonti").hide();
	  });

	  $("#ar").click(function() {
		  $("#ars").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#smoney").hide();
		  $("#teo").hide();
		  $("#irs").hide();
		  $("#addproductorder").hide();	
		  $("#irsmonti").hide();
		//查看业务审核的订单
		  $("#ars").load("order13!findOrdersByfinance");
		  $("prsmonti").hide();
	  });

	  $("#ir").click(function() {
		  $("#irs").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#smoney").hide();
		  $("#ars").hide();
		  $("#teo").hide();
		  $("#irsmonti").hide();
		  $("prsmonti").hide();
		  //查看生产任务单
		  $("#irs").load("order16!findAllProorder");	  
		  
	  });
	  
	  $("#examine").click(function() {
		  $("#order").show();
		  $("#allorder").hide();
		  
		//审核订单
		  var id=$(this).parents().siblings(".thisorderid").text();
		  $("#order").load("order10!findByID","orders.orderid="+id);
		
		  
	  });

	  $("#bo").click(function() {
		  $("#allorder").show();
		  $("#order").hide();
		  
		  $("#allorder").load("order9!findAllOrders");
	  });
	  
	 
	
	//通过
	  $("#yes").click(function(){
		  var id1=$(this).siblings("#waitpassid").val();
//		  alert(id1);
		  $.get("order5!pass",{"orders.orderid":id1,"state.stateid":3},function(date){
				if(date=="审核成功"){
					alert("审核成功");
				}
				if(date=="审核失败"){
					alert("审核失败");
				}
			});
	  });
	//驳回  
	
	  
	//生产任务单生成
	 $("#downorder").click(function(){	
		 $("#addproductorder").show();	
		 $("#ars").hide();
		 var id=$(this).parents().siblings(".thisorderid").text();
//		 alert(id);
		 $("#addproductorder").load("order14!findByID","orders.orderid="+id);
		
	 });	
	 	 
	$("#orderdown").click(function(){
		var date=$("#productOrder").serialize();
		var id=$("#productOrder input[name='orders.orderid']").val();
//		alert(id);
		 $(':input','#productOrder')    
		 .not(':button, :submit, :reset, :hidden')    
		 .val(' ')    
		 .removeAttr('checked')    
		 .removeAttr('selected');
		 $.post("order15!addProOrders",date,function(date){
			 if(date=="添加成功"){
				 alert("添加成功");
				 $.get("order5!pass",{"state.stateid":7,"orders.orderid":id});
			 }else{
				 alert("添加失败");				
			 }						 
		 });
	});
	
	//生产记录
	$("#jilu").click(function(){
		$("#irs").hide();
		$("#irsmonti").show();
		var id=$(this).parents().siblings(".thisorderid").text();
		$("#irsmonti").load("order17!findProorderByid",{"proorder.proorderid":id});
	});
	
	//添加记录
	$("#addmon").click(function(){
		var dat=$("#productionrecords").serialize();
		$.get("order18!addMon",dat,function(date){
			if(date=="添加成功"){
				alert("成功");		
			}
			else{
				alert("失败");
			}
		});
		
	});
	
	
	  $("#pr").click(function() {
		  $("#teo").hide();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#smoney").hide();
		  $("#ars").hide();
		  $("#irs").hide();
		  $("#irsmonti").hide();		 		  
		//查看所有记录 
		  $("#prsmonti").show();	
		  $("#prsmonti").load("order19!findAllMon",{"first":1});
	  });
	

});