<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Time Expression - Sign In</title>
<link href="includes/timex.css" rel="stylesheet" type="text/css">
</head>

<form method="post">
<table width="85%" border="1" align="center" cellpadding="0"
	cellspacing="0">
	<tr>
		<td>
		<table width="100%" border="0" align="center" cellpadding="4"
			cellspacing="0" bordercolor="#CCCCCC">
			<tr bgcolor="#C2DCEB" valign="middle">
				<td width="90%" valign="middle">
				<h1>Sign In</h1>
				</td>
			</tr>
			<tr>
				<td colspan="2"><!-- errors/messages --> <%@ include
					file="/WEB-INF/jsp/includemessages.jsp"%>

				<div align="center">
				<p>Please provide your authentication information below.</p>
				<p>Employee Id: <spring:bind path="command.employeeId">
					<input name='<c:out value="${status.expression}"/>'
						value='<c:out value="${status.value}"/>' type="text" size="6"
						maxlength="6">
				</spring:bind> &nbsp;Password: <spring:bind path="command.password">
					<input name='<c:out value="${status.expression}"/>'
						value='<c:out value="${status.value}"/>' type="password" size="8"
						maxlength="10">
				</spring:bind> &nbsp;<input type="submit" name="Submit"
					value="Sign In"></p>
				</div>
				</form>
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
