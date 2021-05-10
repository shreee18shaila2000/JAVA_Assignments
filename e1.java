import java.io.*;
import javax.servlet.*;
import Javax.servlet.http.*;
public class e1 extends HttpServlet
{
 public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
  int e="403";
  res.setContentType("text/html");
  String name=req.getParameter("t1");
  String pas=req.getParameter("t2");
 if(name.equals("shaila") && pas.equals("shree@"))
 {
    PrintWriter pw=res.getWriter();
    pw.println("login successfully");
 }
 else
 { 
   res.sendError(e);
 }
}
}

