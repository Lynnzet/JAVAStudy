package javaGUIex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Ex1Frame extends JFrame {
	//�׼Ǹ����ʿ��� ����� ��ü��
	JButton button;
	JTextField t1;
	JTextField t2;
	int test1;
	
	//JFrame
	public Ex1Frame() {
		this.setTitle("������ ų�ι��ͷ� ��ȯ");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�");
		t1 = new JTextField("1",7);
		t2 = new JTextField(25);
		// ��ºκ� �����Ұ�
		t2.setEditable(false);
		
		button = new JButton("��ȯ");
		//��ư �׼Ǹ����� �Է�
		button.addActionListener(new Ex1Listener());
		
		panel1.add(label);
		panel1.add(t1);
		panel1.add(button);
		panel1.add(t2);
		this.add(panel1);
		
		this.setVisible(true);
	}
	private class Ex1Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//��ȯ ��ư �Է½�
			if(e.getSource()==button) {
				// �Է��� �ؽ�Ʈ�ʵ尪 �޾ƿ� ���� i�� ����
				int i = Integer.parseInt(t1.getText());
				//���� ���
				double k = i*1.609344;
				// t2Textfield�� ������
				t2.setText(i+"������"+k+" ų�ι����Դϴ�.");
			}
		}
	}
}
public class GuiEx1 {
	public static void main(String[] args) {
		Ex1Frame ex1 = new Ex1Frame();
	}
}
