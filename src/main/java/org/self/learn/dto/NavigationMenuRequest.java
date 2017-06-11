package org.self.learn.dto;

import java.util.Map;

public class NavigationMenuRequest {

	private String deviceInfo;
	private Map<String, String> params;
	
	public NavigationMenuRequest(String deviceInfo, Map<String, String> additionalParams) {
		super();
		this.deviceInfo = deviceInfo;
		this.params = additionalParams;
	}
	public String getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public Map<String, String> getParams() {
		return params;
	}
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
	
}
