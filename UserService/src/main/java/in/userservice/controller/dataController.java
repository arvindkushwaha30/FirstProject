package in.userservice.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.userservice.service.dataService;

@RestController
@RequestMapping("/api")
public class dataController {

	@Autowired
	private dataService ds;
	
	@CrossOrigin
	@RequestMapping("/convertData")
	public String fetchReportToSys(HttpServletRequest request)
	{
		
		String time=request.getParameter("time");
		
		HashMap<String,String> jo = new HashMap<String, String>();
		try {
			
			
			String converTime=ds.convertData(time);
			
			
			
	     	jo.put("data", converTime);
	 		
	 		String data=jo.toString();
	 		data=data.replace("=", ":");
			return converTime;
            }
		catch (Exception e) {
        	
        	jo.put("result", "fail");
        	jo.put("message", e.getMessage());
			
			return jo.toString();
        }
	}
}
