<%-- 
    Document   : gundamManager
    Created on : Aug 26, 2018, 11:06:15 AM
    Author     : VS9 X64Bit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Manager Pilots</title>
        <%@include file="headerforall1.jsp" %>
        <%@include file="barforLeader.jsp" %>
        <%@include file="headerforall2.jsp" %>
    </head> 
    <section class="section background-white">
        <div class="line text-center">
            <i class="icon-sli-heart text-primary text-size-40"></i>
            <h4 class="text-crimson text-size-40 text-m-size-40" style="color: crimson">Welcome, ${sessionScope.USERID}</b></h4>
            <hr class="break background-primary break-small break-center margin-bottom-50">
        </div>

        <div class="line text-center text-dark text-size-20 text-m-size-20">
            <form action="MainController" class="customform" >
                <div class="line"> Search Pilot</div> 
                <div class="line"><input type="text" name="txtSearchPilot" value="" style="width: 50%; text-align:center;" /> </div>  
                <div class="line"> <input type="submit" value="Search" name="act" style="width: 50%" /></div>  
            </form>
        </div> 
             <div class="line text-center text-dark text-size-30 text-m-size-30">   
        <c:if test="${requestScope.txtSearchPilot != null}">
            <h3>Result</h3>
            <c:if test="${requestScope.listSearch != null}">
                <table border="1">
                    <thead>
                    <th>No.</th>
                    <th>Username</th>
                    <th>Full Name</th>  
                    <th>Choose Gundam</th>
                    <th></th>
                    </thead>
                    <tbody>
                    <c:forEach var="dto" varStatus="counter" items="${requestScope.listSearch}"> <form action="MainController">
                            <tr> 
                            <input type="hidden" name="txtLastSearch" value="${requestScope.txtSearchPilot}" />
                            <td>${counter.count}</td>
                            <td>${dto.username}
                                <input type="hidden" name="txtPilotId" value="${dto.username}" />
                            </td>
                            <td>${dto.fullname}</td> 
                            <td>
                                <select name="choosegundamList"> 
                                    <c:forEach var="gundamList" items="${sessionScope.GUNDAMLIST}">
                                        <option value="${gundamList.key}"><font style="color: orangered">${gundamList.value}</font></option> 
                                    </c:forEach></select>   
                            </td>
                            <td><input type="submit" value="Choose" name="act" style="background-color: pink"/> </td>
                            </tr> </form>
                        </c:forEach> 
                    </tbody>
                </table>

            </c:if>
            <c:if test="${requestScope.listSearch == null}">
                <font style="color: red">Not found Pilot</font>
            </c:if>
        </c:if> 
    </div>
</div>  
</section>
 
</article>
</main>
<%@include file="footer.jsp" %>
</html>
