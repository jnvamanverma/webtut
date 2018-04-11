package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addpost_002dsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>WEB Technologies</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../styles/main.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/form.css\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class = 'container'>\n");
      out.write("        \n");
      out.write("        <div class = 'top'>\n");
      out.write("            <a class='webtut-logo' href=\"http://localhost/myprojects/webtut/\">webtut<span class='dotcom'>.com</span></a>\n");
      out.write("            <div class='logo-content'> Introduction to website designing languages</div>\n");
      out.write("        </div> <!-- top -->\n");
      out.write("        <div class=\"header\">\n");
      out.write("           <header class='webtut-header'>\n");
      out.write("             <a class = \"a1\" href=\"index.jsp\">HOME</a>\n");
      out.write("             <a class = \"a1\" href=\"\">ABOUT</a>\n");
      out.write("             <a class = \"a1\" href=\"\">CONTACT</a>\n");
      out.write("             <select name=\"languages\" class=\"header-select\">\n");
      out.write("               <option selected>All Languages</option>\n");
      out.write("               <option>HTML</option>\n");
      out.write("               <option>CSS</option>\n");
      out.write("               <option>JAVASCRIPT</option>\n");
      out.write("             </select>\n");
      out.write("             <a class = \"a1\" href=\"\">LOGIN</a>\n");
      out.write("           </header>       \n");
      out.write("        </div> <!-- header -->\n");
      out.write("\n");
      out.write("        <div class=\"blog-post\">\n");
      out.write("            <p>Record added successfully</p>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "form.jsp", out, false);
      out.write("\n");
      out.write("        </div> <!-- blog post -->\n");
      out.write("        \n");
      out.write("        <footer class='webtut-footer'>Copyright &copy; webtut.com</footer>\n");
      out.write("    </div> <!-- container -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
