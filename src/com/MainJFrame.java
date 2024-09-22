/**
 * 
 */
package com;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import com.model.Menus;

/**
 * @desc : TODO
 * @author: Zhu
 * @date : 2017年8月7日
 */
public class MainJFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainJFrame() {
		initGUI();
		addMenuBar();
	}
	private JMenuBar bar;
	public void addMenuBar() {
		List<Menus> list = new ArrayList<>();
		Menus file = new Menus("file");
		Menus help = new Menus("help");
		Menus open = new Menus("open");
		Menus save = new Menus("save");
		
		Menus edit = new Menus("edit");
		List<Menus> g2List = new ArrayList<>();
		Menus copy = new Menus("copy");
		Menus cut = new Menus("cut");
		Menus paste = new Menus("paste");
		g2List.add(copy);
		g2List.add(cut);
		g2List.add(paste);
		edit.setChildrenMenu(g2List);
		
		List<Menus> g1List = new ArrayList<>();
		g1List.add(open);
		g1List.add(edit);
		g1List.add(save);
		file.setChildrenMenu(g1List);
		
		list.add(file);
		list.add(help);
		
		TopMenu menu = new TopMenu(list);
		bar = menu.getBar();

		setJMenuBar(bar);
	}

	private ChessPanel chessPanel;
	public void addChessPanel() {
		chessPanel = new ChessPanel();
		add(chessPanel);
	}

	private void initGUI() {
		setTitle("SwingModel");
		setVisible(true);
		setSize(680, 680);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
			public void run() {
				MainJFrame f = new MainJFrame();
			}
		});
	}
}
