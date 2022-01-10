package org.comstudy21.layout_ex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import org.comstudy21.guiex.myframe.MyFrame;

public class LayoutEx01 extends MyFrame {
	public Button btn1 = new Button("BTN1");
	public Button btn2 = new Button("BTN2");
	public Button btn3 = new Button("BTN3");
	public Button btn4 = new Button("BTN4");
	public Button btn5 = new Button("BTN5");
	
	public ArrayList<Button> btns = new ArrayList<Button>();
	{
		for(int i=0; i<100; i++) {
			btns.add(new Button("BTN"+ i));
		}
	}
	
	public LayoutEx01() {
		super("Layout manager 연습", 640, 480);  // (레이아웃 제목, Width, Height)
	}
	
	public void gridBagLayoutEx() {
		this.setLayout(new GridBagLayout());  // 정가운데에 버튼 한개 출력
		this.add(btn1);
	}
	
	public void gridLayoutEx() {
		this.setLayout(new GridLayout(2, 3, 5, 5));  // GridLayout(행, 열, Width(크기), Height(크기))
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btns.get(10));  // 10을 가져와서 출력함
	}
	
	private void flowLayoutEx() {
		// FlowLayout - 왼쪽에서 오른쪽으로 순서대로 붙인다.
		this.setLayout(new FlowLayout());
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
	}

	public void borderLayoutEx() {
		// Window를 상속받은 Frame은 디폴트 레이아웃이 BorderLayout
		add(BorderLayout.NORTH,btn1);   // 북쪽에 버튼 1번
		add(BorderLayout.SOUTH,btn2);   // 남쪽에 버튼 2번
		add(BorderLayout.WEST,btn3);    // 서쪽에 버튼 3번
		add(BorderLayout.EAST,btn4);    // 동쪽에 버튼 4번
		add(BorderLayout.CENTER,btn5);  // 센터에 버튼 5번
	}

	public static void main(String[] args) {
		// 화면에 보이는 설정 맨 마지막에 해준다.
		new LayoutEx01().setVisible(true);
	}

}
