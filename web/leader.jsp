<%-- 
    Document   : leader
    Created on : Aug 20, 2018, 9:32:32 PM
    Author     : VS9 X64Bit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
 <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Leader Home</title>
        <%@include file="headerforall1.jsp" %>
        <%@include file="barforLeader.jsp" %>
        <%@include file="headerforall2.jsp" %>
    </head> 
    <body>
         <!-- Section 1 -->
        <section class="section background-white">
          <div class="line text-center">
            <i class="icon-sli-heart text-primary text-size-40"></i>
            <h4 class="text-dark text-size-40 text-m-size-40" style="color: crimson">Welcome, ${sessionScope.USERID}</b></h4>
            <hr class="break background-primary break-small break-center margin-bottom-50">
          </div>
         <div class="line">
            <div class="margin2x">
                <div style="width: 100%;vertical-align: middle; text-align: center; ">
                 
                    <img src="ProjectImg/zeonLogo_1.png" width="50%" height="50%"> 
              </div>
            </div>    
          </div>  
        </section>      
      </article>
    </main>
    </body>
     <%@include file="footer.jsp" %>
</html>
