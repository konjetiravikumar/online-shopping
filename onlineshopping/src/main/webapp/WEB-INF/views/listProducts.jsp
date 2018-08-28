<div class="container">

	<div class="row">

		<!-- would be to display sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- to display the actual products -->
		<div class="col-mid-9">
			<!-- add beadcrumb component -->
			<div class="row my-1">
				<c:if test="${userClickAllProducts == true}">
					<script>
						window.categoryId = '';
					</script>
					<ol class="col-lg-12 breadcrumb">
						<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a>
						<li class="breadcrumb-item">All Products</li>
					</ol>
				</c:if>

				<c:if test="${userClickCategoryProducts == true}">

					<script>
						window.categoryId = '${category.id}';
					</script>

					<ol class="col-lg-12 breadcrumb">
						<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a>
						<li class="breadcrumb-item active">Category</li>
						<li class="breadcrumb-item active">${category.name}</li>
					</ol>
				</c:if>
			</div>
			<div class="row">
				<div class="col-xs-12 px-5">
					<table id="productListTable"
						class="table table-striped table-borderd">
						<thead>
							<tr>
								<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Available</th>
								<th></th>
							</tr>
						</thead>

						<tfoot>
							<tr>
								<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Available</th>
								<th></th>
							</tr>
						</tfoot>
					</table>
				</div>

			</div>
		</div>


	</div>

</div>