<%-- 
    Document   : nowa
    Created on : 2015-04-13, 16:26:36
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>Registering</title>
    </head>
    <body>
        <form action="save_person" method="post">
            <table>
            <tr>
                <td>Imię:</td>
                <td><input type="text" name = 'Name'></td>
            </tr>
            <tr>
                <td>Nazwisko:</td>
                <td><input type = "text" name = 'Last_Name'></td>
            </tr>
                <tr>
                    <td>Wiek:</td>
                    <td><input type='number' name ="age"></td>
                </tr>
                <tr>
                    <td colspan="3"><input name="submit"  type ="submit" value="Register"/></td>
                </tr>
            </table>
            </form>
    </body>
</html>
