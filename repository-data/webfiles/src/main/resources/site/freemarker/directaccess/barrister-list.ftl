<#include "../include/imports.ftl">

<#if pageable?? && pageable.items?has_content>
	<section id="people-summary" class="wrapper">
		<div class="inner">

			<#assign size=pageable.items?size/>
			
			<div class="flex flex-2">
				<#list pageable.items as item>
				    <@hst.manageContent hippobean=item/>
					<@hst.link var="link" hippobean=item/>
					<@hst.link var="img" hippobean=item.imagelink.thumbnail/>
					
					
					<div class="box fit person">
						<div class="image">
							<a href="${link}"><img src="${img}"/></a>
						</div>
				
						<#if item.name ??>
							<h3 class="align-center"><a href="${link}">${item.name?html}</a></h3>
						</#if>
                        
                        <#if item.chambers ??>
                            <@hst.link var="chambers" hippobean=item.chambers/>
                            <#if item.chambers.name??>
                                <h4 class="align-center"><a href=${chambers}>${item.chambers.name?html}</a></h4>
                            </#if>
                        </#if>
                        
						<#if item.overview??>
							<p><@hst.html hippohtml=item.overview/></p>
						</#if>
					</div>
				</#list>
			</div>
		</div>
	</section>
</#if>
