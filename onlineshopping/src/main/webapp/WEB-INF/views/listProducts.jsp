<div class="container">
	
	<div class="row">
	
	<!-- would be to display sidebar -->
	<div class="col-md-3">
	
	<%@include file="./shared/sidebar.jsp" %>
	
	</div>
	
	<div class="col-mid-9">
		<!-- add beadcrumb component -->
		<div class="row my-1">
		<c:if test="${userClickAllProducts == true}">
			<ol class="col-lg-12 breadcrumb">			
				<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a>
				<li class="breadcrumb-item">All Products</li>
			</ol>
		</c:if>
		
		<c:if test="${userClickCategoryProducts == true}">
			<ol class="col-lg-12 breadcrumb">			
				<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a>
				<li class="breadcrumb-item active">Category</li>
				<li class="breadcrumb-item active">${category.name}</li>
			</ol>
		</c:if>
		</div>
	
	</div>
	
	
	</div>

</div>