import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ClientPullMove extends HttpServlet 
{
   static final String NEW_HOST = "http://www.facebook.com";
   public void doGet(HttpServletRequest req, HttpServletResponse res)
   throws ServletException, IOException 
{
   res.setContentType("text/html");
   PrintWriter out = res.getWriter();
   String newLocation = NEW_HOST + req.getRequestURI();
   res.setHeader("Refresh", "15; URL=" + newLocation);
   out.println("The requested URI has been moved to a different host.<BR>");
   out.println("Its new location is " + newLocation + "<BR>");
   out.println("Your browser will take you there in 15 seconds.");
}
}
