package com.example.onCallWebAPI.onCall;

public class OnCall {
	
	private String app_name;
	private String support_per_name;
	private String phn_num;
	private String role;
	
	public OnCall() {
	}

	public String getApp_name() {
		return app_name;
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public String getSupport_per_name() {
		return support_per_name;
	}

	public void setSupport_per_name(String support_per_name) {
		this.support_per_name = support_per_name;
	}

	public String getPhn_num() {
		return phn_num;
	}

	public void setPhn_num(String phn_num) {
		this.phn_num = phn_num;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public OnCall(String app_name, String support_per_name, String phn_num, String role) {
		super();
		this.app_name = app_name;
		this.support_per_name = support_per_name;
		this.phn_num = phn_num;
		this.role = role;
	}
	
	

}
