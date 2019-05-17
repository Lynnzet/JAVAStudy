package j190507;
import javax.swing.*;
import java.awt.*;

class MyFramef extends JFrame {
	
	public MyFramef() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
		
		setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		setVisible(true);
	}
}

public class MyFrameTest {
	public static void main(String[] args) {
		MyFramef f = new MyFramef();
	}
}