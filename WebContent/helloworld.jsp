<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Hello World</title>
</head>
<body>
<h1>This is spring MVC Tutorial</h1>
<spring:nestedPath path="visitor">
<form:form action="hellovisitor.htm" commandName="visitor" >

<tr>
	<td class="alignRight" nowrap width="156">First Name :&nbsp; </td>
	<td class="alignRight" colspan="3" >
		<spring:bind path="firstName">
			<input name="$(status.expression)" value="$(status.value)" type="text" id="textfield" accesskey="" tabindex="1" >		
		</spring:bind>
	</td>
</tr>

<tr>
	<td class="alignRight" nowrap width="156">Last Name :&nbsp; </td>
	<td class="alignRight" colspan="2" >
		<spring:bind path="lastName">
			<input name="$(status.expression)" value="$(status.value)" type="text" id="textfield1" accesskey="" tabindex="2" >		
		</spring:bind>
	</td>
</tr>

<tr>
	<td>
		<input type="submit" value="Submit">
	</td>
</tr>		 	

</form:form>
</spring:nestedPath>	 
</body>
</html>