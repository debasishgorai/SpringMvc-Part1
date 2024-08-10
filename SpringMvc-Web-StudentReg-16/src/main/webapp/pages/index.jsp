<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
    <%@ taglib uri="http://www.springframework.org/tags" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>                     
            Student Reg Form
</h1>
<form:form action="regStudent" modelAttribute="Student" method="post">
<table>

<tr>                                   
<td> name</td>

<td><form :input path="name"></form></td>
</tr>

<tr>                                   
<td> Email</td>

<td><form :input path="email"></form></td>
</tr>
<tr>                                   
<td> PHONE no</td>

<td><form :input path="phno"></form></td>
</tr>

<tr>                                   
<td> Gender</td>

<td><form :radiobuttons items="${genders }" path="genders"></form></td>
</tr>


<tr>                                   
<td> Courses</td>

<td>


<form:select  path="courses" >
<form:options  items="${courses }" />
</form:select >


</td>
</tr>

<tr>                                   
<td> Timings</td>

<td><form :checkboxes items="${ timings} " path="timings"></form></td>
</tr>






</table>
</form:form>
</body>
</html>