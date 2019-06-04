package j190604;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing1 extends JFrame implements ActionListener {
	JPanel panel1,panel2,panel3;
	JLabel lb1,lb2;
	JTextField tf1;
	JButton but1,but2;
	
	//1~100������ ���� ���ڰ� ���ִ� ����
	int ranNum = (int)((Math.random()*99)+1);
	//���� �Է½� int�� ��ȯ�� ���ڸ� ����� ����
	int tf1_int;
	
	
	public Swing1() {
		this.setTitle("���ڰ���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,150);
		
	//������ Ȯ�ο� print
		System.out.println(ranNum);
		
		panel1 = new JPanel();
		
		lb1 = new JLabel("���ڸ� �����Ͻÿ� : ");
		tf1 = new JTextField(10);
	//JTextField���� ���� �Է½� �̺�Ʈ �߻�
		tf1.addActionListener(this);
		
		panel1.add(lb1);
		panel1.add(tf1);
		
		panel2 = new JPanel();
		lb2 = new JLabel("���ڸ� �Է��Ͻÿ�.");
		panel2.add(lb2);
		
		panel3 = new JPanel();
		//���� ��ư
		but1 = new JButton("�� ����");
		but1.addActionListener(this);
	
		//���� ��ư	
		but2 = new JButton("����");
		but2.addActionListener(this);
		panel3.add(but1);
		panel3.add(but2);
		
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.add(panel3, BorderLayout.SOUTH);
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//�ؽ�Ʈ �ʵ� �̺�Ʈ
		if(e.getSource() == tf1) {	
			//tf1_int ������ tf1�� �Է��� ���� int������ �޾ƿ�
			tf1_int = Integer.parseInt(tf1.getText());
			
			//���� ���� �����̰ų� ���ų� ������ lb2�� ���
			if(ranNum == tf1_int) {
				lb2.setText("�����Դϴ�.");
			}else if(ranNum < tf1_int){
				lb2.setText("�����ϴ�");
			}else if(ranNum > tf1_int) {
				lb2.setText("�����ϴ�");
			}
		}
		//���� ��ư �̺�Ʈ
		if(but1 == e.getSource()) {
			System.out.println(ranNum);
			//���� ������ �ٽ� �������� �־���
			ranNum = (int)((Math.random()*100)+1);
			//�ؽ�Ʈ�ʵ�, �� �Ѵ� ���� �ʱ�ȭ
			tf1.setText("");
			lb2.setText("���ڸ� �Է��Ͻÿ�.");
		}
		//�����ư �̺�Ʈ
		if(but2 == e.getSource()) {
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing1 ex1 = new Swing1();
	}
}

