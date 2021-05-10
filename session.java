import java.io.*;
import javax.servlet.*;
import Javax.servlet.http.*;
public class e2 extends HttpServlet
{
 public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
  res.setContentType("text/html");
  PrintWriter pw=res.getWriter();
  HttpSession s=req.getSession();
  Date d=(Date) hs.getAttribute("date");
  if(d==null)
  {
     hs.setAttribute("Previous_user"," ");
     hs.setAttribute("Current_user"," ");
  }
  String old=(String)hs.getAttribute("Previous_user");
   String cur=(String)hs.getAttribute("Current_user"); 
  if(d!=null && old!=" ")
  {
    pw.println("Previous login:<br>");
    pw.println("Username"+old+"<br>");
    pw.println("Login time and date:"+d+"<br>");
  }
  d=new Date();
  hs.setAttribute("date",d);
  cur=req.getParameter("t1");
  hs.setAttribute("Current_user",cur);
  old=cur;
  pw.println("Current login:<br>");
  pw.println("Username:"+cur+"<br>");
  pw.println("Login time and date:"+d+"<br>");
  pw.println("Previous_user",old);
}
}




