<#include "../include/imports.ftl">

<section id="main" class="wrapper">
<#if document??>
	<@hst.link var="img" hippobean=document.imagelink/>
	
    
    <div class="inner">
		<header class="align-center">
			<h2>${document.name}</h2>
			<p>${document.overview?html}</p>			
		</header>
		<p>
			<span class="image left">
				<img src="${img}" alt="${document.name}"/>
			</span>
			<@hst.html hippohtml=document.expertise/>
		</p>
        <#if document.chambers??>
            <@hst.link var="link" hippobean=document.chambers/>
            
            <p><a href=${link}>${document.chambers.name}</a></p>
        </#if>
	</div>
</#if>
