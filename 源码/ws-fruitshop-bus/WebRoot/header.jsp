<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Fruit Shop</title>
   <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/37a15afd4f2f.css">
    <link rel="stylesheet" type="text/css" href="css/header.css">
    <style>

    .bar8 form {
    position:relative;
		width:300px;
		margin:0 auto;
    margin-top:30px;
    margin-right:13%;
    display:none;
    margin-top:40px;
	height:42px;
	}
	.bar8 input {
	border:none;
		outline:none;
	width:100%;
		height:42px;
		padding-left:13px;
		width:0;
		padding:0 42px 0 15px;
		border-bottom:2px solid transparent;
		background:transparent;
		transition:.3s linear;
		position:absolute;
		top:0;
		right:0;
		z-index:2;
	}
	.bar8 input:focus {
		width:300px;
		z-index:1;
		<%--border-bottom:2px solid #F9F0DA;--%>
		border-bottom:1px solid #fff;
	}
	.bar8 button {
	border:none;
		outline:none;
	height:42px;
		width:70px;
		cursor:pointer;
		position:absolute;
		border:.1em solid #fff;
		border-radius: 2px;
		background:rgba(0,0,0,0);
		top:0;
		right:0;
	}
	
    </style>
    <script type="text/javascript">
    function logout(){	
		$.ajax({
			type : "get",
			url : "${pageContext.request.contextPath}/LogoutServlet",			
			data : {
			},
			success : function(msg) {
				window.location.href="${pageContext.request.contextPath}/index.jsp";
			}
		});
}
    </script>
    
</head>
<body class="about site" cz-shortcut-listen="true">
<div class="navbar">
    <div class="container containerNew">
        <a class="navbar-brand" href="/"></a>
        <ul class="nav navbar-nav">
            <li><a href="index.jsp" class="nav-features">首页</a></li>
            <li><a href="${pageContext.request.contextPath}/PageServlet"   class="">全部水果</a></li>
            <c:if test="${not empty user}">    
            <li><a href="shoppingCart.jsp" class="">购物车</a></li>
            </c:if>          
            <c:if test="${empty user}">
            <li><a href="login.jsp" class="">购物车</a></li>
            </c:if>
            <li><a href="${pageContext.request.contextPath}/HistoryOrderController?operationStr=findHistoryOrder" class="">历史订单</a></li>
         
            
            
            
            
           <c:if test="${not empty user}">
	       	<li>
                       
       			<a href="" class=""><span >${user.userName}</span></a>
            </li>
            <li><a href="#" onclick="logout()" id="">注销</a></li>
            </c:if>
            
            <c:if test="${empty user}">
            <li><a href="login.jsp">Log in</a></li>
            <li><a href="signup.jsp" class="btn signup-link">Sign up</a></li>
            </c:if>
        </ul>
    </div>
</div>
<div class="background">
    <h1>Fruit Shop
   <%--  <div class="search bar8" style="font-size:16px" >
        <form id="search" action="${pageContext.request.contextPath}/SearchServlet" method="post">
  
        <input type="text" placeholder="请输入水果名" style="font-size:16px;" name="blurStr">
     
            
            <button type="submit">Search</button>
        </form>
	</div> --%>
    </h1>
</div>
	   <%--  <div class="wrap">
        <div class="header">
            <div class="logo headerTitle">
                <a>FruitShop</a>
            </div>
            <div class="log_reg">
                <ul>
                    <li><a>Login</a> </li>
                    <span class="log"> or </span>
                    <li><a href="register.html">Register</a> </li>
                    <div class="clear"></div>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    <div class="wrap">
        <div class="header">
            <div class="menu-style">
                <ul class="nav navbar-nav">
                    <li><a href="index.jsp">首页</a></li>
                    <li><a href="${pageContext.request.contextPath}/PageServlet">全部水果</a></li>
                    <li><a href="shoppingCart.jsp">购物车</a></li>
                    <li><a href="historyItem.jsp">历史订单</a> </li>
                    <li><a href="">联系我们</a></li>
                </ul>
            </div>
            <div class="web_search">
                <form>
                    <input type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">
                    <input type="submit" value=" " />
                </form>
            </div>
            <div class="search-logo"><div class="icon-search"></div></div>
            <div class="clear"></div>
        </div>
    </div> --%>
 
</body>
</html>