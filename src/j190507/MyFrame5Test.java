package j190507;
import javax.swing.*;
import java.awt.*;

class MyFrame5 extends JFrame {
	public MyFrame5() {
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�׽�Ʈ ������");
		
		JPanel panel = new JPanel();
		JButton b1 = new JButton();
		b1.setText("���� ��ư");
		JButton b2 = new JButton("�߾� ��ư");
		JButton b3 = new JButton("������ ��ư");
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
