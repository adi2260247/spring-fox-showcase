package org.self.learn.dto;

import java.util.ArrayList;
import java.util.List;

public class ParentMenu {

	private Menu menu;
	private List<SubMenu> subMenus;
	
	public ParentMenu() {
		super();
		List<SubMenu> subMenus = new ArrayList<>();
		subMenus.add(new SubMenu());
		
		this.menu = new Menu();
		this.subMenus = subMenus;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<SubMenu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<SubMenu> subMenus) {
		this.subMenus = subMenus;
	}
	
}
