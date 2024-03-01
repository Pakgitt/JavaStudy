<%@page import="webproject.jdbc.model.vo.Salgrade"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Sallist</title>
</head>
<body>
	<h1>Sallist</h1>
	<%
	List<Salgrade> volist = (List<Salgrade>)request.getAttribute("volist");
	if(volist != null){
		for(Salgrade vo : volist){
			%>
			<%=vo.getGrade() %> | <%=vo.getLosal() %> | <%=vo.getHisal() %> <br>
			<%
		}
	}
	%>
</body>
</html>