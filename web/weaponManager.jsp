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
        <title>Weapon Manager</title>
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
                <div class="line"> Search Weapon Name: </div> 
                <div class="line"><input type="text" name="txtSearchWeapon" value="" style="width: 50%; text-align:center;" /> </div>  
                <div class="line"> <input type="submit" value="Search" name="act" style="width: 50%" /></div>  
            </form>
        </div> 
         <div class="line text-center text-dark text-size-30 text-m-size-30">   
          <c:if test="${requestScope.txtSearchWeapon != null}">
        <h3>Result</h3>
        <c:if test="${not empty requestScope.listSearch}"> 
            <%-- <c:if test="${z}"></c:if> --%>
            <table border="1">
                <thead>
                    <tr>
                        <th>No.</th>
                        <th>Image</th>
                        <th>Weapon ID</th>
                        <th>Weapon Name</th> 
                        <th>Description</th>
                        <th>Number</th>
                        <th colspan="2"></th>  
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${requestScope.listSearch}" var="dto" varStatus="counter">
                    <form action="MainController">
                        <tr> 
                        <input type="hidden" name="txtLastSearch" value="${requestScope.txtSearchWeapon}" />
                        <td>${counter.count}</td>
                        <td><img src="${dto.img}"> 
                        </td>
                        <td>${dto.weaponId} ${requestScope.txtSearchGundam}
                            <input type="hidden" name="txtWeaponId" value="${dto.weaponId}" />
                        </td>
                        <td>
                            <input type="text" name="txtEditWeaponId" value="${dto.weaponName}" />
                        </td>
                        <td> 
                            <input type="text" name="txtEditWeaponDes" value="${dto.description}" />
                        </td>   
                        <td> 
                            <input type="number" name="txtEditWeaponNumber" value="${dto.quantity}" min="0" max="30"/>
                        </td>  
                        <td><input type="submit" value="Edit" name="act" /> </td>
                        <td><input type="submit" value="Delete" name="act" /> </td> 
                        </tr>
                    </form>
                </c:forEach>
            </tbody>
        </table></c:if>
    <c:if test="${requestScope.listSearch == null}"><font style="color: red">Not found weapon</font>
    </c:if> 
</c:if> 
   </div>
    </div>  
</section>

<section class="section background-dark" style="background-image:url(ProjectImg/weaponCreate.jpg)"> 
    <div class="s-12 m-12 l-4 center">
        <h3 class="text-size-30 margin-bottom-40 text-center"><b>Create New Weapon</b></h3>
        <form class="customform text-size-10" method="post" action="MainController">
            <div class="line"> 
                <div class="s-12">
                    <input name="txtWeaponId" placeholder="Weapon ID" type="text" class="text-white" style="font-size: 20px;" />
                    <font style="color: red">
                    <br/>${requestScope.INVALID.invalidWeaponId}
                    </font>
                </div>  
                 <div class="s-12">
                    <input name="txtWeaponName" placeholder="Weapon Name" type="text" class="text-white" style="font-size: 20px;" />
                    <font style="color: red">
                    <br/>${requestScope.INVALID.invalidWeaponName}
                    </font>
                </div>  
            </div>  
            <div class="line">
                <div class="margin">
                    <div class="s-12 m-12 l-6">
                        Quantity:
                        <input name="txtEditWeaponNumber" value="1" min="1" max="20" placeholder="Height:" type="number" class="text-white" style="font-size: 20px;" /> 
                    </div> 
                </div>
            </div>      
            <div class="line">  
                <div class="s-12">
                    <textarea name="txtWeaponDes" placeholder="Description" rows="3"  class="text-white" style="font-size: 20px;" ></textarea>
                    <font style="color: red">
                    <br/>${requestScope.INVALID.invalidWeaponDes}
                    </font>
                </div>  
                <div class="s-12"> 
                    <button class="button border-radius text-white background-primary" type="submit" value="Add" name="act">Add</button></div>
            </div>    
        </form>
    </div>           
</section>
</article>
</main>
<%@include file="footer.jsp" %>
</html>
