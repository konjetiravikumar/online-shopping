<h1 class="my-4">Shop Name</h1>
<div class="list-group">
	<c:forEach items="${categories}" var="category">
	<a href="${contextRoot}/show/category/${category.id}/products" id="a_${category.name}" class="list-group-item list-group-item-action">${category.name}</a>	
	</c:forEach>
</div>