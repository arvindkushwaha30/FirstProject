var apiPrefix = "api";
var serviceUrls=
{
		"convertData":apiPrefix+"/convertData"
}
var settings = {
  "url": serviceUrls.data,
  "method": "GET",
  "timeout": 0,
};

function ajaxCall()
{
var time = document.getElementById("startTime");

if((time.value=="")){
 sweetAlert("Error", "Please Select time ", "error");
 return;

}
var systemConfigurationData =
    {
        
         "time":time.value,   
		 "Inputtext":Inputtext.value
    }
    $.ajax({
    	 url:serviceUrls.convertData,
    	
    	 type:"post",
         data:systemConfigurationData,
         success:function(data)
        {
        	
        	console.log(data);
        	
        	swal({
       	     title: "",
       	     text: data,
       	     type: "success",
       	    
       	     className: "right-bottom"
       	     });
        }
    
    });
  }
