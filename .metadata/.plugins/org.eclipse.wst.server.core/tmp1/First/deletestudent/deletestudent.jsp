<%@page import="Book1.book1"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>删除学生信息</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="student" class="Student.student"></jsp:useBean>
<jsp:setProperty property="*" name="student"/>
<%
Statement stmt=null;
Connection conn=null;

try{
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection b=DriverManager.getConnection("jdbc:mysql://localhost:3307/four?useUnicode=true&characterEncoding=GBK","root","root");
	   stmt=b.createStatement(); 
	   
	   int stuid=student.getstuid();
	   String stuname=student.getstuname();
	   String sql1="delete from tb_student where stuid='"+stuid+"'";
	    stmt.executeUpdate(sql1);
	    out.println("成功删除!");
	   b.close(); 
  }catch(Exception e){
	   out.print("删除失败！");
	   e.printStackTrace();
   }


%>
<br>
<a href="http://localhost:8080/First/admindeletebook/deletebookindex2.jsp">返回</a>
</body>
</html>