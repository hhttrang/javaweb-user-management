<%-- 
    Document   : index
    Created on : Aug 20, 2018, 9:19:34 PM
    Author     : VS9 X64Bit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <%@include file="header.jsp" %>
    </head> 

    <!-- Section 1 -->
    <section class="section background-white">
        <div class="line text-center">
            <i class="icon-sli-heart text-primary text-size-40"></i>
            <h2 class="text-dark text-size-50 text-m-size-40">Log In</b></h2>
            <hr class="break background-primary break-small break-center margin-bottom-50">
        </div>
        <div class="line">
            <div class="margin2x">
                <div class="m-12 l-6 margin-m-bottom-30">
                    <form action="MainController" method="POST" style="margin: 0 auto"> 
                        <table> 
                            <tbody>
                                <tr>
                                    <td class="animated-element text-strong text-size-20 text-line-height-1 margin-bottom-20">Your ID:</td>
                                    <td><input type="text" name="txtUsername" value="" />
                                        <font style="color: red">
                                        <br/>${requestScope.INVALID.invalidUsername}
                                        </font>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="animated-element text-strong text-size-20 text-line-height-1 margin-bottom-20">Password:</td>
                                    <td><input type="password" name="txtPassword" value="" />
                                        <font style="color: red">
                                        <br/>${requestScope.INVALID.invalidPassword}
                                        </font>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="vertical-align: middle; text-align: center; background-color: rgb(244, 248, 255,0.5); width: 100px;height: 50px;border-style: none" colspan="2"><input type="submit" value="Log In" name="act" /></td>
                                </tr>
                            </tbody>
                        </table> 

                    </form> 
                </div>          
                <div class="m-12 l-6">
                    <img src="ProjectImg/6688_-_flag_gundam_sieg_zeon_zeon.jpg" alt="">
                </div>
            </div>    
        </div>  
    </section>      
</article>
</main>
<%@include file="footer.jsp" %>
</html>
