package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class invoice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       background-image: url('https://st.depositphotos.com/1005682/2476/i/600/depositphotos_24762569-stock-photo-fast-food-hamburger-hot-dog.jpg');\n");
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
      out.write("        \n");
      out.write("        <form action=\"order.jsp\" align=\"center\">\n");
      out.write("        <p align=\"center\"><b><font size=\"15\" face=\"Times\" color=\"red\">Invoice</font></b></p>\n");
      out.write("        \n");
      out.write("        <table border=\"2\" align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            <th><font size=\"4\" face=\"Times\" color=\"orange\">Invoiceno</font></th>\n");
      out.write("            <th><font size=\"4\" face=\"Times\" color=\"orange\">Food ID</font></th>\n");
      out.write("            <th><font size=\"4\" face=\"Times\" color=\"orange\">Customer ID</font></th>\n");
      out.write("            <th><font size=\"4\" face=\"Times\" color=\"orange\">Order ID</font></th>\n");
      out.write("            <th><font size=\"4\" face=\"Times\" color=\"orange\">Total Bill</font></th>\n");
      out.write("            <th><font size=\"4\" face=\"Times\" color=\"orange\">Vat</font></th>\n");
      out.write("            <th><font size=\"4\" face=\"Times\" color=\"orange\">Payable Money</font></th>\n");
      out.write("            <th><font size=\"4\" face=\"Times\" color=\"orange\">Status</font></th>\n");
      out.write("            <th><font size=\"4\" face=\"Times\" color=\"orange\">Sales Date</font></th>\n");
      out.write("            <th><font size=\"4\" face=\"Times\" color=\"orange\">Sales User</font></th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","raihan158851");  
        Statement stmt = con.createStatement();
        String sql ="select * from sales where invoiceno in(select max(invoiceno)from sales)";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next())
        {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><font size=\"4\" face=\"Times\" color=\"white\">");
      out.print(rs.getString("invoiceno") );
      out.write("</font></td>\n");
      out.write("                <td><font size=\"4\" face=\"Times\" color=\"white\">");
      out.print(rs.getString("foodid") );
      out.write("</font></td>\n");
      out.write("                <td><font size=\"4\" face=\"Times\" color=\"white\">");
      out.print(rs.getString("customerid") );
      out.write("</font></td>\n");
      out.write("                <td><font size=\"4\" face=\"Times\" color=\"white\">");
      out.print(rs.getString("orderid") );
      out.write("</font></td>\n");
      out.write("                <td><font size=\"4\" face=\"Times\" color=\"white\">");
      out.print(rs.getDouble("totalbill") );
      out.write("</font></td>\n");
      out.write("                <td><font size=\"4\" face=\"Times\" color=\"white\">");
      out.print(rs.getDouble("vat") );
      out.write("</font></td>\n");
      out.write("                <td><font size=\"4\" face=\"Times\" color=\"white\">");
      out.print(rs.getDouble("payablemoney") );
      out.write("</font></td>\n");
      out.write("                <td><font size=\"4\" face=\"Times\" color=\"white\">");
      out.print(rs.getString("status") );
      out.write("</font></td>\n");
      out.write("                <td><font size=\"4\" face=\"Times\" color=\"white\">");
      out.print(rs.getString("salesdate") );
      out.write("</font></td>\n");
      out.write("                <td><font size=\"4\" face=\"Times\" color=\"white\">");
      out.print(rs.getString("salesuser") );
      out.write("</font></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

        }
        
        con.close();
        
            }
            catch(Exception e)
            {
                out.println(e);
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("        <br><br><br><input type=\"submit\"  value=\"      Back To Customer Details       \" style=\"font-size:20pt;color:white;background-color:gray;border:2px solid #336600;padding:3px\">\n");
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
