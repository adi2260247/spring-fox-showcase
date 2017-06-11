package org.self.learn.dto;

import java.util.ArrayList;
import java.util.List;

public class Section {

	private String name;
	private List<Menu> menus;
	
	public Section() {
		List<Menu> menus = new ArrayList<>();
		menus.add(new Menu());
		
		this.name = "";
		this.menus = menus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

}
