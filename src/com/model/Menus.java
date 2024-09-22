/**
 * 
 */
package com.model;

import java.util.List;

/**
 * @desc  : TODO
 * @author: Zhu
 * @date  : 2017年8月8日
 */
public class Menus {
	private String menu;
	private String iron;
	private List<Menus> childrenMenu;
	
	public Menus(String menu) {
		this.menu = menu;
	}
	
	public Menus(String menu,String iron) {
		this.menu = menu;
		this.iron = iron;
	}
	
	public Menus(String menu, String iron, List<Menus> childrenMenu) {
		this.menu = menu;
		this.iron = iron;
		this.childrenMenu = childrenMenu;
	}

	/**
	 * 
	 */
	public String getMenu() {
		return menu;
	}

	/**
	 * 
	 */
	public void setMenu(String menu) {
		this.menu = menu;
	}

	/**
	 * 
	 */
	public String getIron() {
		return iron;
	}

	/**
	 * 
	 */
	public void setIron(String iron) {
		this.iron = iron;
	}

	/**
	 * 
	 */
	public List<Menus> getChildrenMenu() {
		return childrenMenu;
	}

	/**
	 * 
	 */
	public void setChildrenMenu(List<Menus> childrenMenu) {
		this.childrenMenu = childrenMenu;
	}
}
