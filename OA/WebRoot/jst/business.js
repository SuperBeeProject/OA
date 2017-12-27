$(function() {
	  $("#fo").click(function() {
		  $("#forder").show();	  
		  $("#contact").hide();
		  $("#cgrder").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#aorder").hide();
		  $("#customer").hide();
		  $("#supplier").hide();
	  });

	  $("#ao").click(function() {
		  $("#aorder").show();
		  $("#cgrder").hide();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#forder").hide();
		  $("#customer").hide();
		  $("#supplier").hide();
	  });
	  
	  $("#cg").click(function() {
		  $("#cgrder").show();
		  $("#aorder").hide();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#forder").hide();
		  $("#customer").hide();
		  $("#supplier").hide();
	  });
	  
	  $("#mc").click(function() {
		  $("#customer").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#aorder").hide();
		  $("#forder").hide();
		  $("#supplier").hide();
		  $("#cgrder").hide();
	  });

	  $("#ms").click(function() {
		  $("#supplier").show();
		  $("#contact").hide();
		  $("#attendance").hide();
		  $("#announcement").hide();
		  $("#info").hide();
		  $("#aorder").hide();
		  $("#customer").hide();
		  $("#forder").hide();
		  $("#cgrder").hide();
	  });
	  
	  $("#bs").click(function() {
		  $("#order").show();
		  $("#allorder").hide();
		  $("#custable tr:eq(0)").siblings().empty();
			$.getJSON("order7!findAllCustomer",{"first":1},function(data){
				 var jsonObj=data;		
					$(jsonObj).each(function(){
						
						$("#custable").append("<tr>"+
					         "<td>"+this.customername+"</td>"+
					         "<td>"+this.contacts+"</td>"+                                                                         
					         "<td>"+this.phone+"</td>"+
					         "<td>"+this.address+"</td>"+ 
					         "<td>"+this.levels+"</td>"+
					         "<td>"+"<input id='cc' type='button' value='修改'>"+        				
					         "<input id='dc' type='button' value='删除'></td>"+
					         "</tr>"				               			
						);
					});	
					  $("#cc").click(function() {
						  $("#mcustomer").show();
						  $("#allcustomer").hide();
					  });
			});
	  });

	  $("#bo").click(function() {
		  $("#allorder").show();
		  $("#order").hide();
	  });

//	  $("#cc").click(function() {
//		  $("#mcustomer").show();
//		  $("#allcustomer").hide();
//	  });

	  $("#bc").click(function() {
		  $("#allcustomer").show();
		  $("#mcustomer").hide();
	  });

	  $("#cs").click(function() {
		  $("#msupplier").show();
		  $("#allsupplier").hide();
	  });

	  $("#bs").click(function() {
		  $("#allsupplier").show();
		  $("#msupplier").hide();
	  });
	  
	//生成订单编号  
	  $("#ao").click(function() {
		  var time = new Date();
		   // 程序计时的月从0开始取值后+1
		  var month = (time.getMonth() + 1).toString();
		  var year=time.getFullYear().toString();
		  var dat=time.getDate().toString();
		  var hour=time.getHours().toString();
		  var minute=time.getMinutes().toString();
		  var second=time.getSeconds().toString();
		  var buffer =year+month+dat+hour+minute+second;  
		  $(".orderno").val(buffer);
		
	  });
	  //客户、产品编号
	  $("#ao").click(function() {
		  $(".cutomerNo").empty();
		  $.getJSON("order!findCustomer"," ",function(data){
			  var jsonObj=data;		
				$(jsonObj).each(function(){
					$(".cutomerNo").append(
			            "<option value="+this.customerid+">"+this.customername+"</option>"   			
					);
				});	
			  });
		  
		  $.getJSON("order1!findProduct"," ",function(data1){
			  $(".productid").empty();
			  	var json=data1;		
				$(json).each(function(){
					$(".productid").append(
			            "<option value="+this.productid+">"+this.productname+"</option>"   			
					);
				});	
			  });		    
	  	});
	  //根据产品id查询单位和单价
	  
	  $(".productid").change(function() {
		  var id= $(".productid").val();
		  $.getJSON("order2!findprice","productid="+id,function(data){
			  			  
			  $(".unit").html(data.unit);
			  $(".productprice").html(data.productprice);
		  });
	  });
	  
	  //合计金额改变
	  
	  var num=$(".quantity").val();
	  var price=$(".productprice").html();
	  $(".totalprice").val(num*price);
	  
	  $(".quantity").blur(function() {
		  var num=$(".quantity").val();
		  var price=$(".productprice").html();
		  $(".totalprice").val(num*price);
	  });
	  
	  
	  //添加业务订单
	  $("#addOrder").click(function(){
			var orderAdd=$("#orderAdd").serialize();
			$(':input','#orderAdd')    
			 .not(':button, :submit, :reset, :hidden')    
			 .val(' ')    
			 .removeAttr('checked')    
			 .removeAttr('selected');
			$.get("order3!addOrder",orderAdd,callback,"text");
			
		});
	  function callback(data){
			if(data=="添加成功"){
				alert("添加成功");		
				 
			}else{				
				alert("添加失败");			    
			}			
		};
		
		//采购订单部分
		//生成采购订单编号  
		  $("#cg").click(function() {
			  var time = new Date();
			   // 程序计时的月从0开始取值后+1
			  var month = (time.getMonth() + 1).toString();
			  var year=time.getFullYear().toString();
			  var dat=time.getDate().toString();
			  var hour=time.getHours().toString();
			  var minute=time.getMinutes().toString();
			  var second=time.getSeconds().toString();
			  var buffer =year+month+dat+hour+minute+second;  
			  $(".Procurementnum").val(buffer);
			
		  });
		  //供应商、原料编号
		  $("#cg").click(function() {
			  $(".providerNo").empty();
			  $.getJSON("procurement!findProvider"," ",function(data){
				  var jsonObj=data;		
					$(jsonObj).each(function(){
						$(".providerNo").append(
				            "<option value="+this.providerid+">"+this.providername+"</option>"   			
						);
					});	
				  });
			  
			  $.getJSON("procurement1!findMaterial"," ",function(data1){
				  $(".materialid").empty();
				  	var json=data1;		
					$(json).each(function(){
						$(".materialid").append(
				            "<option value="+this.materialid+">"+this.materialname+"</option>"   			
						);
					});	
				  });		    
		  	});
		  //根据原料id查询单位和单价
		  
		  $(".materialid").change(function() {
			  var id= $(".materialid").val();
			  $.getJSON("procurement2!findprice","materialid="+id,function(data){				  			  
				  $(".Procurementunit").html(data.unit);
				  $(".Procurementprice").html(data.materialprice);
			  });
		  });
		  
		  //合计金额改变
		  
		  var num=$(".Procurementquantity").val();
		  var price=$(".Procurementprice").html();
		  $(".Procurementtotalprice").val(num*price);
		  
		  $(".Procurementquantity").blur(function() {
			  var num=$(".Procurementquantity").val();
			  var price=$(".Procurementprice").html();
			  $(".Procurementtotalprice").val(num*price);
		  });
		  
		  
		  //添加采购订单
		  $("#addprocurement").click(function(){
				var orderAdd=$("#Procurement").serialize();
				$(':input','#orderAdd')    
				 .not(':button, :submit, :reset, :hidden')    
				 .val(' ')    
				 .removeAttr('checked')    
				 .removeAttr('selected');
				$.get("procurement3!addProcurement?employee.employeeid=1",orderAdd,callback,"text");
			});
		  function callback(data){
				if(data=="添加成功"){
					alert("添加成功");				
				}else{				
					alert("添加失败");	
				}
				
			};
			
	//查看所有订单
			
		$(".sale").click(function(){
			$("#chakan").load("order4!findOrder","first=1");
		});
		
		$(".buy").click(function(){
			$("#chakan").load("procurement4!findProcurement","first=1");
		});
		
	//审核订单
		$(".pass").click(function(){
			var id=$(this).parents().siblings(".orderid").text();
			$.get("order5!pass",{"orders.orderid":id,"state.stateid":2},function(date){
				if(date=="审核成功"){
					alert("审核成功");
					$(".table-bordered").load("order4!findOrder","first=1");
				}
				if(date=="审核失败"){
					alert("审核失败");
				}
			});
						
		});
		
	//取消订单
		$(".cancel").click(function(){
			var id=$(this).parents().siblings(".orderid").text();
			$.get("order6!cancel",{"orders.orderid":id,"state.stateid":6},function(date){
				if(date=="取消成功"){
					alert("取消成功");
					$(".table-bordered").load("order4!findOrder","first=1");
				}
				if(date=="取消失败"){
					alert("取消失败");
				}
			});
						
		});
		
	//管理客户
		$("#mc").click(function(){
			$("#custable tr:eq(0)").siblings().empty();
			$.getJSON("order7!findAllCustomer",{"first":1},function(data){
				 var jsonObj=data;		
					$(jsonObj).each(function(){						
						$("#custable").append("<tr>"+
							 "<td style='display:none' class='customerid'>"+this.customerid+"</td>"+
					         "<td class='name1'>"+this.customername+"</td>"+
					         "<td class='contacts1'>"+this.contacts+"</td>"+                                                                         
					         "<td class='phone1'>"+this.phone+"</td>"+
					         "<td class='address1'>"+this.address+"</td>"+ 
					         "<td class='levels1'>"+this.levels+"</td>"+
					         "<td class='remarks1'>"+this.remarks+"</td>"+
					         "<td>"+"<input id='cc' type='button' value='修改'>"+        				
					         "<input id='dc' type='button' value='删除'></td>"+
					         "</tr>"				               			
						);
					});	
					  $("#cc").click(function() {
						var id=$(this).parents().siblings(".customerid").text();
						$("#customername").val($(this).parents().siblings(".name1").text());
						$("#customercontacts").val($(this).parents().siblings(".contacts1").text());
						$("#customerphone").val($(this).parents().siblings(".phone1").text());
						$("#customeraddress").val($(this).parents().siblings(".address1").text());
						$("#levels").val($(this).parents().siblings(".levels1").text());
						$("#customerremarks").val($(this).parents().siblings(".remarks1").text());
						  $("#mcustomer").show();
						  $("#allcustomer").hide();
						  
						//修改	
						$("#mcustomer .change").click(function(){
							var date=$("#mcustomer form").serialize();
							alert(date);
							$.get("order8!updateCustomer?customer.customerid="+id,date,function(data){
								if(data=="修改成功"){
									alert("修改成功");
								}else{
									alert("修改失败");
								}
								
								});
							});
					  });
					
			});			
		});
		
		//管理供应商
		$("#ms").click(function(){
			$("#protable tr:eq(0)").siblings().empty();
			$.getJSON("procurement5!findAllprovider",{"first":1},function(data){
				 var jsonObj=data;		
					$(jsonObj).each(function(){						
						$("#custable").append("<tr>"+
							 "<td style='display:none' class='providerid'>"+this.providerid+"</td>"+
					         "<td class='name1'>"+this.providername+"</td>"+
					         "<td>"+this.types.typename+"</td>"+ 
					         "<td class='address1'>"+this.address+"</td>"+
					         "<td class='phone1'>"+this.phone+"</td>"+					 
					         "<td class='contacts1'>"+this.contacts+"</td>"+
					         "<td class='comments1'>"+this.comments+"</td>"+
					         "<td class='remarks1'>"+this.remarks+"</td>"+
					         "<td>"+"<input id='cc' type='button' value='修改'>"+        				
					         "<input id='dc' type='button' value='删除'></td>"+
					         "</tr>"				               			
						);
					});	
					  $("#cc").click(function() {
						var id=$(this).parents().siblings(".customerid").text();
						$("#providername").val($(this).parents().siblings(".name1").text());
						$("#provideraddress").val($(this).parents().siblings(".address1").text());
						$("#providerphone").val($(this).parents().siblings(".phone1").text());
						$("#providercontacts").val($(this).parents().siblings(".contacts1").text());
						$("#providercomments").val($(this).parents().siblings(".comments1").text());
						$("#providerremarks").val($(this).parents().siblings(".remarks1").text());
						  $("#msupplier").show();
						  $("#allsupplier").hide();
						  
						//修改	
						$("#msupplier .change").click(function(){
							var date=$("#msupplier form").serialize();
							alert(date);
							$.get("procurement6!updateprovider?provider.providerid="+id,date,function(data){
								if(data=="修改成功"){
									alert("修改成功");
								}else{
									alert("修改失败");
								}
								
								});
							});
					  });
					
			});			
		});
		
});