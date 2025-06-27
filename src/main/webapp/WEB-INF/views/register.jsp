<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form modelAttribute="user" action="/signup/registerUser" method="post">
	User Name: <form:input path="id"/><br/>
	Password: <form:input path="password"/><br/><br/>
    First Name: <form:input path="firstName"/><br/>
    Last Name: <form:input path="lastName"/><br/>
    Phone No: <form:input path="phno"/><br/>
    Email: <form:input path="email"/><br/>
    
    <input type="submit" value="Submit"/>
</form:form>