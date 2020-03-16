import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

 public class servlet extends HttpServlet
 {
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
    {
      try
       { 
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html>");       
        out.println("<body>");
        java.util.Properties p=System.getProperties();
        out.println("Server Name :"+req.getServerName()+"<br>");       
        out.println("Operating System Name :"+p.getProperty("Linux")+"<br>");
        out.println("IP Address :"+req.getRemoteAddr()+"<br>");       
        out.println("Remote User:"+req.getRemoteUser()+"<br>");
        out.println("Remote Host:"+req.getRemoteHost()+"<br>");
        out.println("Local Name :"+req.getLocalName()+"<br>");        
        out.println("Server Port:"+req.getServerPort()+"<br>");       
        out.println("Servlet Name :"+this.getServletName()+"<br>");
        out.println("Protocol Name :"+req.getProtocol()+"<br>");    
        out.println("</html>");                  
        out.println("</body>");
       }
       catch(Exception e)
       {
         e.printStackTrace();

       }
    }
 }