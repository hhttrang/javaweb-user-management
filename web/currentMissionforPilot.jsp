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
        <title>Your Current Mission</title>
        <%@include file="headerforall1.jsp" %>
        <%@include file="barforPilot.jsp" %>
        <%@include file="headerforall2.jsp" %>
    </head> 
    <section class="section background-white">
        <div class="line text-center">
            <i class="icon-sli-heart text-primary text-size-40"></i>
            <h4 class="text-crimson text-size-40 text-m-size-40" style="color: darkblue">Welcome, ${sessionScope.USERID}</b></h4>
            <hr class="break background-primary break-small break-center margin-bottom-50">
        </div>
        <div class="line text-center text-dark text-size-20 text-m-size-20"> 
                <div class="line"> Current Mission  </div>  
        </div>        
        <div class="line text-center text-dark text-size-30 text-m-size-30">    
            <c:if test="${sessionScope.CurrentMission != null}">
                <table border="1">
                    <thead>
                        <tr>
                            <th>Mission Name</th>
                            <th>Mission script</th>
                            <th colspan="2"> </th> 
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="currmission" varStatus="counter" items="${sessionScope.CurrentMission}">
                        <form action="MainController" method="POST"> 
                            <tr>
                                <td>${currmission.missionName}</td>
                                <td>${currmission.description}</td>
                                <td> 
                                    <table> 
                                        <input type="hidden" name="txtMissionId" value="${currmission.missionId}" />
                                        <tbody> 
                                            <tr>
                                                <td><input type="submit" value="Success" name="act" style="background-color: rgba(93, 239, 88,0.5);width: 70%;height: 100%;"/></td>
                                            </tr>
                                            <tr>
                                                <td><input type="submit" value="Fail" name="act" style="background-color: rgba(244, 113, 66,0.5);width: 70%;height: 100%;"/></td>
                                            </tr> 
                                        </tbody>
                                    </table>  
                                </td>
                            </tr> 
                        </form>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
            <c:if test="${sessionScope.CurrentMission == null}">Let't wait to next Missions</c:if>
        </div> 
    </section>
    <%@include file="footer.jsp" %>
</html>
