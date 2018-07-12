<#include "../include/imports.ftl">

<section id="main" class="wrapper">
<#if document??>
	<@hst.link var="img" hippobean=document.imagelink/>
	
    
    <div class="inner">
        ${document.name}
        ${document.address.street}
	</div>
</#if>
