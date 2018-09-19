<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/image/main_logo.ico" rel="shortcut icon">
<title>在线考试系统-</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/easyui/jquery.min.js"></script>
<script type="text/javascript">

    function validpwd(s)
    {
        var patrn=/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$/;
        if (!patrn.exec(s)) {
            return false;
        }
        return true;
    }


    $(function(){
		$("input:first").change(function(){
			var name=$(this).val();
			if(name==""){
				return;
			}
			$.ajax({
				url:'${pageContext.request.contextPath}/checkSignIn.action',
				data:'name='+name,
				type:'post',
				success:function(data){
					if(data==false){
						$("#sp").text("该帐号已有人使用!");
					}else{
						$("#sp").text("");
					}
				}
			})
		})
		$("#subm").click(function(){
			var flag=true;
			$(":text").each(function(){
				var thisVal = $(this).val();
				var thisText=$(this).parent().prev().text();
				if(thisVal==""){
					alert(thisText+"不能为空！");
					flag=false;
					return false;
				}
			})
			if(flag){
				var password1=$("#password1").val();
				var password2=$("#password2").val();
				var spanText = $("#sp").text();
				if(spanText != ""){
					alert("帐号已被注册！");
					return false;
				}
				if(password1=="" || password2==""){
					alert("请输入密码！");
					return false;
				}
                if (validpwd(password1)==false){
                    alert("密码不符合格式！");
                    return false;
                }

                if(password1 != password2){
					alert("两次密码输入不一致！");
					return false;
				}
				return true;
			}
		})
	})
</script>
</head>
<body>
<div style="line-height:80px;height:80px;background-image:url('${pageContext.request.contextPath}/image/.jpg');background-size:cover">
	<font color="white" size="10" face="仿宋" style="font-weight:bold;margin-left:2%">在 线 考 试 系 统</font>
</div>
<div style="margin-top:2%;margin-left:2%">
	<font color="black">当前位置 ： 考生注册</font>
</div>
<center style="margin-top:2%">
	<form action="${pageContext.request.contextPath }/signIn.action" method="post">
		<table cellpadding="6px">
			<tr>
				<td>帐号</td>
				<td><input type="text" name="name"><font id="sp" color="red"></font></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input id="password1" type="password" name="password"></td>
			</tr>
			<tr>
				<td>确认密码</td>
				<td><input id="password2" type="password"></td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					<select name="sex">
						<option value="男">男</option>
						<option value="女">女</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>专业</td>
				<td><input type="text" name="profesion"></td>
			</tr>
			<tr>
				<td><input id="subm" type="submit" value="注册"></td>
				<td align="right"><input type="reset" value="重置"></td>
			</tr>
		</table>
		<br>
		<br>
		<a href="${pageContext.request.contextPath }/jsp/login.jsp">返回登 录</a>
	</form>
</center>
</body>
</html>