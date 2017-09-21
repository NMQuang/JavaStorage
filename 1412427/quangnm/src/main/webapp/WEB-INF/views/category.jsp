<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<jsp:include page="layout/_header.jsp" />

<div class="student-content">
	<div class="container">
		<div class="row">
			<h4 class="text-center">
				<b>Category</b>
			</h4>
			<div class="row">
				<c:if test="${role !='USER'}">
					<button type="button" class="btn btn-success  col-md-1"
						data-toggle="modal" data-target="#modalInsertUpdate"
						onclick="clearForm()">Insert</button>
				</c:if>
				<div class="col-md-5 col-md-push-6">
					<div id="custom-search-input">
						<div class="input-group col-md-12">
							<input type="text" id="search" class="form-control input-lg"
								placeholder="Name, Brand" onkeyup="searchCategory()" />
							<span class="input-group-btn">
								<button class="btn btn-info btn-lg" type="button"
									onclick="searchCategory()">
									<i class="glyphicon glyphicon-search"></i>
								</button>
							</span>
						</div>
					</div>
				</div>
			</div>
			<table id="data-category" class="table table-hover">
				<thead>
					<tr>
						<th>Name</th>
						<th>Brand</th>
						<c:if test="${role !='USER'}">
							<th>Action</th>
						</c:if>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="category" items="${categories}">
						<tr>
							<td>${category.name}</td>
							<td>${category.brand}</td>

							<td>
							<c:if test="${role !='USER'}">
								<button type='button' class='btn btn-success' data-toggle='modal' data-target='#modalInsertUpdate'
										onclick='getCategoryInfo("${category.id}")'>Update</button>
								
								<button type='button' class='btn btn-danger' data-toggle='modal' data-target='#modalDelete'
											onclick='showDeleteCategory("${category.id}")'>Delete</button>
							
							</c:if>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<ul class="pagination col-sm-4 col-sm-push-4">
				
			</ul>
			<!-- Modal Update-->
			<div class="modal fade" id="modalInsertUpdate" role="dialog">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Modal Header</h4>
						</div>
						<div class="modal-body">
							<form>
								<div class="form-group">
									<label for="exampleInputEmail1">Name</label> <input type="text"
										class="form-control" id="name" placeholder="Name">
									<div id="error-name"
										class="error-message alert alert-danger alert-hide"></div>
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Brand</label> <input type="text"
										class="form-control" id="brand" placeholder="Brand">
									<div id="error-name"
										class="error-message alert alert-danger alert-hide"></div>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-danger"
										data-dismiss="modal">Close</button>
									<button type="button" id="submitUpdate" class="btn btn-primary"
										onclick="updateOrInsertCategory()">Submit</button>
								</div>
							</form>
						</div>

					</div>
				</div>
			</div>
			<!-- Delete -->
			<div class="modal fade" id="modalDelete" role="dialog">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Modal Header</h4>
						</div>
						<div class="modal-body">
							<p class="bg-danger">Do you want delete this record?</p>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-danger"
								onclick="deleteCategoryInfo()">OK</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="layout/_footer.jsp" />