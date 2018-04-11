<?xml version="1.0" encoding="UTF-8"?>
<html xsl:version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<body style="font-family:Arial;font-size:12pt;background-color:#EEEEEE">
<div class="category" align="center">   
    <h3 align="center">Posts</h3>
    <table style="font-family: Trebuchet MS, Arial, Helvetica, sans-serif; 
                border-collapse: collapse;width: 80%;">
         <tr style="border: 1px solid #ddd; padding: 8px;padding-top: 12px;
                    padding-bottom: 12px;text-align: left; background-color: #4CAF50; color: white;">
             <th>Title</th>
             <th>Category</th>
             <th>Author</th>
             <th>Date</th>
         </tr>
        <xsl:for-each select="posts_menu/post">
            <tr>
                <td><xsl:value-of select="title"/></td>
                <td><xsl:value-of select="category"/></td>
                <td><xsl:value-of select="author"/></td>
                <td><xsl:value-of select="date"/></td>
            </tr>
       </xsl:for-each>
     </table>
</div>
</body>
</html>
