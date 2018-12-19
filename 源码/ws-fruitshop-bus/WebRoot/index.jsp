<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Fruit Shop</title>
    <!-- CSS -->
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/37a15afd4f2f.css" type="text/css">
    <link rel="stylesheet" href="css/header.css" type="text/css">
    <link href="css/sequence-theme.mono.css" rel="stylesheet" media="all">

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
<body class="homepage site">
<div id="sequence" class="seq">
    <div class="navbar">
        <div class="container containerNew">
            <a class="navbar-brand" href=""></a>
            <ul class="nav navbar-nav">
    		<li><a href="index.jsp" class="nav-features">首页</a></li>
    		 <li class="sep"></li>
             <li ><a href="${pageContext.request.contextPath}/PageServlet" class="">全部水果</a></li>	
              <li class="sep"></li>
          	<c:if test="${not empty user}">    
            <li><a href="shoppingCart.jsp" class="">购物车</a></li>
             <li class="sep"></li>
            </c:if>  
             
            <c:if test="${empty user}">
            <li><a href="login.jsp" class="">购物车</a></li>
             <li class="sep"></li>
            </c:if>      
            <li><a href="${pageContext.request.contextPath}/HistoryOrderController?operationStr=findHistoryOrder" class="">历史订单</a></li> <!-- 该Servlet再后台实现登录判断 -->             
            <li class="sep"></li>
            
            
            <c:if test="${not empty user}">
            <!-- <li class="dropdown"> -->
            <li>
                            <a class="dropdown-toggle" data-toggle="dropdown" id="username">${user.userName}
                                <!-- <span class="caret"></span></a> -->
                            <%-- <ul class="dropdown-menu">
                                <li>
                                    <a href="${pageContext.request.contextPath}/modifyUserInfo.jsp">修改信息</a>
                                </li>
                            </ul> --%>
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
    <ul class="seq-canvas">
        <li class="seq-step1 seq-valign seq-in">
            <div class="seq-vcenter">
                <img data-seq class="seq-feature" src="images/bananas.png" alt="A cartoon illustration of a bunch of bananas" width="389" height="300" srcset="images/bananas.png 1x, images/bananas@2x.png 2x" />
                <h2 data-seq class="seq-title">Bananas</h2>
            </div>
        </li>

        <li class="seq-step2 seq-valign">
            <div class="seq-vcenter">
                <img data-seq class="seq-feature" src="images/coconut.png" alt="A cartoon illustration of half a coconut" width="325" height="300" srcset="images/coconut.png 1x, images/coconut@2x.png 2x" />
                <h2 data-seq class="seq-title">Coconut</h2>
            </div>
        </li>

        <li class="seq-step3 seq-valign">
            <div class="seq-vcenter">
                <img data-seq class="seq-feature" src="images/orange.png" alt="A cartoon illustration of a round orange" width="350" height="300" srcset="images/orange.png 1x, images/orange@2x.png 2x" />
                <h2 data-seq class="seq-title">Orange</h2>
            </div>
        </li>
    </ul>

    <fieldset class="seq-nav" aria-label="Slider buttons" aria-controls="sequence">

        <button type="button" class="seq-prev" aria-label="Previous">
            <img src="images/prev.svg" alt="Previous" />
        </button>

        <ul role="navigation" aria-label="Pagination" class="seq-pagination">
            <li class="seq-current">
                <a href="#step1" rel="step1" title="Go to bananas">
                    <img src="images/tn-bananas@2x.png" alt="Bananas" width="50" height="40" />
                </a>
            </li>
            <li>
                <a href="#step2" rel="step2" title="Go to coconut">
                    <img src="images/tn-coconut@2x.png" alt="Coconut" width="50" height="40" />
                </a>
            </li>
            <li>
                <a href="#step3" rel="step3" title="Go to orange">
                    <img src="images/tn-orange@2x.png" alt="Orange" width="50" height="40" />
                </a>
            </li>
        </ul>

        <button type="button" class="seq-next" aria-label="Next">
            <img src="images/next.svg" alt="Next" />
        </button>
    </fieldset>
</div>


<div style="text-align:center;clear:both">
    <script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
    <script src="/follow.js" type="text/javascript"></script>
</div>
<div class="introduce">
    <h2>欢迎使用水果商店</h2>
    <p class="lead">
        新鲜果蔬在线订购，送单到寝
    </p>
</div>

<footer class="text-center">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <p> Copyright  2018 JSP Curriculum Design</p>
            </div>
        </div>
    </div>
</footer>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="scripts/imagesloaded.pkgd.min.js"></script>
<script type="text/javascript" src="scripts/hammer.min.js"></script>
<script type="text/javascript" src="scripts/sequence.min.js"></script>
<script type="text/javascript" src="scripts/sequence-theme.mono.js"></script>
</body>
</html>
<%-- <table style="width:100%">
<tr>
<td><%@ include file="header.jsp" %></td>
</tr>
<tr>
<td><%@ include file="homepage.jsp" %></td>
</tr>
</table> --%>