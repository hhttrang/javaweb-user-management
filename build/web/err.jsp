<%-- 
    Document   : err
    Created on : Aug 20, 2018, 9:44:27 PM
    Author     : VS9 X64Bit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
        <%@include file="headerforall1.jsp" %> 
          <main role="main">
      <article>    
        <!-- Header -->
        <header class="section background-image text-center" style="background-image:url(ProjectImg/Zeon962739.jpg)">
          <h1 class="animated-element slow text-white text-s-size-40 text-m-size-40 text-size-70 text-line-height-1 margin-bottom-30 margin-top-130">
              <b> <font style="color: red">ERROR!</font></b>
          </h1>
            <b>  <p class="animated-element text-grey text-size-25">${requestScope.ERROR}<br/>
        <a href="${requestScope.LINKBACK}">Click to go back</a></p></b>
           <!-- white full width arrow object -->
          <img class="arrow-object" src="img/arrow-object-white.svg" alt="">
        </header>   
    <body> 
    </body> 
</html>
