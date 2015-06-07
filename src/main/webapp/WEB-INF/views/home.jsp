<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>CHAN SUCCESS</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p>a+b= ${add}</p>
<p>a-b= ${sub}</p>
<p>a*b= ${mul}</p>
<p>a/b= ${divide}</p>
<p>${DB_result}</p>

</body>
</html>
