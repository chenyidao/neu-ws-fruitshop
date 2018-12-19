<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>购物车</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/final.css">
<script src="js/angular.min.js"></script>
<script>
	$("#history-a").css("border-bottom","2px solid white");
</script>
<style>
</style>
<script>

	function changeNum(id, num, totalCount) {
		num = parseInt(num);
		totalCount = parseInt(totalCount);
		//alert(num);
		if (num < 1) {
			if (confirm("是否确认要删除此商品？")) {
				num = 0;
			} else {
				num = 1;
			}
		}

		if (num > totalCount) {
			alert("购买数量不能大于库存数量！");
			num = totalCount;
		}

		//alert("后台session正在处理");
		location.href = "${pageContext.request.contextPath}/ChangeNumServlet?fruitID=" + id + "&num=" + num;
	}
</script>
</head>
<table style="width:100%">
	<tr>
	<td>
		<%@ include file="header.jsp" %>
	</td>
	</tr>
	<tr>
		<td>
			<%--begin --%>
			<body>
				<div class="spmain">
					<div>
						<table class="table table-striped">
							<thead class="theadNew">
								<tr>
									<th>序号</th>
									<th>商品名</th>
									<th>单价</th>
									<th>数量</th>
									<th>库存</th>
									<th>小计</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:set var="sum" value="0"></c:set>
								
							
								<c:forEach items="${cart }" var="entry" varStatus="vs">
									<tr>
										<td>${vs.count }</td>
										<td>${entry.key.fruitName }</td>
										<td>${entry.key.fruitPrice }</td>
										<td>
											<input type="button" value='&laquo;' style="width:20px"
											onclick="changeNum('${entry.key.fruitID}','${entry.value-1}','${entry.key.fruitReserve}')">
			
											<input name="text" type="text" value="${entry.value}"
											style="width:40px;text-align:center"disabled="disabled" /> 
											
											<input type="button"
											value='&raquo;' style="width:20px"
											onclick="changeNum('${entry.key.fruitID}','${entry.value+1 }','${entry.key.fruitReserve}')">
										</td>
			
										<td>${entry.key.fruitReserve-entry.value}</td>
										<td>${entry.value*entry.key.fruitPrice}</td>
			
										<th><a href="${pageContext.request.contextPath}/ChangeNumServlet?fruitID=${entry.key.fruitID}&num=0">删除</a></th>
										<c:set var="sum" value="${sum+entry.value*entry.key.fruitPrice}"></c:set>
									</tr>
								</c:forEach>
								
								
								
						</table>
			
						<table>
							<tr>
								<td style="text-align:right; padding-right:40px;"><font
									style="color:#FF6600; font-weight:bold">合计：&nbsp;&nbsp;${sum}元</font>
								</td>
							</tr>
						</table>
			
						<div class="sc-bottom">
							<div class="sc-bottom-button">
								<a><button class="jiesuan"  data-toggle="modal" data-target="#myModal">结算</button></a>
							</div>
						</div>
					</div>
				</div>
				
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
			        <div class="modal-dialog margin-top7">
			            <div class="modal-content modal-historyItem">
			                <div class="modal-header">
			                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
			                        &times;
			                    </button>
			                    <h4 class="modal-title" id="myModalLabel">
			                        加入购物车
			                    </h4>
			                </div>
			                <div id="inPage" class="inpage">
			                </div>
			                 <!--  -->

			                 <div class="intospc">

								<table class="table table-striped">
									<thead class="theadNew">
										<tr>
											<th>序号</th>
											<th>商品名</th>
											<th>单价</th>
											<th>数量</th>

											<th>小计</th>

										</tr>
									</thead>
									<tbody>
									<c:set var="sum" value="0"></c:set>   <!-- 重置sum -->

										<c:forEach items="${cart }" var="entry" varStatus="vs">
											<tr>
												<td>${vs.count }</td>
												<td>${entry.key.fruitName }</td>
												<td>${entry.key.fruitPrice }</td>
												<td>${entry.value}</td>
												<td>${entry.value*entry.key.fruitPrice}</td>
												<c:set var="sum"  value="${sum+entry.value*entry.key.fruitPrice}" ></c:set>
											</tr>
										</c:forEach>
								</table>
								<div class="receiver">
								<form id="infor-form" class="myform" action="${pageContext.request.contextPath}/CreateOrderServlet" method="post">

									<div class="form-group">
										<h4 class="col-sm-3 control-label">收货人姓名</h4>
										<input id="username" name="orderDeliveryName" type="text" class="form-control" value="${user.userName}"
											   autocomplete="off"/>
									</div>
									 <div class="form-group has-feedback">
										<h4 class="col-sm-3 control-label">手机号码</h4>
										<input id="phoneNumber" name="orderDeliveryPhoneNumber" type="text"  value="${user.userPhoneNumber}" class="form-control"/>
									</div>

									 <div class="form-group">
										<h4 class="col-sm-3 control-label">配送地址</h4>
										<input id="address" name="orderDeliveryAddress" type="text"  value="${user.userAddress}" class="form-control" />
									</div>


									 <div class="form-group has-feedback">
										<h4 class="col-sm-3 control-label">配送时间</h4>
										<input id="" name="orderDeliveryTime" type="datetime-local" value="2018-02-24T14:00" class="form-control" />
									</div>

								   <input type="hidden" name="orderMoney" value="${sum}"/>
								</form>
								<table>
									<tr>
										<td style="text-align:right; padding-right:40px;"><font
											style="color:#FF6600; font-weight:bold">合计：&nbsp;&nbsp;${sum}元</font>
										</td>
									</tr>
								</table>
								</div>
							  
							</div>
			               <div class="modal-footer">
			                    <button type="button" class="jiesuan" id="submitupload" onclick="document.getElementById('infor-form').submit();" data-style="zoom-in">
			                        <span class="ladda-label">提交</span>
			                    </button>
			            </div>
			        </div>
			    </div>
			</body>
			
			<%--end --%>
		</td>
	</tr>
</table>
   <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script>
	
		$("#spc-a1").css("border-bottom","2px solid white");
		$("#spc-a2").css("border-bottom","2px solid white");
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
</html>