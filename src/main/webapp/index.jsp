<%@page isELIgnored="false"%>
<html>
<body>
	<h2><u>How to insert image in database using Spring MVC</u></h2>

	<form action="InsertImage" method="post" enctype="multipart/form-data">

		<pre>
		
	Name: <input type="text" name="name">
				
	Age: <input type="number" name="age">
				
	Photo: <input type="file" name="photo">
				
	<input type="submit" value="Submit">

</pre>

	</form>

	<p>${msg}</p>








</body>
</html>