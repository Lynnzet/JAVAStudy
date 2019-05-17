package j190510;
import java.awt.*;
import javax.swing.*;

class MyFrameE1 extends JFrame{
	public MyFrameE1() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton[] but = new JButton[10];
		
		for(int i=0; i<but.length; i++) {
			panel.add(but[i] = new JButton("Button"+i));
		}
		
		add(panel);
		setVisible(true);
		
	}
}

public class MyFrameEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrameE1 f = new MyFrameE1();
	}

}
