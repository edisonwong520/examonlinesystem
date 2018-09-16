# OnlineExamSystem
基于SSM框架开发的一款在线考试系统




项目简介：

前端框架使用的主要是easyui和jquery

后端框架使用的主要是Spring、SpringMVC、MyBatis

数据库使用的mysql

服务器用的是tomcat

开发工具用的是eclipse

主要实现的功能是考生的注册、登录和修改个人信息；根据课程类型随机抽取数据库中的考试题库并显示试题；在考试过程中会有计时功能，时间到了之后自动交卷；
在考生提交试卷后实现自动阅卷功能，并显示本次考试成绩的细节。还可以查看以往所有考试成绩记录，并且可以将这些记录以excel的格式保存到本地。

通过SpringMVC的拦截器实现登录验证，将未登录的游客重定向到登录页面。
通过jstl标签来实现管理员的权限控制，将某些需要超级管理员权限的功能按钮进行<c:if>标签校验是否显示。

通过POI技术实现将考试成绩记录以excel的格式保存到本地。
通过JFreeChart技术实现将各科成绩进行统计，并以图表的形式展现。

使用SpringMVC提供的全局异常处理器进行统一异常处理。



![image](https://github.com/286229825/OnlineExamSystem/blob/master/WebContent/readmePic/01.jpg)
![image](https://github.com/286229825/OnlineExamSystem/blob/master/WebContent/readmePic/02.jpg)
![image](https://github.com/286229825/OnlineExamSystem/blob/master/WebContent/readmePic/03.jpg)
![image](https://github.com/286229825/OnlineExamSystem/blob/master/WebContent/readmePic/04.jpg)
![image](https://github.com/286229825/OnlineExamSystem/blob/master/WebContent/readmePic/05.jpg)
![image](https://github.com/286229825/OnlineExamSystem/blob/master/WebContent/readmePic/06.jpg)
![image](https://github.com/286229825/OnlineExamSystem/blob/master/WebContent/readmePic/11.jpg)
![image](https://github.com/286229825/OnlineExamSystem/blob/master/WebContent/readmePic/12.jpg)
![image](https://github.com/286229825/OnlineExamSystem/blob/master/WebContent/readmePic/13.jpg)
![image](https://github.com/286229825/OnlineExamSystem/blob/master/WebContent/readmePic/14.jpg)
![image](https://github.com/286229825/OnlineExamSystem/blob/master/WebContent/readmePic/15.jpg)
"# examonlinesystem" 
