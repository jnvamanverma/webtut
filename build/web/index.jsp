<%-- 
    Document   : index.jsp
    Created on : 3 Apr, 2018, 10:00:49 PM
    Author     : jnvam
--%>
<%@page import="java.util.*"%>
<%@page import="com.dao.PostDao"%>
<%@page import="com.bean.Post"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="includes/header.jsp"></jsp:include>
        <%
            
            List<Post> list=PostDao.getAllRecords();
            request.setAttribute("list",list);
  
        %>
        <div class="blog-post">
            <c:forEach items="${list}" var="p">
            <h2 class="blog-post-title">${p.getTitle()}</h2>
            <p class="blog-post-meta">${p.getDate()} by 
                <a href="#">${p.getAuthor()}</a></p>
                ${p.getBody()}
            <a class="readmore" href="">Read More...</a>
            </c:forEach>
<jsp:include page="includes/footer.jsp"></jsp:include>
