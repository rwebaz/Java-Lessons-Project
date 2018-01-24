<%
String format = request.getParameter("dateformat");
out.print(new java.text.SimpleDateFormat(format)
                  .format(new java.util.Date()));
%>
