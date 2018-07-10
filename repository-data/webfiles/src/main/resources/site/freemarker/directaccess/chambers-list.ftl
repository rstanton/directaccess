<#include "../include/imports.ftl">

<#if pageable?? && pageable.items?has_content>
	<section id="people-summary" class="wrapper">
		<div class="inner">

			<#assign size=pageable.items?size/>
			
			<div class="flex flex-2">
				<#list pageable.items as item>
				    <@hst.manageContent hippobean=item/>
					<@hst.link var="link" hippobean=item/>
	
					
					<div class="box fit person">

						<#if item.name ??>
							<h3 class="align-center"><a href="${link}">${item.name?html}</a></h3>
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
