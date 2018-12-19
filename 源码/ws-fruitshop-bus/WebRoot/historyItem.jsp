<table style="width:100%">
	<tr>
		<td><%@ include file="header.jsp"%></td>
	</tr>
	<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>History Item</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="js/angular.min.js"></script>
<script type="text/javascript">
 function ajaxFun(state,id,money){	
 	var orderID=document.getElementById(id).value;
	$.ajax({
		type:"get",
		/* url:"FindOIByOrderIDServlet", */
		/*  data:('#').serialize(),	*/	
		url:"HistoryOrderController",
		data:{orderID:orderID,orderPayState:state,orderMoney:money,operationStr:"findOrderItem"},
		success:function(msg){
			$("#inPage").html(page);
		}
	});
} 





</script>
</head>
	<body>
	<div>
	<table class="table table-striped">
			<thead class="theadNew">
				<th>历史订单</th>
				<tr>
					<th>序号</th>
					<th>订单号</th>
					<th>收货人</th>
					<th>地址</th>
					<th>联系方式</th>
					<th>收货时间</th>
					<th>提交时间</th>
					<th>状态</th>
					<th>总价</th>
					<th>操作</th>
				</tr>
			</thead>
			<c:forEach items="${orders}" var="order" varStatus="vs">
				<tbody>
					<tr>
						<td>${vs.count}</td>
						<td>${order.orderID}</td>
						<td>${order.orderDeliveryName}</td>
						<td>${order.orderDeliveryAddress }</td>
						<td>${order.orderDeliveryPhoneNumber }</td>
						<td>${order.orderDeliveryTime }</td>
						<td>${order.orderTime }</td>
						<td><c:choose>
								<c:when test="${order.orderPayState==0}">  
						      	 未支付  
						        </c:when>
								<c:when test="${order.orderPayState==1}">  
						   	     待发货 
						    </c:when>
								<c:when test="${order.orderPayState==2}">  
						       	待收货
						    </c:when>
								<c:when test="${order.orderPayState==3}">  
						       	已收货
						    </c:when>
							</c:choose></td>
						<td>${order.orderMoney}</td>
						<th>
						
						<input id="id${vs.count}" name="id${vs.count}" value="${order.orderID}" type="hidden">	
							
								
													
						<button id="ajax${vs.count}" name="ajax${vs.count}"  class="chakan-b" onclick="ajaxFun(${order.orderPayState},'id${vs.count}',${order.orderMoney})" style="display:none">
						
						</button>
					
											
						<button id="chakanbutton" name="chakanbutton${vs.count}" class="chakan-b" data-toggle="modal" data-target="#myModal" style="display:none">
                      		      
                        </button>						
                        <button name="sk${vs.count}" class="chakan-b" >查看 </button>
					</tr>
				</tbody>

			</c:forEach>
		
		</table>
		
	</div>
	<%--${orderItems}--%>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
        <div class="modal-dialog margin-top7">
            <div class="modal-content modal-historyItem">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        历史订单详细信息
                    </h4>
                </div>
                <div id="inPage" class="inpage">
                </div>
                 
               <div class="modal-footer footer-top">
                  
                </div>
            </div>
        </div>
    </div>

    
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script>
	$("button[name^='sk']").click(function(){
		var num = $(this).attr('name').substring(2);
		$("#ajax"+num).click();
		var url = "orderItem.jsp";  
        var data = {type:1};  
        $.ajax({  
            type : "get",  
            async : false,  //同步请求  
            url : url,  
            data : data,  
            timeout:1000,  
            success:function(dates){  
                //alert(dates);  
                $("#inPage").html(dates);//要刷新的div  
            },  
            error: function() {  
               // alert("失败，请稍后再试！");  
            }  
        });  
        $("#chakanbutton").click();
	
	});
	 
	</script>

	</body>
</table>
</html>
