package com.example.onCallWebAPI.onCall;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnCallWebAPIController {
	
	@Autowired
	private OnCallService onCallService;
	
	@RequestMapping("/api/Hi")
	@CrossOrigin(origins = "http://localhost:4200")
	public String sayHi() {
		return "Hello this is me Angular with Spring";
	}
	
	@RequestMapping("/OnCallDetails")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<OnCall> getOnCallDetails() {
		return onCallService.getAllOnCallDetails();
	}
	
	@RequestMapping("/OnCallDetailsByName/{support_per_name}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<OnCall> getOnCallDetails(@PathVariable String support_per_name) {
		return onCallService.getOnCallDetailByName(support_per_name);
	}
	
	@RequestMapping("/OnCallDetails/{app_name}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<OnCall> getOnCallDetailsByAppName(@PathVariable String app_name) {
		return onCallService.getOnCallDetailsByAppName(app_name);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/OnCallDetails")
	@CrossOrigin(origins = "http://localhost:4200")
	public void addOnCallDetails(@RequestBody OnCall onCall) {
		onCallService.addOnCallDetails(onCall);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/OnCallDetails/{app_name}")
	@CrossOrigin(origins = "http://localhost:4200")
	public void updateOnCallDetails(@RequestBody OnCall onCall, @PathVariable String app_name) {
		onCallService.updateOnCallDetails(onCall,app_name);
	}
}
