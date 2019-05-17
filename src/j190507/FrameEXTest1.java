package j190507;
import javax.swing.*;
import java.awt.*;

class FrameEx1 extends JFrame{
	public FrameEx1() {
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레임");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("자바는 재미있나요?");
		JButton b1 = new JButton("Yes");
		JButton b2 = new JButton("예");
		
		panel.add(label);
		panel.add(b1);
		panel.add(b2);
		add(panel);
		setVisible(true);
	}
}

public class FrameEXTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameEx1 ex1 = new FrameEx1();
	}

}
