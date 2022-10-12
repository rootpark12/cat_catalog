<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>cats</title>
	<style>	
		table, th, td {
	            border: 1px solid black ;
	            border-collapse: collapse;	            
	        }
	</style>
	
</head>
<body>
<h1>
	cats
</h1>
<form action="add" method="post">
    <table>
        <caption>ADD</caption>
        <tr>
            <th>NAME</th>
            <td><input type="text" name="cat_name"></td>
        </tr>
        <tr>
            <th>AGE</th>
            <td><input type="text" name="cat_age"></td>
        </tr>
        <tr>
            <th>BREED</th>
            <td><input type="text" name="cat_breed"></td> 
        </tr>
        <tr>
            <th>PRICE</th>
            <td><input type="text" name="cat_price"></td> 
        </tr>
    </table>

    <input type="submit">
</form>

<form action="edit" method="post">
    <table>
        <caption>EDIT</caption>
        <tr>
            <th>ID</th>
            <td><input type="text" name="cat_id"></td>
        </tr>
        <tr>
            <th>PRICE</th>
            <td><input type="text" name="cat_price"></td> 
        </tr>
    </table>

    <input type="submit">
</form>


<table>
    <caption>LIST</caption>
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>AGE</th>
		<th>BREED</th>
		<th>PRICE</th>
		<th></th>
	</tr>
	
	<c:forEach items="${list}" var="cat">
	
		<tr>
			<td>${cat.cat_id}</td>
			<td>${cat.cat_name}</td>
			<td>${cat.cat_age}</td>
			<td>${cat.cat_breed}</td>
			<td>${cat.cat_price}</td>
			<td><a href="del?cat_id=${cat.cat_id}">del</a></td>	
		</tr>
	
	
	</c:forEach>
	
	
	
	
	
</table>

</body>
</html>
