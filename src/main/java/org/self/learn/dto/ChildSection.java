package org.self.learn.dto;

import java.util.ArrayList;
import java.util.List;

public class ChildSection {

	private String name;
	private List<ChildMenu> menus;
	
	public ChildSection() {
		List<ChildMenu> menus = new ArrayList<>();
		menus.add(new ChildMenu());
		
		this.name = "";
		this.menus = menus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ChildMenu> getMenus() {
		return menus;
	}

	public void setMenus(List<ChildMenu> menus) {
		this.menus = menus;
	}

}
