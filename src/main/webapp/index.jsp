<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String path = request.getContextPath();
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="<%=path%>/static/js/jquery-1.9.1.js"></script>
</head>
<body>
	<button onclick="test(2000)">抢红包测试</button>
</body>
<script type="text/javascript">
	function test(usernum){
		console.log("usernum:"+usernum);
		for(var i = 0; i < usernum; i++){
			console.log("i:"+i);
			$.post('<%=path%>/redpack/grab', {'userid':i},function(data){
				console.log(data);
			})
		}
	}
</script>
</html>