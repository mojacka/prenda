<%@include file="../public/header.jsp"%>
</head>
<body>


<TABLE border="1" class="main" width="100%">
	<TBODY>
		<TR>
			<TD><IMG border="0" src="${contextPath}/resources/img/logo.png" width="135"
				height="123"></TD>
			<TD><%@include file="../common/navi.jsp"%></TD>
		</TR>
		<TR>
			<TD valign="top" width="200"><%@include file="../common/menu.jsp"%></TD>
			<TD valign="top" align="center">
<%@include file="../public/msg.jsp"%>
			<FORM method="post" action="${contextPath}/BranchModify">Archive Branch <c:out value="${param.bname}" /> <br/>
			<br/>
			Are you sure? 
			<INPUT type="hidden" name="modtype" value="1"> 
			<INPUT type="hidden" name="branchid" value="${param.branchid}"> 
			<INPUT type="hidden" name="bname" value="${param.bname}"> 
			<INPUT name="delresp" type="submit" value="Cancel"> 
			<INPUT name="delresp" type="submit" value="Confirm"></FORM>
			</TD>
		</TR>
	</TBODY>
</TABLE>
</body>
</html>