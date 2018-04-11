<%-- 
    Document   : insert_post
    Created on : 4 Apr, 2018, 12:46:36 PM
    Author     : jnvam
--%>

<%@page import="com.dao.PostDao"%>
<jsp:useBean id="p" class="com.bean.Post"></jsp:useBean>
<jsp:setProperty property="*" name="p" />

<%
    int i=PostDao.save(p);
    if(i>0){
       response.sendRedirect("addpost-success.jsp"); 
    }else{
        response.sendRedirect("addpost-error.jsp");
    }
  %>