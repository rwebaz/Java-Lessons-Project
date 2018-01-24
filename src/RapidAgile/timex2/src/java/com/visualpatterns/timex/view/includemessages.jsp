<center>
<spring:bind path="command.*">
	<c:if test="${not empty status.errorMessages}">
		<c:forEach var="error" items="${status.errorMessages}">
			<font color="red"><c:out value="${error}" escapeXml="false" />
			</font>
			<br />
		</c:forEach>
	</c:if>
</spring:bind>

<!-- status messages -->
 <c:if
	test="${not empty message}">
	<font color="green"><c:out value="${message}" /></font>
	<c:set var="message" value="" scope="session" />
</c:if>
</center>
