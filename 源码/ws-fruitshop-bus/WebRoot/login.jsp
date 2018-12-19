<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="gb2312">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Log in</title>
    <!-- CSS -->
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <style>
    *{
    transition: all .2s;
    }
    @media screen and (min-height: 0px) and (max-height: 400px){
	    #left-image{
	    	background-size: 100% auto;
	    }
    }
    @media screen and (min-width: 0px) and (max-width: 800px) {
	    #left-image{
	    display: none;
	    }
	    #right{
	    margin-left: 0px;
	    }
    }
    
    
     /*在chrome下移除input[number]的上下箭头*/

	input::-webkit-outer-spin-button,
	input::-webkit-inner-spin-button{
	    -webkit-appearance: none !important;
	    margin: 0;
	}
	/*在firefox下移除input[number]的上下箭头*/
	input[type="number"]{-moz-appearance:textfield;}
    
    /*@media screen and (min-width: 601px) and (max-width: 1000px) {*/
    /*#left-image{*/
    /*background: url('image/login4.png')no-repeat 0px 0px ;*/
    /*width: 40%;*/
    /*}*/
    /*#right{*/
    /*width: 60%;*/
    /*}*/
    /*}*/
</style>
</head>
<body>
    <div class="login-left-image" id="left-image">
    <div class="modify-success" id="success" style="display:none">
         	登录中…
         </div>
    </div>
    <div class="upgrade-tips" id="upgrade-tips">
        <div class="upgrade-tips-right">
            <a href="index.jsp">返回首页</a>
            <a href="signup.jsp">注册</a>
        </div>
    </div>
    <!--<div class="login-right" id="right">-->
    <div class="login-right-main" id="right">
        <div class="form">
            <div class="login-title">
                <div class="welcome">欢迎登陆Fruit Shop</div>
                <div class="header">新鲜果蔬，便捷订购</div>
            <!-- 登录失败提示 -->    
                <h5 style="color: red">${msg_login}</h5>    
            </div>
            <form id="login-form" class="input" action="${pageContext.request.contextPath}/LoginServlet" method="post">
            <input name="operationStr" value="login" type="hidden">
	            <div class="form-group has-feedback">
	                <input id="scholar" name="userID" type="number" class="form-control " placeholder="用户ID"
	                autocomplete="off"/>
	                 <div class="input-error" id="scholar-error" style="display:none">!用户ID不能为空</div>
	                 <div class="input-error" id="scholar-error2" style="display:none">!用户ID不能为空</div>
	            </div>
	            <div class="form-group has-feedback">
	                <input id="password" name="userPassword" type="password" class="form-control input1" placeholder="密码"/>
	                 <div class="input-error" id="pass-error" style="display:none">!密码不能为空</div>
	            </div>
            </form>
            <div class="log-button">
                <input id="login" type="submit" class="submit" value="登录" data-style="zoom-in">
            </div>
        </div>
        <div class="footer">
            
        </div>
    </div>
    <script type="text/javascript">
	    function modify(){
			setTimeout("hidden()","00"); 
		}
		function hidden(){
			document.getElementById('right').style.display="none";
			document.getElementById('left-image').style.display="none";
			var body = document.body;
			body.style.backgroundImage="url(image/all1.jpg)";
			body.style.width="100px";
			body.style.height="100%";
		}
		$(document).ready(function(){
			  $("#login").click(function(){
				  //拦截
				  if( $("#scholar").val() ==""){
					  $("#scholar").css("border-color","rgba(204, 0, 0, 0.88)");
					  $("#scholar-error").css("display","block");
				  }
				  if( $("#password").val() ==""){
					  $("#password").css("border-color","rgba(204, 0, 0, 0.88)");
					  $("#pass-error").css("display","block");
				  }
				  else{
				  //数据无误，传后台
				  	$("#right").hide();
			        $("#upgrade-tips").hide();
			        $("#success").css("display","block");
			        $("#left-image").animate({left:'250px'},0600);
			        setTimeout("document.getElementById('login-form').submit()","1500")
					  
				  }
			  });
			  $("#password").blur(function(){
				  if( $("#password").val() ==""){
					  $("#password").css("border-color","rgba(204, 0, 0, 0.88)");
					  $("#pass-error").css("display","block");
				  }
			  })
			   $("#password").focus(function(){
				  $("#password").css("border-color","rgba(189, 189, 189, 0.82)");
				  $("#pass-error").css("display","none");
			  })
			   $("#scholar").blur(function(){
				  if( $("#scholar").val() ==""){
					  $("#scholar").css("border-color","rgba(204, 0, 0, 0.88)");
					  $("#scholar-error").css("display","block");
				  }
			  })
			   $("#scholar").focus(function(){
				  $("#scholar").css("border-color","rgba(189, 189, 189, 0.82)");
				  $("#scholar-error").css("display","none");
			  })
			});
    </script>
</body>
</html>