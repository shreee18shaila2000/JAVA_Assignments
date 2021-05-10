import java.io.*;
import javax.servlet.*;
import Javax.servlet.http.*;
public class e2 extends HttpServlet
{
 public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
  res.setContentType("text/html");
  String name=req.getParameter("t3");
  String pas=req.getParameter("t4");
   int e="403";
 if(name.equals("shaila") && pas.equals("shree@"))
 {
   String url=res.encodeRedirectURL("HOME");
   res.sendRedirect(url);
 }
 else
 { 
   res.sendError(e,"Incorrect");
 }
}
}

