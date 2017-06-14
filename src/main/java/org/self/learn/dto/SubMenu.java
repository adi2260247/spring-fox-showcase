package org.self.learn.dto;

import java.util.ArrayList;
import java.util.List;

public class SubMenu {

	private String id;
	private String name;
	private List<ChildSection> sections;
	private List<Block> footers;
	private List<Block> headers;
	
	public SubMenu() {
		List<ChildSection> sections = new ArrayList<>();
		sections.add(new ChildSection());
		List<Block> footers = new ArrayList<>();
		footers.add(new Block());
		List<Block> headers = new ArrayList<>();
		headers.add(new Block());
		
		this.name = "";
		this.sections = sections;
		this.footers = footers;
		this.headers = headers;
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

	public List<ChildSection> getSections() {
		return sections;
	}

	public void setSections(List<ChildSection> sections) {
		this.sections = sections;
	}

	public List<Block> getFooters() {
		return footers;
	}

	public void setFooters(List<Block> footers) {
		this.footers = footers;
	}

	public List<Block> getHeaders() {
		return headers;
	}

	public void setHeaders(List<Block> headers) {
		this.headers = headers;
	}
	
}