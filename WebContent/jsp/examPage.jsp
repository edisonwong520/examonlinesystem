<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/image/main_logo.ico" rel="shortcut icon">
<title>在线考试系统-正在考试</title>
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
<script type="text/javascript">
	$(function(){
		show_time(2*60);
		$("#submi").click(function(){
			var b = checkIfselected();
			if(b==false){
				return false;
			}
			var flag=confirm("确定要交卷吗？");
			if(flag){
				return true;
			}else{
				return false;
			}
		})
	})
	function show_time(totalTime){
		if(totalTime==0){
			alert("考试时间结束！系统将会自动提交试卷！");
			$("form").submit(function(){
				checkIfselected();
			});
			return false;
		}
		var remainTime=totalTime-1;
		var min = remainTime/60;
		min=parseInt(min);
		var s=remainTime%60;
		if(s<10){
			s="0"+s;
		}
		var str="0"+min+":"+s;
		$("#sp4").text(str);
		setTimeout("show_time("+remainTime+")",1000);
	}
	
	function checkIfselected(){
		var size = $("input:checkbox:checked").size();
		var size2 = $("input:radio:checked").size();
		if(size<1 && size2<1){
			alert("请至少做一道吧，同学！");
			return false;
		}
	}
	
</script>
</head>
<body class="easyui-layout">
<div data-options="region:'north'" style="line-height:60px;height:80px;background-image:url('${pageContext.request.contextPath}/image/signinback.jpg');background-size:cover">
	<font color="white" size="10" face="仿宋" style="font-weight:bold;margin-left:2%">在 线 考 试 系 统</font>
	<font id="ft1" size="3px" style="margin-left:5%">当 前 考 生：<span id="sp1">${sessionScope.studentName }</span></font>
	<font id="ft3" size="3px" style="margin-left:2%">考 试 限 时：<span id="sp3">2分钟</span></font>
	<font id="ft4" size="3px" style="margin-left:2%">剩 余 时 间：<span id="sp4"></span></font>
</div>

<div data-options="region:'center'">
	<div style="margin-top:2%;margin-left:2%">
		<font size="3px" color="red" style="margin-left:20%">正在考试： </font>
		<br>
		<br>
		<br>
		<center>
		<font size="6px">${list[0].lessonName }&nbsp;&nbsp;&nbsp;&nbsp;考试卷</font>
		</center>
	</div>
	<br>
	<div style="margin-top:2%;margin-left:36%;font-size:15px">
		<form action="${pageContext.request.contextPath }/postExam.action" method="post">
			<% session.setAttribute("xiaowutoken", "xiaowutoken"); %>
			<table cellpadding="20px">
				<tr>
					<td><font style="font-weight:bold">一、单选题</font>（每题10分，答错不得分）</td>
				</tr>
				<c:forEach items="${list }" var="item1" varStatus="varStatus">
					<c:if test="${item1.type eq '单选' }">
						<tr>
							<td>&nbsp;&nbsp;&nbsp;&nbsp;${(varStatus.index+1)}、${item1.subject }<br><br>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="answerMap[${item1.id }]" value="A">A、${item1.optiona }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="radio" name="answerMap[${item1.id }]" value="B">B、${item1.optionb }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="radio" name="answerMap[${item1.id }]" value="C">C、${item1.optionc }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="radio" name="answerMap[${item1.id }]" value="D">D、${item1.optiond }
							</td>
						</tr>
					</c:if>
				</c:forEach>
				<tr>
					<td><font style="font-weight:bold">二、多选题</font>（每题20分，答错不得分）</td>
				</tr>
				<c:forEach items="${list }" var="item2" varStatus="varStatus2">
					<c:if test="${item2.type eq '多选' }">
						<tr>
							<td>&nbsp;&nbsp;&nbsp;&nbsp;${(varStatus2.index+1)}、${item2.subject }<br><br>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="answerMap[${item2.id }]" value="A">A、${item2.optiona }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="checkbox" name="answerMap[${item2.id }]" value="B">B、${item2.optionb }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="checkbox" name="answerMap[${item2.id }]" value="C">C、${item2.optionc }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="checkbox" name="answerMap[${item2.id }]" value="D">D、${item2.optiond }
							</td>
						</tr>
					</c:if>
				</c:forEach>
				<tr>
					<td align="center"><input id="submi" type="submit" style="background:whitesmoke" value="交卷"></td>
				</tr>
			</table>
		<br>
		<br>
		</form>
	</div>
</div>
</body>
</html>