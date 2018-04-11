<%-- 
    Document   : form
    Created on : 4 Apr, 2018, 1:01:23 PM
    Author     : jnvam
--%>
          
<%@page import="com.dao.CategoryDao"%>
<%@page import="com.bean.Category"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
          <%
            List<Category> list=CategoryDao.getAllRecords();
            request.setAttribute("list",list);
          %> 
            
          <form role="form" name ="myform" onsubmit="validateForm()" method="post" action="insert_post.jsp">
                <div>
                  <label>Post Title</label>
                  <input name="title" type="text" placeholder="Enter Title">
                </div>
                <div>
                  <label>Post Body</label>
                  <textarea name="body" placeholder="Enter Post" rows="10" cols="10"></textarea>
                </div>
                <div>
                  <label>Category</label>
                  <select name="category">
                     <c:forEach items="${list}" var="c">
                          <option>${c.getName()}</option>
                      </c:forEach>
                  </select>
                </div>
                <div>
                  <label>Author</label>
                  <input name="author" type="text" placeholder="Enter Author Name">
                </div>
                <div>
                  <label>Tags</label>
                  <input name="tags" type="text" placeholder="Enter Tags">
                </div>

                <div>
                    <input name="submit" type="submit" value="Submit">
                </div>
                <div>
                  <a href="index.jsp" class="Cancel" name="cancel">Cancel</a>
                </div>
                
                <br>
              </form>
