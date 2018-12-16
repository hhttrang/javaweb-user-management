<%-- 
    Document   : account
    Created on : Aug 21, 2018, 12:27:28 AM
    Author     : VS9 X64Bit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Account</title>
        <%@include file="header.jsp" %>
    </head> 
    <!-- Section 3 -->
    <section class="section background-dark"> 
        <div class="s-12 m-12 l-4 center">
            <h3 class="text-size-30 margin-bottom-40 text-center"><b>Register Form</b></h3>
            <form class="customform" method="post" action="MainController">
                <div class="line"> 
                    <div class="s-12">
                        <input name="txtnewUsername" placeholder="Username" type="text" class="text-white" />
                        <font style="color: red">
                            <br/>${requestScope.INVALID.invalidUsername}
                            </font>
                    </div> 
                    <div class="s-12">
                        <input name="txtnewFullname"  placeholder="Fullname" type="text" class="text-white" />
                            <font style="color: red">
                            <br/>${requestScope.INVALID.invalidFullname}
                            </font>
                    </div> 
                </div>  
                <div class="line">
                    <div class="margin">
                        <div class="s-12 m-12 l-6">
                            <input name="txtnewPassword" placeholder="Password" type="password" class="text-white" />
                            <font color="red">
                            <br/>${requestScope.INVALID.invalidPassword}
                            </font>
                        </div>
                        <div class="s-12 m-12 l-6">
                            <input name="txtRePassword"  placeholder="RePassword" type="password" class="text-white" />
                            <font color="red">
                            <br/>${requestScope.INVALID.invalidRePass}
                            </font>
                        </div>
                    </div>
                </div>      
                <div class="line">   
                    <div class="s-12"> 
                        <button class="button border-radius text-white background-primary" type="submit" value="Regist" name="act">Regist</button></div>
                </div>    
            </form>
        </div>           
    </section>
</article>
</main>
<%@include file="footer.jsp" %>

