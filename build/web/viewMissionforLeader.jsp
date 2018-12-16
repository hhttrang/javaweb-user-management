<%-- 
    Document   : viewMissionforLeader
    Created on : Aug 26, 2018, 4:59:59 PM
    Author     : VS9 X64Bit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Your Mission List</title>
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
                <div class="line"> All Your Lead Mission  </div>    
        </div> 
        <div class="line text-center text-dark text-size-30 text-m-size-30">    
            <c:if test="${requestScope.listMission != null}">
                <table border="1">
                    <thead>
                    <th>No.</th>
                    <th>Mission Name</th>
                    <th>Participants</th>
                    <th>Status</th> 
                    <th>Description</th>  
                    </thead>
                    <tbody>
                    <c:forEach var="dto" varStatus="counter" items="${requestScope.listMission}"> 
                        <tr>
                            <td>${counter.count}</td>
                            <td>${dto.missionName}</td>
                            <td>${dto.participants}</td>
                            <td><c:if test="${dto.status == 'PROCESSING'}"><font style="color: orange">${dto.status}</font></c:if>
                        <c:if test="${dto.status == 'FAILED'}"><font style="color: red">${dto.status}</font></c:if>
                        <c:if test="${dto.status == 'SUCCESSFUL'}"><font style="color: green">${dto.status}</font></c:if>
                        </td>
                        <td>${dto.description}</td>
                        </tr> 
                    </c:forEach>
                    </tbody>
                </table>

            </c:if>
            <c:if test="${requestScope.listMission == null}"><font style="color: red">Don't have any mission before</font></c:if>
                
        </div> 
    </section>
    <%@include file="footer.jsp" %>
</html>
