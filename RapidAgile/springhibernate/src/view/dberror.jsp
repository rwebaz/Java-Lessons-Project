<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Time Expression - System Exception</title>
<style>
h1 {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 24px; font-weight:800; color:#666666}
p {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 12px; }
</style>
</head>


<table width="85%" border="1" align="center" cellpadding="0"
	cellspacing="0">
	<tr>
		<td>
		<table width="100%" border="0" align="center" cellpadding="4"
			cellspacing="0" bordercolor="#CCCCCC">
			<tr bgcolor="#C2DCEB" valign="middle">
				<td width="90%" valign="middle">
				<h1>System Exception</h1>
				</td>
			</tr>
			<tr>
				<td colspan="2" bgcolor="#FFFFFF">
<p>The following unhandled system exception occurred: <%= new java.util.Date() %></p>

<pre>
<%
  Exception ex = (Exception)request.getAttribute("exception");
  if (ex != null)
      ex.printStackTrace(new java.io.PrintWriter(out));
%>
</pre>
				</td>
			</tr>
			<tr>
				<td colspan="2" bgcolor="#C2DCEB">&nbsp;</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</body>
</html>
