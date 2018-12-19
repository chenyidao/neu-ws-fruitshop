<%@ page pageEncoding="gb2312"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="gb2312">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>主页</title>



<!-- CSS -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript">

	function addFruitIntoCart(fruitID) {
		//alert(fruitID);
		$.ajax({
			type : "post",
			scriptCharset : 'gbk',
			url : "${pageContext.request.contextPath}/AddToCartServlet",
			/*  data:('#').serialize(),	*/
			data : {
				fruitID : fruitID
			},
			success : function(msg) {
				location.replace(location.href);
			}
		});
	}
	
	

	
</script>

</head>
<table style="width:100%">
	<tr>
		<td><%@ include file="header.jsp"%></td>
	</tr>
	<tr>
		<td>
			<%--begin --%>
			<body>
				<!-- <h2 class="">今日推荐</h2> -->
				<hr>
				<div class="container">
					<div class="row text-center">

						<c:forEach items="${fpb.fruits}" var="f">
							<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
								<div class="thumbnail">
									<img
										src="${pageContext.request.contextPath}/image/${f.fruitName}.jpg"
										alt="Thumbnail Image 1" class="img-responsive">
									<div class="caption">
										<h3>${f.fruitName}</h3>
										<div class="h5" style="color: orange">${f.fruitPrice}元/份</div>
										<div class="h4">${f.fruitDescription}</div>
										
										<!-- ${pageContext.request.contextPath}/AddCartServlet?fruitID=${f.fruitID} -->
										<p>
											<a href="#" onclick="addFruitIntoCart('${f.fruitID}')"
												class="btn btn-primary" role="button"
												style=" background: rgba(38, 80, 91, 0.65)"> 加入购物车</a>
										</p>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>



				<nav class="text-center">
					<!-- Add class .pagination-lg for larger blocks or .pagination-sm for smaller blocks-->
					<ul class="pagination" style="width:20%">
						<li class="page-control"><a aria-label="Previous" id="pre-page"> <span
								aria-hidden="true">&laquo;</span>
						</a></li>
						<li style="display:block;float:left;margin:8px 20px">第${fpb.currentPage }页/共${fpb.totalPage }页</li>
						<li class="page-control"><a
							href="${pageContext.request.contextPath }/PageServlet?currentPage=${fpb.currentPage==fpb.totalPage?fpb.totalPage:fpb.currentPage+1}"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</ul>
				</nav>
				<hr>


				<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
				<script src="js/jquery.min.js"></script>
				<!-- Include all compiled plugins (below), or include individual files as needed -->
				<script src="js/bootstrap.js"></script>
			</body> <%--end --%>
		</td>
	</tr>
</table>
<script>
$("#search").css("display","block");
 	$("#pre-page").click(function(){
 		if(${fpb.currentPage}!=1){
 		window.location.href = "${pageContext.request.contextPath }/PageServlet?currentPage=${fpb.currentPage==0?1:fpb.currentPage-1}";
 		}
 		
	  });
	$("#fruitlist-a").css("border-bottom","2px solid white");
	
</script>
</html>