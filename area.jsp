<html>
<head>
<title>JSP</title>
</head>
<body>
<%! double area (double r)
  {
       return 3.14*r*r;
  }
%>
<p> area of circle: <%=area(5)%></p>
<% ! double area(double l,double b)
 { 
      return l*b;
 }
%>
<p> area of rectangle: <%=area(5,5)%></p>
<% ! double area(double a,double b,double c)
 {    
      double s=a+b+c/2;
      return Math.sqrt(s*(s-a)*(s-b)*(s-c));
 }
%>
<p> area of triangle: <%=area(5,5,5)%></p>
</body>
</html>