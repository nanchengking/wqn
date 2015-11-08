<#macro page title styles=[] config={}>
<html>
    <head><title>${title?html} - 爬虫</title>
        <link rel="stylesheet" media="all" href="/res/css/bootstrap.css" >
        <link rel="stylesheet" media="all" href="/res/css/main.css" >
        <script src="/res/js/jquery-1.11.3.min.js"></script>
        <script src="/res/js/bootstrap.js"></script>
		<script src="/res/js/main.js"></script>
      <#if (config.table)??>
        <link rel="stylesheet" media="all" href="/res/css/plugin/bootstrap-table.css" >
        <script src="/res/js/plugin/bootstrap-table.js"></script>
        <script src="/res/js/plugin/locale/bootstrap-table-zh-CN.js"></script>
      </#if>
        <link rel="stylesheet" media="all" href="/res/css/plugin/select2.css" >
        <script src="/res/js/plugin/select2.js"></script>
      <#if (config.datetimepicker)??>
        <link rel="stylesheet" media="all" href="/res/css/plugin/bootstrap-datetimepicker.min.css" >
        <script src="/res/js/plugin/moment.min.js"></script>
        <script src="/res/js/plugin/bootstrap-datetimepicker.min.js"></script>
      </#if>
      <#if (config.typeahead)??>
        <link rel="stylesheet" media="all" href="/res/css/plugin/typeahead.css" >
        <script src="/res/js/plugin/typeahead.bundle.js"></script>
      </#if>
      <#if styles?exists>
      <#list styles as css>
        <link rel="stylesheet" media="all" href="/res/css/${css}" >
      </#list>
      </#if>
    </head>
    <body>
        <#include "header.ftl">
        <!-- 正文部分 -->
        <div class="container">
        <#nested/>
        </div>
        <!-- footer section -->
        <#include "footer.ftl">
    </body>
</html>
</#macro>

<#-- TABLE LAYOUT -->
<#macro table title>
</#macro>