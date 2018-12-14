<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#a3{
	display:inline-block;
}
</style>
<script
  src="https://code.jquery.com/jquery-1.12.4.js"
  integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
  crossorigin="anonymous"></script>
<script type="text/javascript">

function plus(){
  	 var a1=$("#a1").val();
	 var a2=$("#a2").val(); 
	 $.ajax({
		url:"/ipm/jieguo2?a1="+a1+"&a2="+a2,
		success:function(data){
			$("#a3").html(data) ;
		}
	});
}
</script>

</head>
<body>
<form action="jieguo" method="post">
number1:<input type ="text" id="a1"  value="${aa[1]}">
number2:<input type ="text" id="a2" value="${aa[0] }">
<input type ="button" onclick="plus()" value="tijiao"/>
</form>
jieguo:${aa[2]}
<div id="a3"></div>
</body>
</html>