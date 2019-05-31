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
		this.setTitle("이자 계산기");
		this.setSize(260, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLayout(new BorderLayout()); 기본 레이아웃
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		JLabel label1 = new JLabel("원금을 입력하시오");
		t1 = new JTextField(7);
		panel1.add(label1);
		panel1.add(t1);
		
		JLabel label2 = new JLabel("이율을 입력하시오");
		t2 = new JTextField(7);
		panel2.add(label2);
		panel2.add(t2);
		
		button = new JButton("변환");
		button.addActionListener(new Ex2Listener());
		panel2.add(button);
		
		t3 = new JTextField(15);
		t3.setEditable(false);
		panel3.add(t3);
		//border layout 상단
		add(panel1,BorderLayout.NORTH);
		//border layout 중단
		add(panel2,BorderLayout.CENTER);
		//border layout 하단
		add(panel3,BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	private class Ex2Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				
				//t2에 입력된 소수 변환해서 t2text에 입력
				float t2text = Float.parseFloat(t2.getText());
				//t1에 입력된 정수 변환해서 t1text에 입력
				int t1text = Integer.parseInt(t1.getText());
				//수식 계산
				int result = (int)(t1text*(t2text/100));
				//t3 textfield에 적어줌
				t3.setText("이자는 연" + result + "만원 입니다.");
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
