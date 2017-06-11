package org.self.learn.dto;

import java.util.ArrayList;
import java.util.List;

public class ParentSection {

	private String name;
	private List<ParentMenu> menus;
	
	public ParentSection() {
		List<ParentMenu> menus = new ArrayList<>();
		menus.add(new ParentMenu());
		
		this.name = "";
		this.menus = menus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ParentMenu> getMenus() {
		return menus;
	}

	public void setMenus(List<ParentMenu> menus) {
		this.menus = menus;
	}
	
}
