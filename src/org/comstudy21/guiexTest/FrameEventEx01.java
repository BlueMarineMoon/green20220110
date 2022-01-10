package org.comstudy21.guiexTest;

import java.awt.Frame;
import java.awt.event.MouseMotionAdapter;


public class FrameEventEx01 extends Frame {
	public FrameEventEx01() {
		setTitle("테스트");
		setSize(640, 480);
		setVisible(true);
		
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged() {
				getGraphics();
			}
		});
	}

	public static void main(String[] args) {
		new FrameEventEx01();
	}

}
