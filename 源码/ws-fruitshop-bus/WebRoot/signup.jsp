<%@ page pageEncoding="gb2312"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="gb2312">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sign up</title>
    <!-- CSS -->
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
	<script src="http://code.jquery.com/jquery-latest.js"></script>
    <style>
    *{
    transition: all .2s;
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
   
</style>
</head>
<body>
    <div class="sign-left-image" id="left-image">
      <div class="modify-success" id="success" style="display:none">
         	正在提交信息…
         </div>
    </div>
    <div class="upgrade-tips" id="upgrade-tips">
        <div class="upgrade-tips-right">
            <a href="index.jsp">返回首页</a>
            <a href="login.jsp">登录</a>
        </div>
    </div>
    <!--<div class="login-right" id="right">-->
    <div class="login-right-main" id="right">
        <div class="form">
            <div class="login-title">
                <div class="welcome">欢迎注册Fruit Shop</div>
         <!-- 04302328--zy-->   <div class="header">新鲜果蔬，便捷订购 <h5 style="color: red">${regist_msg}</h5></div>         
             
               
              
            </div>
                    
            <!-- end -->
            
            <form id="regist-form" class="input" action="${pageContext.request.contextPath}/SignupServlet" method="post">      
	            <div class="form-group has-feedback">
                    <h4 class="describe">用户ID</h4>
                    <input id="ID" name="userID" type="number" class="form-control input1"  oninput="if(value.length>10)value=value.slice(0,10)" autocomplete="off"/>
                    <div class="input-error" id="signup-error">${register_msg}</div>
                    <div class="input-error" id="userID-error">用户ID不足6位!</div>
                    <div class="input-tip" id="userID-tip">请输入您的ID</div>
                </div>
                <div class="form-group has-feedback">
                    <h4 class="describe">用户名</h4>
                    <input id="username" name="userName" type="text" class="form-control input1"
                    autocomplete="off" value="${userInfo.userName}"/>
                     <div class="input-error" id="username-error">用户名不能为空!</div>
                </div>
                <div class="form-group has-feedback">
                    <h4 class="describe">密码</h4>
                    <input id="password" name="userPassword" type="password" class="form-control input1" oninput="if(value.length>16)value=value.slice(0,16)" />
                    <div class="input-tip" id="pass-tip">请输入6到16位的数字或字母</div>
                    <div class="input-error" id="pass-error">密码不能为空!</div>
                    <div class="input-error" id="pass-error1">密码应为6~16位字母或数字!</div>
                </div>
                <div class="form-group has-feedback">
                    <h4 class="describe">确认密码</h4>
                    <input id="repassword" name="rePassword" type="password" class="form-control input1" />
                      <div class="input-error" id="repass-error1" style="display:none">密码不能为空!</div>
                    <div class="input-error" id="repass-error2">两次密码输入不一致!</div>
                </div>

                <div class="form-group has-feedback">
                    <h4 class="describe">性别${userInfor.userSex}</h4>
                    <select class="select" name="userSex">                
                        <option value="1" ${user.userSex==1?"selected":""} >男</option>                              
                        <option value="0" ${user.userSex==0?"selected":""} >女</option>                 
                    </select>
                </div>
                
                <div class="form-group has-feedback">
	                <h4 class="describe">手机号码</h4>
	                <input id="phone" value="${userInfo.userPhoneNumber}"  name="userPhoneNumber" type="number" class="form-control input1" oninput="if(value.length>11)value=value.slice(0,11)"/>
	                <div class="input-error" id="phone-error1">请输入11位的手机号码!</div>
	            </div>
                
                <div class="form-group has-feedback">
	                <h4 class="describe">地址</h4>
	                <input id="address" value="${userInfo.userAddress}" name="userAddress" type="text" class="form-control input1" oninput="if(value.length>30)value=value.slice(0,30)"/>
	                <div class="input-error" id="address-error">地址不能为空!</div>
	            </div>
	            <input type="hidden" name="operationStr" value="signup">
	            
            </form>
            <div class="sign-button">
                <input id="signup" type="submit" class="submit" value="注册" data-style="zoom-in">
            </div>
        </div>
        <div class="footer">
             Copyright  2018 JSP Curriculum Design
        </div>
    </div>
    <!-- onclick="document.getElementById('regist-form').submit();" value="注册" -->
    <script type="text/javascript">
		$(document).ready(function(){
			 $("#signup").click(function(){
				 $("#username-error").css("display","none");
				 $("#pass-error").css("display","none");
				 $("#pass-error1").css("display","none");
				 $("#repass-error1").css("display","none");
				  $("#repass-error2").css("display","none");
				  $("#userID-error").css("display","none");
				  $("#address-error").css("display","none");
				  $("#phone-error1").css("display","none");
				  //拦截
				  
				  switch(true){
					  case $("#ID").val().length<6:
					      $("#ID").css("border-color","rgba(204, 0, 0, 0.88)");
					 	  $("#userID-error").css("display","block");
					 	break;
					  case $("#username").val() =="":
						  $("#username").css("border-color","rgba(204, 0, 0, 0.88)");
						  $("#username-error").css("display","block");
						 	break;
					  case $("#password").val() =="":
						  $("#password").css("border-color","rgba(204, 0, 0, 0.88)");
						  $("#pass-error").css("display","block");
						  break;
						  
					  case $("#repassword").val() !=$("#password").val():
						  $("#repassword").css("border-color","rgba(204, 0, 0, 0.88)");
						  $("#repass-error1").css("display","block");
						  break;
					  case $("#phone").val() =="":
						  $("#phone").css("border-color","rgba(204, 0, 0, 0.88)");
						  $("#phone-error1").css("display","block");
						  break;
					  case $("#address").val() =="":
						  $("#address").css("border-color","rgba(204, 0, 0, 0.88)");
						  $("#address-error").css("display","block");
						  break;
					  default:
								$("#right").hide();
					         $("#upgrade-tips").hide();
					        $("#success").css("display","block");
					        $("#left-image").animate({left:'250px'},0600);
					       	setTimeout("document.getElementById('regist-form').submit();","1500");
				  }
				  
				  
				
			  });
			 
			 $("#password").blur(function(){
				  if( $("#password").val() ==""){
					  $("#password").css("border-color","rgba(204, 0, 0, 0.88)");
					  $("#pass-error").css("display","block");
				  }
				  else if( $("#password").val().length<6){
					  $("#password").css("border-color","rgba(204, 0, 0, 0.88)");
					  $("#pass-error1").css("display","block");
				  }
				  else
					  $("#password").css("border-color","rgba(189, 189, 189, 0.82)");
				  $("#pass-tip").css("display","none");
			  })
			   $("#password").focus(function(){
				  $("#password").css("border-color","rgba(22, 71, 90, 0.58)");
				  $("#pass-error").css("display","none");
				  $("#pass-error1").css("display","none");
				  $("#pass-tip").css("display","block");
			  })
			   
			   $("#repassword").blur(function(){
				   if($("#repassword").val() == ""){
					   $("#repassword").css("border-color","rgba(204, 0, 0, 0.88)");
						  $("#repass-error1").css("display","block");
				   }
			   		else if( $("#repassword").val()!=$("#password").val() ){
					  $("#repassword").css("border-color","rgba(204, 0, 0, 0.88)");
					  $("#repass-error2").css("display","block");
				  }
			   		else
						  $("#repassword").css("border-color","rgba(189, 189, 189, 0.82)");
			  })
			   $("#repassword").focus(function(){
				  $("#repassword").css("border-color","rgba(22, 71, 90, 0.58)");
				  $("#repass-error1").css("display","none");
				  $("#repass-error2").css("display","none");
			  })
			   $("#username").blur(function(){
				  if( $("#username").val() ==""){
					  $("#username").css("border-color","rgba(204, 0, 0, 0.88)");
					  $("#username-error").css("display","block");
				  }
				  else
					  $("#username").css("border-color","rgba(189, 189, 189, 0.82)");
			  })
			   $("#username").focus(function(){
				  $("#username").css("border-color","rgba(22, 71, 90, 0.58)");
				  $("#username-error").css("display","none");
			  })
			    $("#ID").blur(function(){
				  if( $("#ID").val().length<6){
					  $("#ID").css("border-color","rgba(204, 0, 0, 0.88)");
					  $("#userID-error").css("display","block");
				  }
				  else
					  $("#ID").css("border-color","rgba(189, 189, 189, 0.82)");
				  $("#userID-tip").css("display","none");
			  })
			   $("#ID").focus(function(){
				  $("#ID").css("border-color","rgba(22, 71, 90, 0.58)");
				  $("#userID-error").css("display","none");
				  $("#userID-tip").css("display","block");
			  })
			  $("#phone").blur(function(){
				  if( $("#phone").val().length != 11){
					  $("#phone").css("border-color","rgba(204, 0, 0, 0.88)");
					  $("#phone-error1").css("display","block");
				  }
			  })
			   $("#phone").focus(function(){
				  $("#phone").css("border-color","rgba(22, 71, 90, 0.58)");
				  $("#phone-error1").css("display","none");
			  })
			  $("#address").blur(function(){
				  if( $("#address").val() ==""){
					  $("#address").css("border-color","rgba(204, 0, 0, 0.88)");
					  $("#address-error").css("display","block");
				  }
			  })
			   $("#address").focus(function(){
				  $("#address").css("border-color","rgba(22, 71, 90, 0.58)");
				  $("#address-error").css("display","none");
			  })
			});
    </script>
</body>
</html>