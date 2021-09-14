package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("       background-image: url('https://files.wallpaperpass.com/2019/10/food%20wallpaper%20198%20-%201600x1000.jpg');\n");
      out.write("       background-repeat: no-repeat;\n");
      out.write("       background-attachment: fixed;\n");
      out.write("       background-size: 100% 100%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <style> \n");
      out.write("    input[type=submit]{\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px 32px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    cursor: pointer;\n");
      out.write("   }\n");
      out.write("   </style> \n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("        <form action =\"detailsinsert.jsp\" align=\"center\">\n");
      out.write("            <p align=\"center\"><b><font size=\"15\" face=\"Times\" color=\"red\">Customer Details</font></b></p><br><br>\n");
      out.write("            <b><font size=\"5\" face=\"Times\" color=\"white\">Name           :</font></b>\n");
      out.write("            <input type=\"text\" name =\"name\" placeholder=\"Name\" required><br><br>\n");
      out.write("            <b><font size=\"5\" face=\"Times\" color=\"white\">Address        :</font></b>\n");
      out.write("            <input type=\"text\" name =\"address\" placeholder=\"Address\" required><br><br>\n");
      out.write("            <b><font size=\"5\" face=\"Times\" color=\"white\">Cell No        :</font></b>\n");
      out.write("            <input type=\"text\" name =\"cellno\" placeholder=\"Cell NO\" required><br><br>\n");
      out.write("            <b><font size=\"5\" face=\"Times\" color=\"white\">Email Address  :</font></b>\n");
      out.write("            <input type=\"email\" name =\"emailid\" placeholder=\"Email Address\" required><br><br>\n");
      out.write("            \n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\"  value=\"      Add       \" style=\"font-size:20pt;color:white;background-color:tomato;border:2px solid #FF4C33;padding:3px\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        <form action=\"pageorder.jsp\" align=\"center\">\n");
      out.write("            <br><br><br><br><input type=\"submit\"  value=\"  Go To Order   \" style=\"font-size:20pt;color:white;background-color:tomato;border:2px solid #FF4C33;padding:3px\"> \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
