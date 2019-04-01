function selectContact(){
	$.ajax({
		type : 'GET',
		url : 'getAll-Contact-API',
		headers : {
			Accept : "application/json ,text/javascript",
			"Content-Type" : "application/json; charset=utf-8"
		},
		success : function(data) {
			
			
			var tableBody = $('#table tbody');
			tableBody.empty();
			$(data).each(function (index, element){
				tableBody.append('<tr><td>'+element.id+'</td><td>'+element.name+'</td><td>'+element.email+'</td><td>'+element.phone+'</td><td><button onclick = "deleteContact('+element.id+')">Delete</button>--<button )">Update</button></td></tr>');				
			});
			
		}
	});
};
// tableBody.append('<tr><td>'+element.title+'</td><td>'+element.author+'</td><td><button onclick = "deleteBook('+element.id+')">Delete</button></td></tr>');

function searchContact(){
	$("#search").click(function(){
		var textSearch =  document.getElementById("textSearch");
	
		$.ajax({
			type: 'GET',
			url : 'getAll-Contact-API',
			headers : {
				Accept : "application/json ,text/javascript",
				"Content-Type" : "application/json; charset=utf-8"
			},
			success: function(data){				
				var arrfilter = data.filter(function(items){
					return items.name  == textSearch.value;
				});

						var tableBody = $('#table tbody');
						tableBody.empty();
						$(arrfilter).each(function (index, element){
							tableBody.append('<tr><td>'+element.id+'</td><td>'+element.name+'</td><td>'+element.email+'</td><td>'+element.phone+'</td><td><button onclick = "deleteContact('+element.id+')">Delete</button></td></tr>');				
						});

			}
			
		
	});
		});
};

function deleteContact(id){
	/*$.ajax({ // cach nay chua dc
	      type: "POST",
	      url: "deleteContact-API",
	      data: id,
	      dataType: 'text',
	      contentType: 'appLication/json',
	      complete: function(){
	       alert("Xoa Thanh Cong");
	      }
	     
	     });
	     */
	 $.ajax({
         url: 'deleteContact-API/'+id,//pathvarible
         method: 'POST',
         success: function () {
        	 selectContact();
        	 
         },
         error: function (error) {
             alert(error);
         }
     })
};


function updateContact(){ // ta lay duoc id
	
	var localid = iddata; // lay duoc gia tri Can Sua
	
	$("#update").click(function() {
		var name = $("#name").val();
		var phone = $("#phone").val();
		var email = $("#email").val();
		var id = localid;
		var data = JSON.stringify({
			"name" : name,
			"phone" : phone,
			"email" : email,
			"id" :  id,
		});
		$.ajax({
			type : "POST",
			url : "UpdateContact-API",
			data : data,
			dataType : 'appLication/json',
			contentType : 'appLication/json',
			complete : function() {
				$("#name").val("");
				$("#phone").val("");
				$("#email").val("");
				$("#id").val("");
				location.replace("http://localhost:8080/index");
			}
		});
		
		

	});


	
};
function insertContact() {
	$("#Save").click(function() {
		var name = $("#name").val();
		var phone = $("#phone").val();
		var email = $("#email").val();

		var data = JSON.stringify({
			"name" : name,
			"phone" : phone,
			"email" : email,
		});
		$.ajax({
			type : "POST",
			url : "addContact-API",
			data : data,
			dataType : 'appLication/json',
			contentType : 'appLication/json',
			complete : function() {
				$("#name").val("");
				$("#phone").val("");
				$("#email").val("");
				location.replace("http://localhost:8080/index");
			}
		});

	});
};

$(document).ready(function(){
	
	selectContact();
    insertContact();
    searchContact();

   
});