<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Hello ${userName}
<br/>

 <form class="navbar-form pull-right" action="logout"
            method="post">
            <input type="hidden" name="${_csrf.parameterName}"
                value="${_csrf.token}" /> <input type="submit" value="Log out" />
 </form>

</body>
</html>