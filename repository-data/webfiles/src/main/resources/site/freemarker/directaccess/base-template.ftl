<!DOCTYPE html>
<#include "../include/imports.ftl">

<@hst.setBundle basename="essentials.homepage"/>

<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title> <@fmt.message key="homepage.title" var="title"/>${title?html} </title>
    <link rel="stylesheet" href="<@hst.webfile  path="/css/bootstrap.css"/>" type="text/css"/>
    <#if hstRequest.requestContext.cmsRequest>
      <link rel="stylesheet" href="<@hst.webfile  path="/css/cms-request.css"/>" type="text/css"/>
    </#if>
    <@hst.headContributions categoryExcludes="htmlBodyEnd, scripts" xhtml=true/>
</head>
<body>
    <!-- These are the important bits, they're place holders for Hippos dynamic components -->
    <!-- Header -->
	<@hst.include ref="menu"/>

	<@hst.include ref="main"/>
    <P>Hello World!</P>
    
	<!-- Footer -->
	<@hst.include ref="footer"/>
    <@hst.headContributions categoryIncludes="htmlBodyEnd, scripts" xhtml=true/>
</body>

</html>
