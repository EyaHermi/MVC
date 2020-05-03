<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="client" class="modele.Client" scope="session" />
<h2>Nom:
<jsp:getProperty property name="client"
property="nom"/>
</h2>
<h2>Prénom:
<jsp:getProperty property name="client"
property="prenom"/>
</h2>
<h2>Adresse:
<jsp:getProperty property name="client"
property="Adresse"/>
</h2>
<h2>telephone:
<jsp:getProperty property name="client"
property="telephone"/>
</h2>
<h2>email:
<jsp:getProperty property name="client"
property="email"/>
</h2>
</body>
</html>