package j190510;
import java.awt.*;
import javax.swing.*;

class MyFrameE2 extends JFrame{
	public MyFrameE2() {
		setTitle("������ ų�ι��ͷ� ��ȯ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		JLabel label1 = new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�");
		JTextField tf1 = new JTextField("1",4);
		panel1.add(label1);
		panel1.add(tf1);
		
		JButton b1 = new JButton("��ȯ");
		panel2.add(b1);
		
		JTextField tf2 = new JTextField("1������ 1.6 ų�ι����Դϴ�.", 20);
		panel3.add(tf2);
		
		add(panel1, BorderLayout.PAGE_START);
		add(panel2, BorderLayout.CENTER);
		add(panel3, BorderLayout.PAGE_END);
		
		setVisible(true);
	}
}

public class MyFrameEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrameE2 f = new MyFrameE2();
	}

}
