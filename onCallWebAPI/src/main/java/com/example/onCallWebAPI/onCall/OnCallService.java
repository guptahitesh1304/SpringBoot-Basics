package com.example.onCallWebAPI.onCall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class OnCallService {
	
	private List<OnCall> onCallDetailList = new ArrayList<>(Arrays.asList(
			new OnCall("Agent_Interact","Deb", "1111111111" , "Primary"),
			new OnCall("Agent_Interact","Hitesh", "1111111111" , "Secondary"),
			new OnCall("Agent_Interact","Mily", "1111111111" , "Supervisor"),
			new OnCall("Agent_Interact","Satish", "1111111111" , "Manager"),
			new OnCall("Agent_Interact","Shanmug", "1111111111" , "Dir"),
			new OnCall("IVR","Himan", "1111111111" , "Primary"),
			new OnCall("IVR","Hitesh", "1111111111" , "Primary"),
			new OnCall("IVR","Mily", "1111111111" , "Supervisor"),
			new OnCall("IVR","Satish", "1111111111" , "Manager"),
			new OnCall("IVR","Shanmug", "1111111111" , "Dir"),
			new OnCall("PGE","Deb", "1111111111" , "Primary"),
			new OnCall("PGE","Debap", "1111111111" , "Secondary"),
			new OnCall("PGE","Mily", "1111111111" , "Supervisor"),
			new OnCall("PGE","Satish", "1111111111" , "Manager"),
			new OnCall("PGE","Shanmug", "1111111111" , "Dir"),
			new OnCall("OLTD3","Deb", "1111111111" , "Primary"),
			new OnCall("OLTD3","DEba", "1111111111" , "Secondary"),
			new OnCall("OLTD3","Mily", "1111111111" , "Supervisor"),
			new OnCall("OLTD3","Satish", "1111111111" , "Manager"),
			new OnCall("OLTD3","Shanmug", "1111111111" , "Dir")
			));
	
	
	public List<OnCall> getAllOnCallDetails (){
		return onCallDetailList;
	}
	
	public List<OnCall> getOnCallDetailByName (String support_per_name) {
		
		return onCallDetailList.stream().filter(o -> o.getSupport_per_name().equalsIgnoreCase(support_per_name)).collect(Collectors.toList())	;
		
	}

	public void addOnCallDetails(OnCall onCall) {
		onCallDetailList.add(onCall);
	}

	public void updateOnCallDetails(OnCall onCall, String app_name) {
		
		for(int i=0; i < onCallDetailList.size(); i++) {
			OnCall o=onCallDetailList.get(i);
			if(o.getApp_name().equalsIgnoreCase(app_name)) {
				onCallDetailList.set(i, o);
				return;
			}
			
		}
		
	}

	public List<OnCall> getOnCallDetailsByAppName(String app_name) {
		
		return onCallDetailList.stream().filter(o -> o.getApp_name().equalsIgnoreCase(app_name)).collect(Collectors.toList())	;
	}

	

}
