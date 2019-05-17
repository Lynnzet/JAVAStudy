package j190507;
import javax.swing.*;
import java.awt.*;

class MyFrame4 extends JFrame{
	public MyFrame4() {
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레임");
		
		JPanel panel = new JPanel();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEditable(false);
		
		panel.add(t1);
		panel.add(t2);
		
		add(panel);
		setVisible(true);
	}
}

public class MyFrameTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyFrame4 f = new MyFrame4();
	}

}
