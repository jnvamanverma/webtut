<%-- 
    Document   : addpost-success.jsp
    Created on : 4 Apr, 2018, 12:56:11 PM
    Author     : jnvam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>WEB Technologies</title>
    <link rel="stylesheet" href="../styles/main.css">
    <link rel="stylesheet" href="css/form.css">
    

</head>
<body>
    <div class = 'container'>
        
        <div class = 'top'>
            <a class='webtut-logo' href="http://localhost/myprojects/webtut/">webtut<span class='dotcom'>.com</span></a>
            <div class='logo-content'> Introduction to website designing languages</div>
        </div> <!-- top -->
        <div class="header">
           <header class='webtut-header'>
             <a class = "a1" href="index.jsp">HOME</a>
             <a class = "a1" href="">ABOUT</a>
             <a class = "a1" href="">CONTACT</a>
             <select name="languages" class="header-select">
               <option selected>All Languages</option>
               <option>HTML</option>
               <option>CSS</option>
               <option>JAVASCRIPT</option>
             </select>
             <a class = "a1" href="">LOGIN</a>
           </header>       
        </div> <!-- header -->

        <div class="blog-post">
            <p>Record added successfully</p>
            <jsp:include page="form.jsp"></jsp:include>
        </div> <!-- blog post -->
        
        <footer class='webtut-footer'>Copyright &copy; webtut.com</footer>
    </div> <!-- container -->
</body>
</html>

