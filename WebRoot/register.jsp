<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>�û�ע��</title>


<script type="text/javascript">
	 function checkRegister()
	{
		
		var pwd=document.getElementById("pwd").value;
		if(pwd=="")
		{
			alert("����������");
			return false;
		}
		var confirm=document.getElementById("confirm").value;
		if(confirm=="")
		{
			alert("������ȷ������");
			return false;
		}
		if(pwd!=confirm)
		{
		   alert("�����������벻һ��");
		   return false;
		}
		
	   var email=document.getElementById("email").value;
       var phone=document.getElementById("phone").value;
    
       var patrnP=/(^(\d{3,4}-)?\d{7,8})$|(13[0-9]{9})$|(15[0-9]{9})$/; 
    
       if(phone=="")
    {
        alert("��ϵ�绰����Ϊ��");
        return false;
    }
    if(!patrnP.exec(phone)){
       alert("��ϵ�绰�����ʽ����ȷ");
       return false;
    }
       
    var patrnE=/^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
    if(email!="" && !patrnE.exec(email))
    {
       alert("�������������ʽ����ȷ");
       return false;
    }
    if(!confirm("ȷ����")){
       return false;
    } 
     alert("ע��ɹ���");
    return true ;
  }
		
</script>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		
		<link href="MyCSS/loginregist.css" rel="stylesheet" type="text/css">
	
	<div class="logoContainer">
		<div class="logo">
			<div id="logo">
				<a href="index.jsp"><img src="images/logoHouse.png" alt="" /></a>
			</div>
			<nav>
				<ul>
					<li class="active">
						<a href="index.jsp">������ҳ</a>
					</li>
					<li class="active">
						<a href="login.jsp">ֱ�ӵ�¼</a>
					</li>
				</ul>
			</nav>
			<div class="clearfloat"></div>
		</div>
	</div>
	</head>

	<body>
		<div class="wrapper">
	 	<h1>�û�ע��</h1>
		<form action="register" method="post" onsubmit="return checkRegister();">
			<div class="contentBody">
				<div class="cBlock">
					<h2>�˻�ע��</h2>
					 <ul>
            			<li><h3>�û���:</h3>
            			<input type="text" name="user.uname"  style="width:200px; height:30px;" /> &nbsp;<font color="red">${message}</font>
            			</li>
						<li><h3>����:</h3></li>
            			<input type="password" id="pwd" name="user.upwd"  style="width:200px; height:30px;" />
            			  
						<li><h3>ȷ������:</h3></li>
            			<input  type="password" name="password2" id="confirm"  style="width:200px; height:30px;" />
            			
            			<li><h3>�绰����:</h3></li>
            			<input type="text" name="user.phone" id="phone"  style="width:200px; height:30px;" />
            			
						<li><h3>��������:</h3></li>
            			<input type="text" name="user.email" id="email"  style="width:200px; height:30px;" />   
            			
            			   
            			
            			<li><a href="agreement.jsp">�Ķ��û�ʹ��Э��</a></li>
            			<br>
            			<br>
						<input type="submit" value="�ύ" style="width:50px; height:30px;" />
							&nbsp;&nbsp;&nbsp;
						<input type="reset" value="����"  style="width:50px; height:30px;"/>
						<br>
						<br>
						<br>
					</ul>
				</div>
			</div>
		</form>
		<div class="clearfloat"></div>
	</div>
	
	<footer>
    	<p class="copyright">
        	Copyright &copy; <a href="#">���������</a> | Collect Form <a href="" title="ShortRent">ShortRent</a>
   		 </p>
	</footer>
		
	</body>
</html>
