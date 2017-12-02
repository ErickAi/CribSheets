------------------------------------------------------------|
JSP файл для отрисовки данных с сервлета на стороне клиента
	создать файл в директории {project}/src/main/webapp/[jsp_name].jsp
<!-- тег настроек jsp файла-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- тег JSTL-core. для проверки условий и цикличных выводов
	для работы тега в pom.xml добавляем зависимость
	<dependency>
		<groupId>jstl</groupId>
		<artifactId>jstl</artifactId>
		<version>1.2</version>
	</dependency>
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<h2>Meals</h2>
</body>
</html>