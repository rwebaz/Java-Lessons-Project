<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="timex" uri="/WEB-INF/timex.tld"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Time Expression - Enter Hours</title>
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
				<td width="90%" height="60">
				<h1>Enter Hours</h1>
				</td>
				<td align="right"><a href="signout.htm">Sign out</a></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><!-- errors/messages --> <%@ include
					file="/WEB-INF/jsp/includemessages.jsp"%>
				</p>
				<p>Period Ending: <fmt:formatDate
					value="${command.periodEndingDate}" type="date"
					pattern="MMMM dd, yyyy" /></p>
				<table border="1" align="center" cellpadding="8" cellspacing="0">
					<tr>
						<th>Deparment</th>
						<th>Mo</th>
						<th>Tu</th>
						<th>We</th>
						<th>Th</th>
						<th>Fr</th>
						<th>Sa</th>
						<th>Su</th>
						<th>Total</th>
					</tr>
					<tr>
						<td><spring:bind path="command.departmentCode">
							<select name='<c:out value="${status.expression}"/>'>
								<option value=""></option>
								<c:forEach items="${departments}" var="department">
									<option value='<c:out value="${department.departmentCode}"/>'
										<c:if test="${department.departmentCode == status.value}">SELECTED
                      </c:if>><c:out
										value="${department.name}" /></option>
								</c:forEach>
							</select>
						</spring:bind></td>
						<td><spring:bind path="command.minutesMon">
							<input name='<c:out value="${status.expression}"/>'
								value='<c:out value="${status.value}"/>' type="text" size="4"
								maxlength="6">
						</spring:bind></td>
						<td><spring:bind path="command.minutesTue">
							<input name='<c:out value="${status.expression}"/>'
								value='<c:out value="${status.value}"/>' type="text" size="4"
								maxlength="6">
						</spring:bind></td>
						<td><spring:bind path="command.minutesWed">
							<input name='<c:out value="${status.expression}"/>'
								value='<c:out value="${status.value}"/>' type="text" size="4"
								maxlength="6">
						</spring:bind></td>
						<td><spring:bind path="command.minutesThu">
							<input name='<c:out value="${status.expression}"/>'
								value='<c:out value="${status.value}"/>' type="text" size="4"
								maxlength="6">
						</spring:bind></td>
						<td><spring:bind path="command.minutesFri">
							<input name='<c:out value="${status.expression}"/>'
								value='<c:out value="${status.value}"/>' type="text" size="4"
								maxlength="6">
						</spring:bind></td>
						<td><spring:bind path="command.minutesSat">
							<input name='<c:out value="${status.expression}"/>'
								value='<c:out value="${status.value}"/>' type="text" size="4"
								maxlength="6">
						</spring:bind></td>
						<td><spring:bind path="command.minutesSun">
							<input name='<c:out value="${status.expression}"/>'
								value='<c:out value="${status.value}"/>' type="text" size="4"
								maxlength="6">
						</spring:bind></td>
						<td><spring:bind path="command.totalMinutes">
							<c:out value="${status.value}" />
						</spring:bind></td>
					</tr>
				</table>
				<p align="center"><timex:periodcheck
					checkDate="${command.periodEndingDate}">
					<input name="save" type="submit" value="Save">
				</timex:periodcheck> <input name="cancel" type="button"
					value="Cancel"
					onClick="javascript:window.location='timesheetlist.htm'"> <br>
				<br>
				</p>
				</td>
			</tr>
			<tr>
				<td colspan="2" bgcolor="#C2DCEB">&nbsp;</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</form>
<p>&nbsp;</p>
</body>
</html>
