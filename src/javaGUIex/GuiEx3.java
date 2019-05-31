package javaGUIex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Ex3Frame extends JFrame implements ActionListener{
	JPanel p1, p2, p3;
	JButton b1, b2;
	int x=200;
	
	//JFrame
	public Ex3Frame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.setTitle("박스 움직이기");
		
		p1 = new JPanel();
		p3 = new JPanel();
		p1.setLayout(new BorderLayout());
		
		b1 = new JButton("왼쪽으로 이동");
		b1.addActionListener(this);
		b1.setFocusable(false);
		
		b2 = new JButton("오른쪽으로 이동");
		b2.addActionListener(this);
		b2.setFocusable(false);
		
		//판넬에 paintComponent로 막대기와 배경을 그려줌
		p2 = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				//배경
				g.setColor(Color.yellow);
				g.fillRect(0, 0, 500, 300);
				//막대기
				g.setColor(Color.red);
				g.fillRect(x, 40, 10, 200);
			}
		};
		
		p3.add(b1);
		p3.add(b2);
		
		p1.add(p2, BorderLayout.CENTER);
		p1.add(p3,BorderLayout.SOUTH);
		
		this.add(p1);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		//왼쪽이동 입력시 x가 -10씩 좌표값이 설정되어 그림이 왼쪽으로이동함 
		if(e.getSource() == b1) {
			x-=10;
			//일정이상 넘어갈시 x 470으로 초기화
			if(x<20)
				x=470;
		}
		//왼쪽이동 입력시 x가 +10씩 좌표값이 설정되어 그림이 오른쪽으로이동함 
		if(e.getSource() == b2) {
			x+=10;
			//일정이상 넘어갈시 x 10으로 초기화
			if(x>450)
				x=10;
		}
		//paintComponent 속성으로 계속 그려줌
		repaint();
	}
}
public class GuiEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3Frame ex3 = new Ex3Frame();
	}

}
