package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class detailsinsert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("        \n");
      out.write("        ");

            
            PreparedStatement pst = null;
            
            
            String nm = request.getParameter("name");
            String add = request.getParameter("address");
            String cell = request.getParameter("cellno");
            String email = request.getParameter("emailid");
            
            
           
            try{
                
                int s = 0 ;
            
        String sql = "insert into customer" +
                    "(slno,name,address,cellno,emailid)" +
                    "values(?,?,?,?,?)";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","raihan158851");  
        //Statement stmt = con.createStatement();
        
        Statement stmt = con.createStatement();
        String q1 = "select slnoseq.nextval as nextval from dual";
        ResultSet rs = stmt.executeQuery(q1);
        while(rs.next())
        {
               s = rs.getInt(1);
        }
        
        
        
         
        pst = con.prepareStatement(sql);
        
        //stmt.executeUpdate(q1);
        
        pst.setInt(1,s);
        pst.setString(2,nm);
        pst.setString(3,add);
        pst.setString(4,cell);
        pst.setString(5,email);
        
        pst.executeUpdate();
        con.close();
        
            }
            catch(Exception e)
            {
                out.println(e);
            }
        
      out.write("\n");
      out.write("        <front action=\"order.jsp\" align=\"center\"> \n");
      out.write("        \n");
      out.write("        <p align=\"center\"><b><font size=\"25\" face=\"Times\" color=\"red\">Added Successfully</font></b></p><br><br>\n");
      out.write("        \n");
      out.write("        <br><br><br><br><br><br> <input type=\"submit\"  value=\"      Back       \" style=\"font-size:20pt;color:white;background-color:tomato;border:2px solid #FF4C33;padding:3px\">\n");
      out.write("\n");
      out.write("       </front> \n");
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
