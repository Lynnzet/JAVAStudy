package j190507;
import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("안녕하세요?");
		JButton button = new JButton("버튼");
		
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		}
}

public class MyFrame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyFrame f = new MyFrame();
	}

}
