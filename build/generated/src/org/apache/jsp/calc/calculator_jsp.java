package org.apache.jsp.calc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calculator_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Javascript Calculator</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"calc.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"calc.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class=\"calculator\" id=\"calc\">\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"4\" class=\"calc_td_result\">\n");
      out.write("                    <input type=\"text\" readonly=\"readonly\" name=\"calc_result\" id=\"calc_result\" class=\"calc_result\" onkeydown=\"javascript:key_detect_calc('calc',event);\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"CE\" onclick=\"javascript:f_calc('calc','ce');\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"&larr;\" onclick=\"javascript:f_calc('calc','nbs');\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"%\" onclick=\"javascript:f_calc('calc','%');\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"+\" onclick=\"javascript:f_calc('calc','+');\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"7\" onclick=\"javascript:add_calc('calc',7);\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"8\" onclick=\"javascript:add_calc('calc',8);\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"9\" onclick=\"javascript:add_calc('calc',9);\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"-\" onclick=\"javascript:f_calc('calc','-');\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("                        <tr>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"4\" onclick=\"javascript:add_calc('calc',4);\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"5\" onclick=\"javascript:add_calc('calc',5);\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"6\" onclick=\"javascript:add_calc('calc',6);\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"x\" onclick=\"javascript:f_calc('calc','*');\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"1\" onclick=\"javascript:add_calc('calc',1);\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"2\" onclick=\"javascript:add_calc('calc',2);\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"3\" onclick=\"javascript:add_calc('calc',3);\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"&divide;\" onclick=\"javascript:f_calc('calc','');\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"0\" onclick=\"javascript:add_calc('calc',0);\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"&plusmn;\" onclick=\"javascript:f_calc('calc','+-');\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\",\" onclick=\"javascript:add_calc('calc','.');\" />\n");
      out.write("                </td>\n");
      out.write("                <td class=\"calc_td_btn\">\n");
      out.write("                        <input type=\"button\" class=\"calc_btn\" value=\"=\" onclick=\"javascript:f_calc('calc','=');\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                document.getElementById('calc').onload=init_calc('calc');\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
