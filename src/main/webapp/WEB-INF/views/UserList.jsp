<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table cellpadding="5" cellspacing="0" border="1" width="">
  <tr>
  <th>id</th>
  <th>name</th>
  <th>age</th>
  <th>sex</th>
  <th>address</th>
  <th>操作</th>
  </tr>
 <c:forEach items="${list}" var="u" >
 <tr>
    <td>${u.id}</td>
    <td>${u.name}</td>
    <td>${u.age}</td>
    <td>${u.sex == 1 ? '男':'女'}</td>
    <td>${u.address}</td>
    <td><a href="${pageContext.request.contextPath }/user/deleteUser.do?id=${u.id}">删除</a></td>
    <td></td>
 </tr>
 </c:forEach>
</table>
<h1>增加</h1>
<form action="${pageContext.request.contextPath }/user/addUser.do" method="post">
  name:<input type="text" name="name"/><br/>
  age:<input type="text" name="age"/><br/>
  sex:<input type="text" name="sex"/>1代表男，0代表女<br/>
  address:<input type="text" name="address"/><br/>
  <button type="submit">提交</button>
</form>
<h1>修改</h1>
<form action="${pageContext.request.contextPath }/user/updateUser.do" method="post">
  id：<input type="text" name="id"/>必须输入id<br/> 
  name:<input type="text" name="name"/><br/>
  age:<input type="text" name="age"/><br/>
  sex:<input type="text" name="sex"/><span>1代表男，0代表女</span><br/>
  address:<input type="text" name="address"/><br/>
  <button type="submit">提交</button>
</form>
</body>
</html>
