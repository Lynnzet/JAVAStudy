package j190604;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Swing3 extends JFrame implements ActionListener{

	JPanel panel;
	JLabel lab1, lab2;
	JTextField tf1;
	JPasswordField pf1;
	JButton but1;
	
	public Swing3() {
		this.setSize(350,180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("LOGIN FORM");
	//panel
		panel = new JPanel();
		panel.setLayout(new GridLayout(5,1));
	//id
		lab1 = new JLabel("아이디");
		panel.add(lab1);
		
		tf1 = new JTextField();
		panel.add(tf1);
	//password
		lab2 = new JLabel("비밀번호");
		panel.add(lab2);
		
		pf1 = new JPasswordField();
		panel.add(pf1);
	//버튼
		but1 = new JButton("로그인");
		but1.addActionListener(this);
		panel.add(but1);
		
		
		this.add(panel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		//버튼 이벤트
		if(e.getSource() == but1) {
			//tf1 값이 hong이고 pf1 값이 1111일경우 성공 출력, 일치하지 않을경우 실패로 출력
			if(tf1.getText().equals("hong") && pf1.getText().equals("1111") ) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
		}
	}
	
	public static void main(String[] args) {
		Swing3 sw3 = new Swing3();
	}

}
