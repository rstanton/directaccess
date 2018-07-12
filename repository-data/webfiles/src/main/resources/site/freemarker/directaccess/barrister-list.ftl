<#include "../include/imports.ftl">

<#if pageable?? && pageable.items?has_content>
	<section id="barrister-list" class="wrapper special">
		<div class="inner">
            <header>
                <h2>Our Barristers</h2>
            </header>

			<#assign size=pageable.items?size/>
			
			<div class="flex flex-2">
				<#list pageable.items as item>
                    <article id=${item.name}>
                        <@hst.manageContent hippobean=item/>
                        <@hst.link var="link" hippobean=item/>
                        <@hst.link var="img" hippobean=item.imagelink.mediumsquare/>


                        <div class="box fit person">
                            <div class="image left">
                                <a href="${link}"><img src="${img}"/></a>
                            </div>

                            <#if item.name ??>
                                <header><h3 class="align-left"><a href="${link}">${item.name?html}</a></h3></header>
                            </#if>

                            <#if item.overview??>
                                <p><@hst.html hippohtml=item.overview/></p>
                            </#if>
                            
                            <footer>
                                <a href=${link} class="button">More</a>
                            </footer>
                        </div>
                    </article>
				</#list>
			</div>
		</div>
	</section>
</#if>
