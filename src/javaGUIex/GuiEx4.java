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
		//�󺧿� ��Ʈ��������
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 50));
		//�ǿ��� label add
		this.add(label);
		
		//���콺�� �󺧾����� ���ý� label�� ���� �ٲ�
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				label.setText("��ġ�⵵ ���� ���� ����");
			}
		});
	}
}
public class GuiEx4 extends JFrame {
	//JFrame
	public GuiEx4() {
		this.setTitle("���̺� �ٲٱ�");
		this.setSize(800, 200);
		this.add(new Ex4Panel());
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiEx4 ex4 = new GuiEx4();
	}
}
