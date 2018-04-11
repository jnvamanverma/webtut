<%-- 
    Document   : index.jsp
    Created on : 4 Apr, 2018, 10:49:48 PM
    Author     : jnvam
--%>


<%@page import="com.dao.CategoryDao"%>
<%@page import="com.bean.Category"%>
<%@page import="com.dao.PostDao"%>
<%@page import="com.bean.Post"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="includes/header.jsp"></jsp:include>
        <%
            
            List<Post> list=PostDao.getAllRecords();
            request.setAttribute("list",list);
  
        %>
<table id="post">
        <tr>
          <th>Post ID#</th>
          <th>Post Title</th>
          <th>Category</th>
          <th>Author</th>
          <th>Date</th>
        </tr>
        
       <c:forEach items="${list}" var="p">
          </tr> 
            <td>${p.getId()}</td>
            <td><a href="edit_post.php?id=<?php echo $row['id']; ?>">${p.getTitle()}</a></td>
            <td>${p.getCategory()}</td>
            <td>${p.getAuthor()}</td>
            <td>${p.getDate()}</td>
          </tr>
        </c:forEach>
        
    </table>
<br><br>

        <%
            
            List<Category> listc=CategoryDao.getAllRecords();
            request.setAttribute("listc",listc);
  
        %>
<table id="category">
        <tr>
          <th>Category ID#</th>
          <th>Category Name</th>
        </tr>
       <c:forEach items="${listc}" var="c">
        <tr>
          <td>${c.getId()}</td>
          <td><a href="edit_category.php?id=<?php echo $category['id'];?>">${c.getName()}</a></td>
        </tr>
       </c:forEach>
    </table>
    
<jsp:include page="includes/footer.jsp"></jsp:include>