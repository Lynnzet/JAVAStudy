package j190507;
import javax.swing.*;
import java.awt.*;

class MyFrame5 extends JFrame {
	public MyFrame5() {
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레임");
		
		JPanel panel = new JPanel();
		JButton b1 = new JButton();
		b1.setText("왼쪽 버튼");
		JButton b2 = new JButton("중앙 버튼");
		JButton b3 = new JButton("오른쪽 버튼");
		b3.setEnabled(false);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		add(panel);
		setVisible(true);
		
	}
}

public class MyFrame5Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame5 f = new MyFrame5();
	}

}
