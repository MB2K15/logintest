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
        
        <style>
            
            
            #content{
                width:1000px;
                background-color: aqua;
                min-height: 500px;
                padding: 10px;
                
                
                
                
                
            }
            #add-product {
	width: 500px;
	padding: 50px;
	margin: 100px auto;
	background-color: aqua;
        color: blue;

	border: 1px solid #000;
	
}   

#napis{

    margin-left: auto;
    margin-right: auto;
    width: 500px;
    padding:5px;
    min-height: 20px;
    text-align: center;
    color:blue;
    background-color: white
}
            
            </style>
    </head>
    <body>
        
        <div id="content">
        
       <div id="napis">
           
            <h1>Dodaj produkt:</h1>
       </div>
             <div id="add-product">
            
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
        
        <a href="http://www.google.com" target = "_blank">Click to jump <b>google</b></a>
        </div>
        </div>
    </body>
</html>
