<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Enrollments</title>

<style>
tr:first-child {
	font-weight: bold;
	background-color: #C6C9C4;
}
</style>

</head>
<body>
	<h2>List of Users</h2>
	<table>
		<tr>
			<td>Name</td>
			<td>Salary</td>
			<td>SSN</td>
			<td></td>
			<td></td>
		</tr>
		<c:forEach items="${listOfUsers}" var="user" >
			<tr>
				<td><c:out value="${user.name}"/></td>
				<td><c:out value="${user.salary}" /></td>
				<td><c:out value="${user.ssn}" /></td>
				<td><a href="<c:url value='/edit-${user.id}' />">edit</a></td>
				<td><a href="<c:url value='/delete-${user.id}' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="<c:url value='/new' />">Add New User</a>
</body>
</html>
