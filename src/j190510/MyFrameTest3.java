package j190510;
import java.awt.*;
import javax.swing.*;

class MyFrame3 extends JFrame{
	public MyFrame3() {
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,3));
		add(new JButton("Button1" ));
		add(new JButton("Button2" ));
		add(new JButton("Button3" ));
		add(new JButton("Button4" ));
		add(new JButton("Button15" ));
		
		pack();
		setVisible(true);
	}
}


public class MyFrameTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				MyFrame3 f = new MyFrame3();
	}

}
