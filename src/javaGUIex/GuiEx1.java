package javaGUIex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Ex1Frame extends JFrame {
	//액션리스너에서 사용할 객체들
	JButton button;
	JTextField t1;
	JTextField t2;
	int test1;
	
	//JFrame
	public Ex1Frame() {
		this.setTitle("마일을 킬로미터로 변환");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("거리를 마일 단위로 입력하시오");
		t1 = new JTextField("1",7);
		t2 = new JTextField(25);
		// 출력부분 수정불가
		t2.setEditable(false);
		
		button = new JButton("변환");
		//버튼 액션리스너 입력
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
			//변환 버튼 입력시
			if(e.getSource()==button) {
				// 입력한 텍스트필드값 받아와 변수 i에 저장
				int i = Integer.parseInt(t1.getText());
				//수식 계산
				double k = i*1.609344;
				// t2Textfield에 적어줌
				t2.setText(i+"마일은"+k+" 킬로미터입니다.");
			}
		}
	}
}
public class GuiEx1 {
	public static void main(String[] args) {
		Ex1Frame ex1 = new Ex1Frame();
	}
}
