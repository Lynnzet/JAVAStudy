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
		this.setTitle("�ڽ� �����̱�");
		
		p1 = new JPanel();
		p3 = new JPanel();
		p1.setLayout(new BorderLayout());
		
		b1 = new JButton("�������� �̵�");
		b1.addActionListener(this);
		b1.setFocusable(false);
		
		b2 = new JButton("���������� �̵�");
		b2.addActionListener(this);
		b2.setFocusable(false);
		
		//�ǳڿ� paintComponent�� ������ ����� �׷���
		p2 = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				//���
				g.setColor(Color.yellow);
				g.fillRect(0, 0, 500, 300);
				//�����
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
		//�����̵� �Է½� x�� -10�� ��ǥ���� �����Ǿ� �׸��� ���������̵��� 
		if(e.getSource() == b1) {
			x-=10;
			//�����̻� �Ѿ�� x 470���� �ʱ�ȭ
			if(x<20)
				x=470;
		}
		//�����̵� �Է½� x�� +10�� ��ǥ���� �����Ǿ� �׸��� �����������̵��� 
		if(e.getSource() == b2) {
			x+=10;
			//�����̻� �Ѿ�� x 10���� �ʱ�ȭ
			if(x>450)
				x=10;
		}
		//paintComponent �Ӽ����� ��� �׷���
		repaint();
	}
}
public class GuiEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3Frame ex3 = new Ex3Frame();
	}

}
