package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dao.CategoryDao;
import com.bean.Category;
import java.util.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          ");

            List<Category> list=CategoryDao.getAllRecords();
            request.setAttribute("list",list);
          
      out.write(" \n");
      out.write("            \n");
      out.write("            <form role=\"form\" method=\"post\" action=\"insert_post.jsp\">\n");
      out.write("                <div>\n");
      out.write("                  <label>Post Title</label>\n");
      out.write("                  <input name=\"title\" type=\"text\" placeholder=\"Enter Title\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                  <label>Post Body</label>\n");
      out.write("                  <textarea name=\"body\" placeholder=\"Enter Post\" rows=\"10\" cols=\"10\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                  <label>Category</label>\n");
      out.write("                  <select name=\"category\">\n");
      out.write("                     <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"c\">\n");
      out.write("                          <option>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                      </c:forEach>\n");
      out.write("                  </select>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                  <label>Author</label>\n");
      out.write("                  <input name=\"author\" type=\"text\" placeholder=\"Enter Author Name\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                  <label>Tags</label>\n");
      out.write("                  <input name=\"tags\" type=\"text\" placeholder=\"Enter Tags\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <input name=\"submit\" type=\"submit\" value=\"Submit\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                  <a href=\"index.jsp\" class=\"Cancel\" name=\"cancel\">Cancel</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("              </form>\n");
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
