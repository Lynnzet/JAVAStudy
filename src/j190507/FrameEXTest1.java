package j190507;
import javax.swing.*;
import java.awt.*;

class FrameEx1 extends JFrame{
	public FrameEx1() {
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�׽�Ʈ ������");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("�ڹٴ� ����ֳ���?");
		JButton b1 = new JButton("Yes");
		JButton b2 = new JButton("��");
		
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
