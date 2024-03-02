<%@page import="jdbc.model.vo.Dept"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dept List</title>
</head>
<body>
<h1>Dept List</h1>

<%-- ${volist}<br> --%>

<%
List<Dept> volist = (List<Dept>)request.getAttribute("volist");
	if(volist !=null){
		
	for(Dept vo : volist){
		%>
		<%=vo.getDeptno() %> | <%=vo.getDname() %> | <%=vo.getLoc() %> <br>
		<%
		}
	}
%>

</body>
</html>