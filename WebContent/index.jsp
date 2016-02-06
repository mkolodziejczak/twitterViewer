<html>
<head>
<title>Twitter Viewer</title>
<style type="text/css">
body {
	font-family: Century Gothic, sans-serif;
}
.filters{
	padding-left:80px;
	color: #50a5e6;
}
.filters h2{
	padding-bottom: 60px;
}
.filter{
	padding-bottom: 40px;
}
</style>
<script type="text/javascript">
	function validate()
	{
		var userInput=document.getElementById("user").value;
		var tagsInput=document.getElementById("tags").value;
		
		if(userInput == "" && tagsInput == "")
		{
			alert("Incorrect filters");
		}
		else
		{
			document.getElementById("filterForm").submit();
		}
	}
</script>
</head>
<body>
	<div style="width: 100%; height:100%; float: left; background-color:#001b34; text-align:center; ">
		<div style="color:#50a5e6;">
			<h2>
				Please enter any filters to begin.
			</h2>
		</div>
		<div class="filters">
		<form id="filterForm" action="welcome.html">
			<h2>Filters</h2>
			<div class="filter">
				<h3>User Account</h3>
				<input type="text" name="user" id="user" value="${sessionScope.user}">
			</div>
			<div class="filter">
				<h3>Tags</h3>
				<input type="text" name="tags" id="tags" value="${sessionScope.tags}">
			</div>
			</form>
			<div class="filter">
				<button onClick="validate()">Search!</button>
			</div>
		</div>
	</div>

</body>
</html>