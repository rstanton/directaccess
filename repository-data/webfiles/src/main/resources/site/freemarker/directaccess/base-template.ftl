<!DOCTYPE html>
<#include "../include/imports.ftl">

<@hst.setBundle basename="tbc.tbc"/>

<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title> Title </title>
</head>
<body>
    <P>Hello World!</P>
    
    <!-- These are the important bits, they're place holders for Hippos dynamic components -->
    <!-- Header -->
	<@hst.include ref="menu"/>

	<@hst.include ref="main"/>
		
	<!-- Footer -->
	<@hst.include ref="footer"/>
</body>
</html>
