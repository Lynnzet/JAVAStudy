package j190507;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PizzaFrame extends JFrame{
	public PizzaFrame() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label1);
		panelA.setBackground(Color.CYAN);
		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("������������");
		JButton button3 = new JButton("�Ұ������");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		panelB.setBackground(Color.green);
		JLabel label2 = new JLabel("����");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		panel.add(panelA);
		panel.add(panelB);
		panel.setBackground(Color.blue);
		add(panel);
		setVisible(true);
	}
}

public class PizzaFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PizzaFrame pf = new PizzaFrame();
	}

}
