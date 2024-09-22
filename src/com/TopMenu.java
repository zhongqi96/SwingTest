/**
 * 
 */
package com;

import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.model.Menus;

/**
 * @desc  : TODO
 * @author: Zhu
 * @date  : 2017年8月8日
 */
public class TopMenu {
	private JMenuBar bar;
	
	public TopMenu(List<Menus> menus) {
		bar = new JMenuBar();
		for (Menus menu : menus) {
			JMenu jMenu = new JMenu(menu.getMenu());
			List<Menus> list = menu.getChildrenMenu();
			if(list != null && list.size() > 0) {
				for (Menus menusC : list) {
					JMenuItem item = loadMenu(menusC);
					jMenu.add(item);
				}
			}
			bar.add(jMenu);
		}
	}
	
	private JMenuItem loadMenu(Menus menus) {
		List<Menus> cMenus = menus.getChildrenMenu();
		JMenuItem jMenuItem;
		if(null == cMenus || cMenus.size() < 1) {
			jMenuItem = new JMenuItem(menus.getMenu(), createImageIcon(menus.getIron()));
			return jMenuItem;
		}
		jMenuItem = new JMenu(menus.getMenu());
		for (Menus menu : cMenus) {
			List<Menus> list = menu.getChildrenMenu();
			if(null == list || list.size() < 1) {
				JMenuItem item = new JMenuItem(menu.getMenu(), createImageIcon(menu.getIron()));
				jMenuItem.add(item);
			}else {
				JMenuItem cJMenu = loadMenu(menu);
				jMenuItem.add(cJMenu);
			}
		}
		return jMenuItem;
	}
	
	protected ImageIcon createImageIcon(String path) {  
        if (path != null) {  
            return new ImageIcon(path);  
        } else {  
            return null;  
        }  
    } 

	/**
	 * 
	 */
	public JMenuBar getBar() {
		return bar;
	}

	/**
	 * 
	 */
	public void setBar(JMenuBar bar) {
		this.bar = bar;
	}
}
