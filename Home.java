import java.io.*;
import javax.servlet.*;
import Javax.servlet.http.*;
public class Mysearch extends HttpServlet
{
 public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
  try {
        res.getContentType("text/html");
        PrintWriter pw=res.getWriter();
        HttpSession s=req.getSession();
       if(s.getAttribute("Name")==null)
       {
         String url=res.encode RedirectURL("a.html");
         res.sendRedirect(url);
       }
       pw.println("login Succesfully");
     }
     catch(Exception e)
     { 
        Sysyem.out.println(e);
     }
            
}
}
