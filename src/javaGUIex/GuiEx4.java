package javaGUIex;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Ex4Panel extends JPanel{
	JLabel label;
	
	//JPanel
	public Ex4Panel() {
		label = new JLabel("Don't cry before you are hurt.");
		//라벨에 폰트설정해줌
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 50));
		//판엘에 label add
		this.add(label);
		
		//마우스가 라벨안으로 들어올시 label안 글자 바꿈
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				label.setText("다치기도 전에 울지 말라");
			}
		});
	}
}
public class GuiEx4 extends JFrame {
	//JFrame
	public GuiEx4() {
		this.setTitle("레이블 바꾸기");
		this.setSize(800, 200);
		this.add(new Ex4Panel());
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiEx4 ex4 = new GuiEx4();
	}
}
