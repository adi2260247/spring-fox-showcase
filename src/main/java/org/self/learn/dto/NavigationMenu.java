package org.self.learn.dto;

import java.util.ArrayList;
import java.util.List;

public class NavigationMenu {
	private List<TabBar> tabs;

	public NavigationMenu() {
		List<TabBar> tabs = new ArrayList<>();
		tabs.add(new TabBar());
		this.tabs = tabs;
	}

	public List<TabBar> getTabs() {
		return tabs;
	}

	public void setTabs(List<TabBar> tabs) {
		this.tabs = tabs;
	}
	
	
}
