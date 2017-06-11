package org.self.learn.dto;

public class Menu {

	private String id;
	private String label;
	private String link;
	private String stepUp;
	private String uiType;
	public Menu() {
		this.id = "";
		this.label = "";
		this.link = "";
		this.stepUp = "";
		this.uiType = "";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getStepUp() {
		return stepUp;
	}
	public void setStepUp(String stepUp) {
		this.stepUp = stepUp;
	}
	public String getUiType() {
		return uiType;
	}
	public void setUiType(String uiType) {
		this.uiType = uiType;
	}
	
}
