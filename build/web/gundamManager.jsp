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
        <title>Gundam Manager</title>
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
                <div class="line">  Search Gundam Name:  </div> 
                <div class="line"><input type="text" name="txtSearchGundam" value="" style="width: 50%; text-align:center;" /> </div>  
                <div class="line"> <input type="submit" value="Search" name="act" style="width: 50%" /></div>  
            </form>
        </div> 


        <div class="line text-center text-dark text-size-30 text-m-size-30">
            <c:if test="${requestScope.txtSearchGundam != null}">
                <h3>Result</h3>
                <c:if test="${not empty requestScope.listSearch}"> 
                    <%-- <c:if test="${z}"></c:if> --%>
                    <table border="1">
                        <thead>
                            <tr>
                                <th>No.</th>
                                <th>Image</th>
                                <th>Model ID</th>
                                <th>Model Name</th>
                                <th>Classification</th> 
                                <th>Height</th>
                                <th>Weight</th>
                                <th colspan="2"></th>  
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.listSearch}" var="dto" varStatus="counter">
                            <form action="MainController"> 
                                <tr> 
                                <input type="hidden" name="txtLastSearch" value="${requestScope.txtSearchGundam}" />
                                <td>${counter.count}</td>
                                <td>
                                    <img src="${dto.image}" > 
                                </td>
                                <td>${dto.modelNumber}
                                    <input type="hidden" name="txtGundamId" value="${dto.modelNumber}" />
                                </td>
                                <td>
                                    <input type="text" name="txtEditName" value="${dto.officialName}" />
                                </td> 
                                <td> 
                                    <input type="hidden" name="txtClass" value="${dto.classification}" />
                                    <c:if test="${dto.classification eq 'Armor     '}">  
                                        <select name="GundamtypeEditList">
                                            <option value="Armor" style="color: black">Mobile Armor</option> 
                                            <option value="MobileSuit" style="color: black">Mobile Suit</option> 
                                        </select>
                                    </c:if>
                                    <c:if test="${dto.classification eq 'MobileSuit'}"> 
                                        <select name="GundamtypeEditList">
                                            <option value="MobileSuit" style="color: black">Mobile Suit</option> 
                                            <option value="Armor" style="color: black">Mobile Armor</option>   
                                        </select>
                                    </c:if>  
                                </td> 
                                <td><input type="number"   name="txtEditHeight" value="${dto.height}" step="0.01" style="width: 50px" /></td>
                                <td><input type="number"  name="txtEditWeight" value="${dto.weight}" step="0.01" style="width: 50px" /></td> 
                                <td><input type="submit" value="Edit" name="act" /> </td>
                                <td><input type="submit" value="Delete" name="act" /> </td>
                                </tr></form></c:forEach>
                            </tbody>
                        </table></c:if>
                <c:if test="${requestScope.listSearch == null}"><font style="color: red">Not found gundam</font>
                </c:if> 
            </c:if>
        </div>
    </div>  
</section>


<section class="section background-dark" style="background-image:url(ProjectImg/gundamCreate.jpg)"> 
    <div class="s-12 m-12 l-4 center">
        <h3 class="text-size-30 margin-bottom-40 text-center"><b>Create New Gundam</b></h3>
        <form class="customform text-size-10" method="post" action="MainController">
            <div class="line"> 
                <div class="s-12">
                    <input name="txtGundamId" placeholder="Model ID" type="text" class="text-white" style="font-size: 20px;" />
                    <font style="color: red">
                    <br/>${requestScope.INVALID.invalidGundamId}
                    </font>
                </div> 
                <div class="s-12">
                    <input name="txtGundamName"  placeholder="Model Full Name" type="text" class="text-white" style="font-size: 20px;"  />
                    <font style="color: red">
                    <br/>${requestScope.INVALID.invalidGundamName}
                    </font>
                </div>  
                <div class="s-12" > 
                    <select name="GundamtypeList" class="text-white" style="font-size: 15px;" >
                        <option value="Armor">Mobile Armor</option> 
                        <option value="MobileSuit">Mobile Suit</option> 
                    </select>
                </div>
            </div>  
            <div class="line">
                <div class="margin">
                    <div class="s-12 m-12 l-6">
                        Height:
                        <input name="txtGundamHeight" value="0" min="0.01" placeholder="Height:" type="number" class="text-white" style="font-size: 20px;" /> 
                    </div>
                    <div class="s-12 m-12 l-6">
                        Weight:
                        <input name="txtGundamWeight" value="0" min="0.01" placeholder="Weight:" type="number" class="text-white" style="font-size: 20px;" /> 
                    </div>
                </div>
            </div>      
            <div class="line">  
                <div class="s-12">
                    <textarea name="txtGundamDes" placeholder="Description" rows="3"  class="text-white" style="font-size: 20px;" ></textarea>
                    <font style="color: red">
                    <br/>${requestScope.INVALID.invalidGundamDes}
                    </font>
                </div> 
                <div class="s-12">
                    Choose Weapon: 
                    <select name="weaponList" class="text-white" style="font-size: 15px;">
                        <c:forEach var="weaponList1" items="${sessionScope.WEAPONLIST}">
                            <option value="${weaponList1.key}">${weaponList1.value}</option> 
                        </c:forEach> 
                    </select>
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
