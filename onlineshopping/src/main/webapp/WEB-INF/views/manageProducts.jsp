<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<div class="container">
	<div class="row justify-content-md-center">
		<div class="col-md-8 my-1">
			<c:if test="${not empty message}">
				<div class="col-xs-12">
					<div class="alert alert-success alert-dismissible">
						<button type="button" class="close" data-dismiss="alert">&times;</button>
						${message}
					</div>
				</div>
			</c:if>
			<div class="card">
				<h5 class="card-header">Product Management</h5>
				<div class="card-body">

					<!-- Form Elements -->
					<sf:form class="form-horizontal" modelAttribute="product"
						action="${contextRoot}/manage/products" method="POST"
						enctype="multipart/form-data">

						<div class="form-group row">
							<label class="col-sm-4 col-form-label" for="name">Enter
								Product Name: </label>
							<div class="col-sm-8">
								<sf:input type="text" path="name" id="name"
									placeholder="Product Name" class="form-control" />
								<sf:errors path="name" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group row">
							<label class="col-sm-4 col-form-label" for="brand">Enter
								Brand Name: </label>
							<div class="col-sm-8">
								<sf:input type="text" path="brand" id="brand"
									placeholder="Brand Name" class="form-control" />
								<sf:errors path="brand" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group row">
							<label class="col-sm-4 col-form-label" for="description">Product
								Description: </label>
							<div class="col-sm-8">
								<sf:textarea path="description" id="description" rows="4"
									placeholder="Write a description" class="form-control"></sf:textarea>
								<sf:errors path="description" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group row">
							<label class="col-sm-4 col-form-label" for="unitPrice">Enter
								Unit Price: </label>
							<div class="col-sm-8">
								<sf:input type="text" path="unitPrice" id="unitPrice"
									placeholder="Unit Price in &#8377" class="form-control" />
								<sf:errors path="unitPrice" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group row">
							<label class="col-sm-4 col-form-label" for="quantity">Quantity
								Available: </label>
							<div class="col-sm-8">
								<sf:input type="text" path="quantity" id="quantity"
									placeholder="Quantity Available" class="form-control" />
							</div>
						</div>

						<!-- File element for Image Upload -->
						<div class="form-group row">
							<label class="col-sm-4 col-form-label" for="file">Select
								an Image: </label>
							<div class="col-sm-8">	
							<div class="custom-file">
								<sf:input type="file" path="file" id="file" class="form-control custom-file-input" />
								<label for="file" class="custom-file-label text-truncate">Choose
									file...</label>
							</div>
							<sf:errors path="file" cssClass="help-block" element="em"/>
							</div>
						</div>



						<div class="form-group row">
							<label class="col-sm-4 col-form-label" for="categoryId">Select
								Category: </label>
							<div class="col-sm-8">
								<sf:select class="form-control" id="categoryId"
									path="categoryId" items="${categories}" itemLabel="name"
									itemValue="id" />
							</div>
						</div>


						<div class="form-group row">
							<div class="col-md-10">
								<input type="submit" name="submit" id="submit" value="Submit"
									class="btn btn-primary float-right" />
								<!-- hidden fields for products -->
								<sf:hidden path="id" />
								<sf:hidden path="code" />
								<sf:hidden path="supplierId" />
								<sf:hidden path="active" />
								<sf:hidden path="purchases" />
								<sf:hidden path="views" />
							</div>
						</div>

					</sf:form>

				</div>
			</div>

		</div>

	</div>






	<div class="row ">
	
	<div class="col-lg-12">
	<hr/>
	<h3>Available Products</h3>
	<hr/>
	</div>
	
	<div class="col-lg-12">
	
	<!-- Product table for admin -->
	<table id="adminProductsTable" class="table table-striped table-bordered">
							
				<thead>					
					<tr>					
						<th>Id</th>
						<th>&#160;</th>
						<th>Name</th>
						<th>Brand</th>
						<th>Qty. Avail</th>
						<th>Unit Price</th>
						<th>Activate</th>				
						<th>Edit</th>
					</tr>					
				</thead>
				
				<tfoot>
					<tr>					
						<th>Id</th>
						<th>&#160;</th>
						<th>Name</th>
						<th>Brand</th>
						<th>Qty. Avail</th>
						<th>Unit Price</th>
						<th>Activate</th>				
						<th>Edit</th>
					</tr>									
				</tfoot>
				
							
			</table>
	</div>
	
	
	</div>



</div>