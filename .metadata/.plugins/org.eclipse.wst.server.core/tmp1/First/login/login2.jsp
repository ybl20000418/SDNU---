<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="border2.css" type="text/css" rel="stylesheet">
<meta charset="utf-8">
<title>登录信息</title>
</head>
<body style="background:url(file:///F:/Java/Web%20development%20project/First/WebContent/image/bj2.png);"> 
<form action="http://localhost:8080/First/loginverify/studentverify.jsp" method="post" name="form2" >
<table  style="width:468px;height:262px;background-color:blue;text-align: center;">
			  <tr>
			  	 <th colspan="2" align="center" >学生登录</th>
			  </tr>
			  <tr>
			      <td>学号:&nbsp;<input type="text" style="width: 200px;height: 30px;"  name="stuid"></td>
			  </tr>
			  <tr>
			      <td>密码:&nbsp;<input type="password"  style="width: 200px;height: 30px;"  name="stupwd"></td>
			  </tr>
			  <tr>
			      <td align="center" >
			      <input  formmethod="post" type="submit" style="cursor: pointer;font-style: inherit;" name="submit"  value="登录" >
			         
			      <input type="reset"  style="cursor: pointer;" name=reset  value="重置"></td>
			  </tr>
		 </table>
</body>
</html>
