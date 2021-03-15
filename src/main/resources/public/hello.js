//$(document).ready(function() {
$(function() {
 $('#search').click(function() {
    $.ajax({
        url: "/v1"
    }).then(function(data) {
       alert("in");
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.fileData);
    });
});

});


//$(function() {  $('#search').click(function() {alert("in2");});});



function getUserData1(){
	 $.ajax({
        url: "http://thp:8080/v1",
        dataType: "json",
        type: "GET"
        }).done(function(data, textStatus, jqXHR) {

            if(!data){
                alert("nodata");
                return;
            }
			var data2 = JSON.stringify(data);
			alert("data2:"+data2)

            var dd = JSON.parse(data2);

            //alert("dd[0].id  "+dd[0].id);
           	alert("dd.id  "+dd.id);


        }).fail(function(jqXHR, textStatus, errorThrown ) {
            alert("error1");
    });

}

function getUserData2(){
	 $.ajax({
        url: "/view?id=2&fileName=xx",
        dataType: "json",
        type: "GET"
        }).done(function(data, textStatus, jqXHR) {

            if(!data){
                alert("nodata");
                return;
            }
			var data2 = JSON.stringify(data);
			alert("data2:"+data2)
            var dd = JSON.parse(data2);
           	alert("fileName:"+dd["fileName"]);

        }).fail(function(jqXHR, textStatus, errorThrown ) {
            alert("error1");
    });

}

function getUserData3(){
	 $.ajax({
        url: "http://thp:8983/solr/ct/select?q=*%3A*",
        dataType: "json",
        type: "GET"
        }).done(function(data, textStatus, jqXHR) {

            if(!data){
                alert("nodata");
                return;
            }
			var data2 = JSON.stringify(data);
			alert("data2:"+data2)

        }).fail(function(jqXHR, textStatus, errorThrown ) {
            alert("error1");
    });



}