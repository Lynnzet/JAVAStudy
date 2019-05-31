package javaGUIex;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Ex2Frame extends JFrame {
	JButton button;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	
	//JFrame
	Ex2Frame(){
		this.setTitle("���� ����");
		this.setSize(260, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLayout(new BorderLayout()); �⺻ ���̾ƿ�
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		JLabel label1 = new JLabel("������ �Է��Ͻÿ�");
		t1 = new JTextField(7);
		panel1.add(label1);
		panel1.add(t1);
		
		JLabel label2 = new JLabel("������ �Է��Ͻÿ�");
		t2 = new JTextField(7);
		panel2.add(label2);
		panel2.add(t2);
		
		button = new JButton("��ȯ");
		button.addActionListener(new Ex2Listener());
		panel2.add(button);
		
		t3 = new JTextField(15);
		t3.setEditable(false);
		panel3.add(t3);
		//border layout ���
		add(panel1,BorderLayout.NORTH);
		//border layout �ߴ�
		add(panel2,BorderLayout.CENTER);
		//border layout �ϴ�
		add(panel3,BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	private class Ex2Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				
				//t2�� �Էµ� �Ҽ� ��ȯ�ؼ� t2text�� �Է�
				float t2text = Float.parseFloat(t2.getText());
				//t1�� �Էµ� ���� ��ȯ�ؼ� t1text�� �Է�
				int t1text = Integer.parseInt(t1.getText());
				//���� ���
				int result = (int)(t1text*(t2text/100));
				//t3 textfield�� ������
				t3.setText("���ڴ� ��" + result + "���� �Դϴ�.");
			}
		}
	}
}

public class GuiEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2Frame ex2 = new Ex2Frame();
	}

}
