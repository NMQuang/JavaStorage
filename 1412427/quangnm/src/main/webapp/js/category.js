var currentPage = 1;
var currentCategoryId;
var patternDate = /^([0-9]{2})\/([0-9]{2})\/([0-9]{4})$/;
var patternNumber = /^[0-9]*$/;

var keyword = $("#search").val();
var token = $("meta[name='jwt']").attr("content");
var role = $("meta[name='role']").attr("content");
var accessDate = new Date();
accessDate.setDate(accessDate.getDate() - 365);

var XML_CHAR_MAP = {
	'<' : '&lt;',
	'>' : '&gt;',
	'&' : '&amp;',
	'"' : '&quot;',
	"'" : '&apos;'
};

function escapeXml(s) {
	return s.replace(/[<>&"']/g, function(ch) {
		return XML_CHAR_MAP[ch];
	});
}

// Search student with value in input#search
// student match if name, code or address containt value
function searchCategory(){
	keyword = $("#search").val();
	$("#data-category tbody").html("");
	getStudentWithPage(currentPage);
	getTotalPage();
}

// Show modal insert of update.
// Get student info with parameter is user id
// and response is detail of user have id is parameter id
function getCategoryInfo(studentId) {
	clearForm();
	$.ajax({
		url : "/quangnm/changeList?id="+studentId,
		dataType:"json",
		success: function(response){
			console.log(response);
			$("#name").val(response.name);
			$("#brand").val(response.brand);
			currentCategoryId = response.id;
		}
	});
}

// If currentStudentId is -1 then insert usert to DB
// If currentStudentId is not -1 then update user
function updateOrInsertCategory() {
	$('.error-message').each(function( index ) {
		$(this).empty();
		$(this).addClass('alert-hide');
	});

	var id = currentStudentId;
	var category = {
		id : currentStudentId,
		name : $("#name").val(),
		brand : $("#brand").val()
	};

	
	var data = JSON.stringify(student);
	var url = '';
	if (currentCategoryId != -1) {
		// updateStudent(currentStudentId, data);
		url = '/quangnm/changeList?id=' + id + "&type=update";
	} else {
		// insertStudent(data);
		url = '/quangnm/changeList?id=' + id + "&type=insert";
	}
	$.ajax({
		type : "POST",
		url : url,
		data : data,
		success : function(reponse) {
			$("#data-category tbody").html("");
			$('#modalInsertUpdate').modal('hide');
			// getStudentWithPage(currentPage);
		},
		error : function(xhr, status, error) {
			console.log(xhr.responseJSON);
			if (typeof xhr.responseJSON.errors !== "undefined"
					&& xhr.responseJSON.errors.length > 0) {
				addErrorMessage(xhr.responseJSON.errors);
			} else {
				console.log(xhr.responseJSON.error);
			}
		}
	});
	
}

// Show message error to form #modalInsertUpdate
function showMessage(field, message){
	$("#error-"+field).append("<p>"+message+"</p>");
	$("#error-"+field).removeClass("alert-hide");
}



// Bind error to view
function addErrorMessage(errors) {
	$.each(errors, function(index, value) {
		if($("#error-" + value.field).text().length <=0){
			$("#error-" + value.field).append("<p>" + value.defaultMessage + "</p>");
			$("#error-" + value.field).removeClass("alert-hide");
		}
	});
}

function showDeleteCategory(userId){
	currentStudentId = userId;
}

// Delete user info with parameter id
function deleteCategoryInfo() {
	$.ajax({
		type : "POST",
		url : '/quangnm/changeList?id='+id+"&type=delete",
		success : function(reponse) {
			$("#data-student tbody").html("");
			$('#modalDelete').modal('hide');
		
		}
	});
}

function clearForm(){
	$("#name").val("");
	$("#brand").val("");
	currentStudentId = -1;
	$('.error-message').each(function( index ) {
		$(this).empty();
		$(this).addClass('alert-hide');
	});
}

$(document).ready(function() {
	updateCss();
});



