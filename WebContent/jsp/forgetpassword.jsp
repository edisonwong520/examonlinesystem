<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="${pageContext.request.contextPath }/image/main_logo.ico" rel="shortcut icon">
    <title>在线考试系统-首页</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath }/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath }/easyui/themes/icon.css">
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/easyui/jquery.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/easyui/locale/easyui-lang-zh_CN.js"></script>

</head>
<body style="background-image:url('${pageContext.request.contextPath}/image/indexback.jpg');background-size:cover">
<div style="margin-top:2%">
    <font color="#01814A" size="12px" face="仿宋" style="font-weight:bold;margin-left:34%">营 养 在 线 考 试 网</font>
    <br>
    <br>

</div>
<div style="margin-top:5%;margin-left:30%">
    <table cellpadding="30px">

        <tr>
            <td>帐&nbsp;号</td>
            <td><input class="easyui-textbox" data-options="iconCls:'icon-man'" name="name"></td>
        </tr>
        <tr>
            <td>密&nbsp;码</td>
            <td><input class="easyui-passwordbox" name="password"></td>
        </tr>       
        <tr>
            <td align="center"><input type="button" id="btn" value="找回密码" style="background:yellow"></td>
        </tr>

    </table>
</div>
<center style="margin-top:5%">
    <font>CopyRight ©: www.xiaowu.com</font>
</center>
</body>
</html>