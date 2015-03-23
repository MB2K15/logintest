<%--
  Created by IntelliJ IDEA.
  User: Piotr
  Date: 2015-03-23
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Message : ${message}</h1>

<form action="login" method="post">
    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='username'></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password'/></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit"
                                   value="submit"/></td>
        </tr>
    </table>
</form>

</body>
</html>
