package org.comstudy21.guiexTest;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.comstudy21.guiex.myframe.MyFrame;




public class screen extends MyFrame implements WindowListener{
	public screen() {
		super("화면만들기", 700, 400);
		Panel btnPan = new Panel(new FlowLayout());
		Panel textarea = new Panel(new FlowLayout());
		Panel phonePan = new Panel(new GridLayout(8,1,0,20));
		
		Panel Gid1 = new Panel(new GridLayout(1,2));
		Panel Gid2 = new Panel(new GridLayout(1,2));
		Panel Gid3 = new Panel(new GridLayout(1,2));
		Panel Gid4 = new Panel(new GridLayout(1,2));
		
		Button btn1 = new Button("View All");
		Button btn2 = new Button("Add");
		Button btn3 = new Button("Delete");
		Button btn4 = new Button("Search");
		Button btn5 = new Button("Cancellation");
		
		Label numberLabel = new Label("Number");
		Label nameLabel = new Label("name");
		Label emailLabel = new Label("Email");
		Label phoneLabel = new Label("Phone");
		TextField Number = new TextField(10);
		TextField Name = new TextField(10);
		TextField email = new TextField(10);
		TextField phone = new TextField(10);
		
		
		
		this.add(BorderLayout.SOUTH, btnPan);
		btnPan.add(btn1);
		btnPan.add(btn2);
		btnPan.add(btn3);
		btnPan.add(btn4);
		btnPan.add(btn5);
		
		this.add(BorderLayout.CENTER, textarea);
		TextArea area = new TextArea("", 20, 65);
		textarea.add(area);
		
		this.add(BorderLayout.WEST, phonePan);
		phonePan.add(Gid1);
		Gid1.add(numberLabel);
		Gid1.add(Number);
		phonePan.add(Gid2);
		Gid2.add(nameLabel);
		Gid2.add(Name);
		phonePan.add(Gid3);
		Gid3.add(emailLabel);
		Gid3.add(email);
		phonePan.add(Gid4);
		Gid4.add(phoneLabel);
		Gid4.add(phone);
		
		
		
	}
	
	
	public static void main(String[] args) {
		new screen().setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
}
