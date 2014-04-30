<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net/el"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Time Expression - Timesheet List</title>
<link href="includes/timex.css" rel="stylesheet" type="text/css">
</head>

<body>
<table width="85%" border="1" align="center" cellpadding="0"
	cellspacing="0">
	<tr>
		<td>
		<table width="100%" border="0" align="center" cellpadding="4"
			cellspacing="0" bordercolor="#CCCCCC">
			<tr bgcolor="#C2DCEB" valign="middle">
				<td width="90%" height="60">
				<h1>Timesheet List</h1>
				</td>
				<td align="right"><a href="signout.htm">Sign out</a></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<p><!-- errors/messages --> <%@ include
					file="/WEB-INF/jsp/includemessages.jsp"%></p>
				<p align="center"><a href="enterhours.htm">Click here</a> to add a
				new timesheet, or select one from the list below.</p>

				<display:table name="timesheets" id="timesheet" defaultsort="1"
					requestURI="timesheetlist.htm" cellpadding="5" cellspacing="0"
					export="false" class="tableborder">
					<display:column sortable="true" title="Period Ending"
						href="enterhours.htm" sortProperty="periodEndingDate"
						paramId="tid" paramProperty="timesheetId" class="tdcenter">
						<fmt:formatDate value="${timesheet.periodEndingDate}" type="date"
							pattern="MM/dd/yyyy" />
					</display:column>
					<display:column sortable="true" title="Hours"
						sortProperty="totalMinutes" class="tdright">
						<fmt:formatNumber value="${timesheet.totalMinutes / 60.0}"
							pattern="0.00" />
					</display:column>
					<display:column property="department.name" sortable="true"
						title="Department" />
					<display:column sortProperty="timesheetId" sortable="true"
						title="Timesheet Id" class="tdcenter">
						<fmt:formatNumber value="${timesheet.timesheetId}" pattern="000" />
					</display:column>
				</display:table> <br>
				<br>
				</td>
			</tr>
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
