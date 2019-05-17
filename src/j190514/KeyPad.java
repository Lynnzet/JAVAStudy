package j190514;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JFrame implements ActionListener {
	private JTextField txt;
	private JPanel panel;
	
	//������ 
	public KeyPad() {
		
		//�̺�Ʈ������ ����ϱ����� ���� ���� JTextField�� �ؽ�Ʈ�ʵ�(20)���� ����
		txt = new JTextField(20);
		
		//borderlayout���� textfiled ����
		add(txt, BorderLayout.NORTH);
		//��ư�� �� �ǳ�
		panel = new JPanel();
		//3�� 3��
		panel.setLayout(new GridLayout(3, 3));
		add(panel, BorderLayout.CENTER);
		
		//1���� 9���� ��ư�� ������� for��
		for (int i = 1; i<= 9; i++) {
			//���ڿ��� ���ڸ� �־���
			JButton btn = new JButton("" + i);
			//��ư�� �ؿ� �������̵����� actionperformed �� �ҷ���
			btn.addActionListener(this);
			
			//���̾ƿ��� ����Ҷ� setSize ���ִ� �޼ҵ�
			btn.setPreferredSize(new Dimension(100, 100));
			//���������� �ǳڿ� �߰�����
			panel.add(btn);
		}
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// ���ڿ� ������ actionCommand�� e(btn)�� �ִ� �ؽ�Ʈ�� ������
		String actionCommand = e.getActionCommand();
		// ���ڿ� TextFiled���� ���� �������� ��ư�� �ִ� �ؽ�Ʈ�� �߰�������
		txt.setText(txt.getText() + actionCommand);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyPad();
	}

}
