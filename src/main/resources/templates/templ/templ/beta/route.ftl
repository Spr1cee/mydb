<#import "templ/templ.ftl" as p>
<p.pages>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<div class=""row row-cols-2 row-cols-md-2 g-4">

<#if allRoute??>
<#list allRoute as route>
<div class="col"
     <div class="card">
         <a href="/route/${route.id}">
         <img src="/static/images/" class="card-img-top" alt="...">\
         </a>
         <div class="card-body">
             <h5 class="card-title">${route.name}</h5>
             <p class="card-text">${route.description}</p>
         </div>
</#list>
</#if>

</div>


</body>
</html>
</p.pages>