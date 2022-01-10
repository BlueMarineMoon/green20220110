package org.comstudy21.guiexTest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.*;
import java.awt.Menu;
import java.awt.MenuBar;

import org.comstudy21.guiex.myframe.MyFrame;

public class Acalculator extends MyFrame {
	Label centerLbl = new Label("Hello Java world!");
	GridBagLayout grid;
	GridBagConstraints con;
	Panel textPan = new Panel(new GridLayout(1, 1));
	Panel numPan = new Panel(new GridLayout(1, 1));

	public Acalculator() {

		super("계산기", 560, 720);

		MenuBar mb = new MenuBar();
		Menu vogiMenu = new Menu("VOGI(V)");
		Menu editMenu = new Menu("EDIT(E)");
		Menu helpMenu = new Menu("HELP(H)");

		mb.add(vogiMenu);
		mb.add(editMenu);
		mb.add(helpMenu);

		this.setMenuBar(mb);

		this.add(BorderLayout.NORTH, textPan);
		TextArea comments = new TextArea("", 10, 30);
		textPan.add(comments);

		this.add(BorderLayout.CENTER, numPan);
		grid = new GridBagLayout();
		con = new GridBagConstraints();
		numPan.setLayout(grid);
		con.fill = GridBagConstraints.BOTH;
		con.weightx = 1.0;
		con.weighty = 1.0;

		Button btn1 = new Button("MC");
		con.gridx = 0;
		con.gridy = 1;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn1, con);
		numPan.add(btn1);

		Button btn2 = new Button("MR");
		con.gridx = 1;
		con.gridy = 1;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn2, con);
		numPan.add(btn2);

		Button btn3 = new Button("MS");
		con.gridx = 2;
		con.gridy = 1;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn3, con);
		numPan.add(btn3);

		Button btn4 = new Button("M+");
		con.gridx = 3;
		con.gridy = 1;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn4, con);
		numPan.add(btn4);

		Button btn5 = new Button("M-");
		con.gridx = 4;
		con.gridy = 1;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn5, con);
		numPan.add(btn5);

		Button btn6 = new Button("<-");
		con.gridx = 0;
		con.gridy = 2;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn6, con);
		numPan.add(btn6);

		Button btn7 = new Button("CE");
		con.gridx = 1;
		con.gridy = 2;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn7, con);
		numPan.add(btn7);

		Button btn8 = new Button("C");
		con.gridx = 2;
		con.gridy = 2;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn8, con);
		numPan.add(btn8);

		Button btn9 = new Button("±");
		con.gridx = 3;
		con.gridy = 2;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn9, con);
		numPan.add(btn9);

		Button btn10 = new Button("v-");
		con.gridx = 4;
		con.gridy = 2;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn10, con);
		numPan.add(btn10);

		Button btn11 = new Button("7");
		con.gridx = 0;
		con.gridy = 3;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn11, con);
		numPan.add(btn11);

		Button btn12 = new Button("8");
		con.gridx = 1;
		con.gridy = 3;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn12, con);
		numPan.add(btn12);

		Button btn13 = new Button("9");
		con.gridx = 2;
		con.gridy = 3;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn13, con);
		numPan.add(btn13);

		Button btn14 = new Button("/");
		con.gridx = 3;
		con.gridy = 3;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn14, con);
		numPan.add(btn14);

		Button btn15 = new Button("%");
		con.gridx = 4;
		con.gridy = 3;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn15, con);
		numPan.add(btn15);

		Button btn16 = new Button("4");
		con.gridx = 0;
		con.gridy = 4;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn16, con);
		numPan.add(btn16);

		Button btn17 = new Button("5");
		con.gridx = 1;
		con.gridy = 4;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn17, con);
		numPan.add(btn17);

		Button btn18 = new Button("6");
		con.gridx = 2;
		con.gridy = 4;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn18, con);
		numPan.add(btn18);

		Button btn19 = new Button("*");
		con.gridx = 3;
		con.gridy = 4;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn19, con);
		numPan.add(btn19);

		Button btn20 = new Button("1/x");
		con.gridx = 4;
		con.gridy = 4;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn20, con);
		numPan.add(btn20);

		Button btn21 = new Button("1");
		con.gridx = 0;
		con.gridy = 5;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn21, con);
		numPan.add(btn21);

		Button btn22 = new Button("2");
		con.gridx = 1;
		con.gridy = 5;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn22, con);
		numPan.add(btn22);

		Button btn23 = new Button("3");
		con.gridx = 2;
		con.gridy = 5;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn23, con);
		numPan.add(btn23);

		Button btn24 = new Button("-");
		con.gridx = 3;
		con.gridy = 5;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn24, con);
		numPan.add(btn24);

		Button btn25 = new Button("=");
		con.gridx = 4;
		con.gridy = 5;
		con.gridwidth = 1;
		con.gridheight = 2;
		grid.setConstraints(btn25, con);
		numPan.add(btn25);

		Button btn26 = new Button("0");
		con.gridx = 0;
		con.gridy = 6;
		con.gridwidth = 2;
		con.gridheight = 1;
		grid.setConstraints(btn26, con);
		numPan.add(btn26);

		Button btn27 = new Button(".");
		con.gridx = 2;
		con.gridy = 6;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn27, con);
		numPan.add(btn27);

		Button btn28 = new Button("+");
		con.gridx = 3;
		con.gridy = 6;
		con.gridwidth = 1;
		con.gridheight = 1;
		grid.setConstraints(btn28, con);
		numPan.add(btn28);

	}

	public static void main(String[] args) {
		new Acalculator().setVisible(true);
	}

}
