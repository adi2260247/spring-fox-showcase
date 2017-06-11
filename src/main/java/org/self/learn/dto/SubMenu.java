package org.self.learn.dto;

import java.util.ArrayList;
import java.util.List;

public class SubMenu {

	private String id;
	private String name;
	private List<Section> sections;
	
	public SubMenu() {
		List<Section> sections = new ArrayList<>();
		sections.add(new Section());
		
		this.name = "";
		this.sections = sections;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	
	
}