package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class pageorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   </style>\n");
      out.write("    <body>\n");
      out.write("        <form action =\"insertorder.jsp\" align=\"center\">\n");
      out.write("            <p align=\"center\"><b><font size=\"15\" face=\"Times\" color=\"red\">Foods Order</font></b></p><br><br>\n");
      out.write("            \n");
      out.write("            <label for=\"foodid\"><b><font size=\"5\" face=\"Times\" color=\"white\">Choose a Food or Drinks :</font></b></label>\n");
      out.write("        <select name=\"foodid\" id=\"foodid\">\n");
      out.write("        ");

            
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","raihan158851");  
        Statement stmt = con.createStatement();
        String sql ="select i.food_id, i.food_name from food_item i, food_item_price p where i.food_id=p.food_id and p.status=1";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next())
        {
            
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("         \n");
      out.write("            <option value=\"");
      out.print(rs.getString("food_id") );
      out.write('"');
      out.write('>');
      out.print(rs.getString("food_name") );
      out.write("</option>\n");
      out.write("         \n");
      out.write("            \n");
      out.write("            ");

        }
            
      out.write("\n");
      out.write("            \n");
      out.write("            </select>\n");
      out.write("            <br><br><b><font size=\"5\" face=\"Times\" color=\"white\">Quantity :</font></b>\n");
      out.write("            <input type=\"text\" name =\"quantity\" placeholder=\"Quantity\" required><br><br><br><br><br>\n");
      out.write("            <input type=\"submit\"  value=\"      Order       \" style=\"font-size:20pt;color:white;background-color:tomato;border:2px solid #FF4C33;padding:3px\">\n");
      out.write("            \n");
      out.write("            ");

           con.close();
        
            }
            catch(Exception e)
            {
                int f = 0;
            
      out.write("\n");
      out.write("                <p align=\"center\"><b><font size=\"15\" face=\"Times\" color=\"red\">Enter Correct Values</font></b></p><br><br>\n");
      out.write("             ");

                out.println(e);
            }
        
      out.write("\n");
      out.write("        </form>\n");
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
