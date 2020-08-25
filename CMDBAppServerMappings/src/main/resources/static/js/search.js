						
function searchFun(){
	let filter = document.getElementById("myInput").value.toUpperCase();;
	let myTable = document.getElementById("myTable");
	let tr = myTable.getElementsByTagName("tr");

	for(var i = 0; i < tr.length; i++){
		let td = tr[i].getElementsByTagName("td")[1];

		if(td){
			let textValue = td.textContent || td.innerText;

			if(textValue.toUpperCase().indexOf(filter) > -1)
			{
				tr[i].style.display = "";	
			}else
			{
				tr[i].style.display = "none";		
			}
		}
	}
}


$(document).ready(function() {
	$('#search').DataTable({
		"pagingType" : "full_numbers"
	});
});

