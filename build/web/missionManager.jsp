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
        <title>Mission Create</title>
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
    </section>

    <section class="section background-dark" style="background-image:url(ProjectImg/missionCreate.jpg)"> 
        <div class="s-12 m-12 l-4 center">
            <h3 class="text-size-30 margin-bottom-40 text-center"><b>Create a mission</b></h3>
            <form class="customform text-size-10" method="post" action="MainController">
                <div class="line"> 
                    <div class="s-12">
                        <input name="txtMissionName"  <c:if test="${requestScope.CresteMissionStatus == null}">value="${param.txtMissionName}"</c:if> placeholder="Mission name" type="text" class="text-white" style="font-size: 20px;" />
                            <font style="color: red">
                            <br/>${requestScope.INVALID.invalidMissionName}
                        </font>
                    </div>   
                </div>  
                <div class="line">
                    <div class="margin">
                        <div class="s-12 m-12 l-6">
                            Number of pilots:
                            <input name="txtMissionPilotsNum" <c:if test="${requestScope.CresteMissionStatus == null}">value="${param.txtMissionPilotsNum}"</c:if> min="1" max="5" type="number" class="text-white" style="font-size: 20px;" /> 
                            </div> 
                        </div>
                    </div>      
                    <div class="line">  
                        <div class="s-12">
                            <textarea name="txtMissionDes" placeholder="Mission Description" rows="3"  class="text-white" style="font-size: 20px;" ><c:if test="${requestScope.CresteMissionStatus == null}">${param.txtMissionDes}</c:if></textarea>
                        </div>  
                        <div class="s-12"> 
                            <button class="button border-radius text-white background-primary" type="submit" value="OK" name="act">OK</button></div>
                    </div>  
                    <font style="color: red">
                    <br/>${requestScope.INVALID.invalidChoosePilot}
                </font>
            </form>        
        </div>
        <div class="s-12 m-12 l-4 center">
            <form class="customform text-size-10" method="post" action="MainController">
                <c:set value="${requestScope.CreateSign}" var="sign"/>
                <c:if test="${sign != null}"> 
                    <input type="hidden" name="txtMissionName" value="${param.txtMissionName}" />
                    <input type="hidden" name="txtMissionPilotsNum" value="${param.txtMissionPilotsNum}" />
                    <input type="hidden" name="txtMissionDes" value="${param.txtMissionDes}" />
                    <div class="line">
                        <c:forEach var="countPilot" begin="1" end="${param.txtMissionPilotsNum}">
                            <div class="s-12">
                                Pick Pilot:<select name="pilotList${countPilot}" class="text-white" style="font-size: 15px;" > 
                                    <c:forEach var="pilotList" items="${sessionScope.PILOTLIST}">
                                        <option value="${pilotList.key}"  style="color: black">${pilotList.value}</option> 
                                    </c:forEach>
                                </select>
                            </div>    
                        </c:forEach> 
                        <div class="s-12"> 
                            <button class="button border-radius text-white background-primary" type="submit" value="Create" name="act">Create</button></div>
                    </div>   

            </div>

        </c:if>  
    </form>
</div>
</section>
</article>
</main>
<%@include file="footer.jsp" %>
</html>
