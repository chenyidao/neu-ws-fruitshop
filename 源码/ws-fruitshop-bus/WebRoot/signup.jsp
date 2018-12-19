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
    /*��chrome���Ƴ�input[number]�����¼�ͷ*/

	input::-webkit-outer-spin-button,
	input::-webkit-inner-spin-button{
	    -webkit-appearance: none !important;
	    margin: 0;
	}
	/*��firefox���Ƴ�input[number]�����¼�ͷ*/
	input[type="number"]{-moz-appearance:textfield;}
   
</style>
</head>
<body>
    <div class="sign-left-image" id="left-image">
      <div class="modify-success" id="success" style="display:none">
         	�����ύ��Ϣ��
         </div>
    </div>
    <div class="upgrade-tips" id="upgrade-tips">
        <div class="upgrade-tips-right">
            <a href="index.jsp">������ҳ</a>
            <a href="login.jsp">��¼</a>
        </div>
    </div>
    <!--<div class="login-right" id="right">-->
    <div class="login-right-main" id="right">
        <div class="form">
            <div class="login-title">
                <div class="welcome">��ӭע��Fruit Shop</div>
         <!-- 04302328--zy-->   <div class="header">���ʹ��ߣ���ݶ��� <h5 style="color: red">${regist_msg}</h5></div>         
             
               
              
            </div>
                    
            <!-- end -->
            
            <form id="regist-form" class="input" action="${pageContext.request.contextPath}/SignupServlet" method="post">      
	            <div class="form-group has-feedback">
                    <h4 class="describe">�û�ID</h4>
                    <input id="ID" name="userID" type="number" class="form-control input1"  oninput="if(value.length>10)value=value.slice(0,10)" autocomplete="off"/>
                    <div class="input-error" id="signup-error">${register_msg}</div>
                    <div class="input-error" id="userID-error">�û�ID����6λ!</div>
                    <div class="input-tip" id="userID-tip">����������ID</div>
                </div>
                <div class="form-group has-feedback">
                    <h4 class="describe">�û���</h4>
                    <input id="username" name="userName" type="text" class="form-control input1"
                    autocomplete="off" value="${userInfo.userName}"/>
                     <div class="input-error" id="username-error">�û�������Ϊ��!</div>
                </div>
                <div class="form-group has-feedback">
                    <h4 class="describe">����</h4>
                    <input id="password" name="userPassword" type="password" class="form-control input1" oninput="if(value.length>16)value=value.slice(0,16)" />
                    <div class="input-tip" id="pass-tip">������6��16λ�����ֻ���ĸ</div>
                    <div class="input-error" id="pass-error">���벻��Ϊ��!</div>
                    <div class="input-error" id="pass-error1">����ӦΪ6~16λ��ĸ������!</div>
                </div>
                <div class="form-group has-feedback">
                    <h4 class="describe">ȷ������</h4>
                    <input id="repassword" name="rePassword" type="password" class="form-control input1" />
                      <div class="input-error" id="repass-error1" style="display:none">���벻��Ϊ��!</div>
                    <div class="input-error" id="repass-error2">�����������벻һ��!</div>
                </div>

                <div class="form-group has-feedback">
                    <h4 class="describe">�Ա�${userInfor.userSex}</h4>
                    <select class="select" name="userSex">                
                        <option value="1" ${user.userSex==1?"selected":""} >��</option>                              
                        <option value="0" ${user.userSex==0?"selected":""} >Ů</option>                 
                    </select>
                </div>
                
                <div class="form-group has-feedback">
	                <h4 class="describe">�ֻ�����</h4>
	                <input id="phone" value="${userInfo.userPhoneNumber}"  name="userPhoneNumber" type="number" class="form-control input1" oninput="if(value.length>11)value=value.slice(0,11)"/>
	                <div class="input-error" id="phone-error1">������11λ���ֻ�����!</div>
	            </div>
                
                <div class="form-group has-feedback">
	                <h4 class="describe">��ַ</h4>
	                <input id="address" value="${userInfo.userAddress}" name="userAddress" type="text" class="form-control input1" oninput="if(value.length>30)value=value.slice(0,30)"/>
	                <div class="input-error" id="address-error">��ַ����Ϊ��!</div>
	            </div>
	            <input type="hidden" name="operationStr" value="signup">
	            
            </form>
            <div class="sign-button">
                <input id="signup" type="submit" class="submit" value="ע��" data-style="zoom-in">
            </div>
        </div>
        <div class="footer">
             Copyright  2018 JSP Curriculum Design
        </div>
    </div>
    <!-- onclick="document.getElementById('regist-form').submit();" value="ע��" -->
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
				  //����
				  
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