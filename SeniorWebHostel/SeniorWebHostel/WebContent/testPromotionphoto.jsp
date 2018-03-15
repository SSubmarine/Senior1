<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Image File Upload</title>
</head>
<body>
	<h1>File Upload Example - JavaTpoint</h1>
	<h3 style="color: red">${filesuccess}</h3>
	<form:form method="post" action="editPromotionWithImage.do"
		enctype="multipart/form-data"
		commandName="promotion" 
		>
		<p>
			<label for="image">Choose Image</label>
		</p>
		<p>

			<input name="file" id="fileToUpload" type="file" />
		</p>
		<p>
			<label for="image">Promotion type</label>
		</p>
		<p>

			<form:input path="promotionName" id="promotionName" type="text" />
		</p>
		<p>
			<input type="submit" value="Upload">
		</p>
	</form:form>
</body>
</html>
