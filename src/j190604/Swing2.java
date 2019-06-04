package j190604;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Swing2 extends JFrame implements ActionListener{
	
	JPanel panel1, panel2, panel3;
	JLabel lab1;
	JTextField tb1;
	JButton but1;
	JComboBox combo1;
	
	public Swing2() {
		this.setSize(250, 150);
		this.setTitle("콤보 박스");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		//라벨 panel1
		lab1 = new JLabel("사이즈를 선택해 주세요");
		panel1.add(lab1);
		//콤보박스 panel2
		combo1 = new JComboBox();
		combo1.addItem("Small");
		combo1.addItem("Medium");
		combo1.addItem("Large");
		panel2.add(combo1);
		//버튼 panel2
		but1 = new JButton("확인");
		but1.addActionListener(this);
		panel2.add(but1);
		//텍스트박스 panel3
		tb1 = new JTextField(20);
		tb1.setEditable(false);
		panel3.add(tb1);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.add(panel3, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		//버튼 이벤트
		//콤보박스안 각각의 값마다 확인후 그것이 small, medium, large 확인후 거기에 맞는값 tb1에 출력
		if(e.getSource() == but1) {
			if(combo1.getSelectedItem().equals("Small")) {
				tb1.setText("Small 사이즈는 3000원 입니다.");
			}else if(combo1.getSelectedItem().equals("Medium")) {
				tb1.setText("Medium 사이즈는 4000원 입니다.");
			}else if(combo1.getSelectedItem().equals("Large")) {
				tb1.setText("Large 사이즈는 5000원 입니다.");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing2 sw2 = new Swing2();
	}

}
