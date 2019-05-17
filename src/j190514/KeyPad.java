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
	
	//생성자 
	public KeyPad() {
		
		//이벤트에서도 사용하기위한 전역 변수 JTextField에 텍스트필드(20)으로 생성
		txt = new JTextField(20);
		
		//borderlayout으로 textfiled 정렬
		add(txt, BorderLayout.NORTH);
		//버튼이 들어갈 판넬
		panel = new JPanel();
		//3열 3행
		panel.setLayout(new GridLayout(3, 3));
		add(panel, BorderLayout.CENTER);
		
		//1부터 9까지 버튼을 만들어줄 for문
		for (int i = 1; i<= 9; i++) {
			//문자열로 숫자를 넣어줌
			JButton btn = new JButton("" + i);
			//버튼에 밑에 오버라이드해준 actionperformed 를 불러옴
			btn.addActionListener(this);
			
			//레이아웃을 사용할때 setSize 해주는 메소드
			btn.setPreferredSize(new Dimension(100, 100));
			//생성때마다 판넬에 추가해줌
			panel.add(btn);
		}
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// 문자열 변수로 actionCommand에 e(btn)에 있는 텍스트를 가져옴
		String actionCommand = e.getActionCommand();
		// 문자열 TextFiled에서 값을 가져운후 버튼에 있는 텍스트를 추가시켜줌
		txt.setText(txt.getText() + actionCommand);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyPad();
	}

}
