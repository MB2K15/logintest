<%-- 
    Document   : product
    Created on : 2015-03-29, 16:15:32
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>Products</title>
    </head>
    <body>
        <h1>Dodaj produkt:</h1>
        
        <form action="save" method="post">
          <table> 
              <tr>
                  <td>Nazwa:</td>
            <td><input type = 'text' name = 'name'></td>
            </tr>
            <tr>
                  <td>Kategoria:</td>
            <td><input type = 'text' name = 'category'></td>
            </tr>
           <tr>
                  <td>Cena:</td>
                  <td><input type =number name = 'price'></td>
            </tr>
            <tr>
                  <td>Ilość:</td>
            <td><input type = 'number' name = 'number'></td>
            </tr>
            <tr>
            <td colspan='2'><input name="submit" type="submit"
                                   value="Zapisz"/></td>
        </tr>
            </table>
        </form>
    </body>
</html>
