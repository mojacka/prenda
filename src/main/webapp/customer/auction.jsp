<%@include file="../public/header.jsp"%>
</head>
<body>

<!--%@include file="auth.jsp"%-->
<TABLE border="1" class="main" width="100%">
	<TBODY>
		<TR>
			<TD><IMG border="0" src="${contextPath}/resources/img/logo.png" width="135"
				height="123"></TD>
			<TD><%@include file="../public/navi.jsp"%></TD>
		</TR>
		<TR>
			<TD valign="top" width="200"><%@include file="menu.jsp"%></TD>
			<TD valign="top" align="center">
<%@include file="../public/msg.jsp"%>
<c:set var="perpage" value="${10}"/><!--page.rows[0].pullout-->
<sql:query var="pageable" dataSource="${prenda}">
SELECT count(pawn.pid) as numid FROM pawn
LEFT JOIN pullout ON pawn.pid=pullout.pid
WHERE pawn.pid=pullout.pid
AND auction=1
<c:if test="${param.bcode==1}">
<c:out value="AND bcode=1" />
</c:if>
</sql:query>
<c:set var="numid" value="${pageable.rows[0].numid}" />
<c:set var="pages" value="${numid/perpage}" />
<c:set var="adjust" value="${numid % perpage}" />
<c:if test="${adjust!=0}">
				<c:set var="pages" value="${pages-(adjust/perpage)+1}" />
			</c:if>
<c:set var="pagenum" value="${param.pagenum}" />
<c:if test="${pagenum==null || pagenum<1 || pagenum>pages}">
				<c:set var="pagenum" value="1" />
			</c:if>
<br/>
			Page 
<c:if test="${pagenum>1}">
				<A href='pulloutsummary.jsp?pagenum=<c:out value="${pagenum-1}"/>'>prev</A>
			</c:if>
<c:forEach var="i" begin="1" end="${pages}">
				<c:choose>
					<c:when test="${i!=pagenum}">
						<A href='pulloutsummary.jsp?pagenum=<c:out value="${i}"/>'><c:out
							value="${i}" /></A>
					</c:when>
					<c:otherwise>
						<c:out value="${i}" />
					</c:otherwise>
				</c:choose>
			</c:forEach>
<c:if test="${pagenum<(pages-(adjust/perpage))}">
				<A href='pulloutsummary.jsp?pagenum=<c:out value="${pagenum+1}"/>'>next</A>
			</c:if>
<sql:query var="pullout" dataSource="${prenda}">
SELECT pawn.pid,branch,loan_date,loan,pullout_date,bpid,description,service_charge,rate
FROM pawn
LEFT JOIN pullout ON pawn.pid=pullout.pid
LEFT JOIN interest ON pawn.branch=interest.interestid
WHERE day=34
AND pawn.pid=pullout.pid
AND auction=1
<c:if test="${param.bcode==1}">
<c:out value="AND bcode=1" />
</c:if>
ORDER BY pawn.pid
LIMIT <c:out value="${(pagenum-1)*perpage}" />,<c:out value="${perpage}" />
</sql:query>
			<form method="post" action="${contextPath}/auction.pdf">
				<input type="hidden" name="branch" value="${user.branchId}"/>
				<input type="hidden" name="bname" value="${branch.name}"/>
				<input type="hidden" name="baddress" value="${branch.address}"/>
				<input type="submit" value="Generate PDF"/>
			</form>
			<TABLE border="1">
				<TR>
					<TH colspan="100%">Auction Items</TH>
				</TR>
				<TR>
					<TH>Pawn ID</TH>
					<TH>Branch PID</TH>
					<TH>Acquisition Date</TH>
					<TH>Availability Date</TH>
					<TH>Description</TH>
					<TH>Price</TH>
					<!--TH>Rate</TH>
					<TH>Interest</TH>
					<TH>Net</TH-->
				</TR>
				<c:forEach var="row" items="${pullout.rows}" varStatus="line">
					<c:choose>
						<c:when test="${line.count % 2 == 1}">
							<TR bgcolor="#99CCFF">
						</c:when>
						<c:otherwise>
							<TR>
						</c:otherwise>
					</c:choose>
					<TD><fmt:formatNumber value="${row.pid}" minIntegerDigits="10" groupingUsed="false"/></TD>
					<TD><fmt:formatNumber value="${row.branch}" minIntegerDigits="2" groupingUsed="false"/>-<fmt:formatNumber value="${row.bpid}" minIntegerDigits="8" groupingUsed="false"/></TD>
					<TD><fmt:formatDate value="${row.loan_date}" dateStyle="long" /></TD>
					<TD><fmt:formatDate value="${row.pullout_date}" dateStyle="long" /></TD>
					<TD><c:out value="${row.description}"/></TD>
					<TD align="right"><fmt:formatNumber maxFractionDigits="2" minFractionDigits="2" value="${(1+10/100)*row.loan}" /></TD>
					<!--TD align="right"><fmt:formatNumber maxFractionDigits="2" minFractionDigits="2" value="${row.rate}" /></TD>
					<TD align="right"><fmt:formatNumber maxFractionDigits="2" minFractionDigits="2" value="${row.loan*row.rate/100}" /></TD>
					<TD align="right"><fmt:formatNumber maxFractionDigits="2" minFractionDigits="2" value="${(1 + row.rate/100 )*row.loan+row.service_charge}" /></TD-->
				</TR>
				</c:forEach>
			</TABLE>
			</TD>
		</TR>
	</TBODY>
</TABLE>
</body>
</html>