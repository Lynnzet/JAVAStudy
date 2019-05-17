package j190507;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class CalcFrame extends JFrame implements ActionListener{
	//�ٸ� �޼ҵ忡���� ����� �ڽ���� ��ư���� ������ ����
	private JButton button;
	private JTextField tf1;
	private JTextField tf2;
	
	public CalcFrame(){
		
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�µ���ȯ��");
		
		JPanel panel1 = new JPanel();
		JLabel la1 = new JLabel("ȭ�� �µ�");
		JLabel la2 = new JLabel("���� �µ�");
		//ȭ�� �޾ƿ� �ý�Ʈ �ʵ� ���� (�⺻�� 100����)
		tf1 = new JTextField("100",20);
		//������ ǥ���� �ؽ�Ʈ �ʵ� ����
		tf2 = new JTextField(20);
		button = new JButton("��ȯ");
		//��ư�� �� actionPerformed�� ����
		button.addActionListener(this);
		
		panel1.add(la1);
		panel1.add(tf1);
		panel1.add(la2);
		panel1.add(tf2);
		panel1.add(button);
		
		add(panel1);
		setVisible(true);
		
		
	}
		public void actionPerformed(ActionEvent e) {
				//ȭ���� ���������� �޾ƿ� ����
				int f;
				double result;
				//ȭ���� �Է��� �ؽ�Ʈ�ʵ忡���� �ؽ�Ʈ�� �޾ƿµ� parseInt�� ���ڿ��� ���������� ��ȯ
				f = Integer.parseInt(tf1.getText());
				//������ �־� ����� result������ �־���
				result = (f-32) / 1.8;
				//������ ����� �ؽ�Ʈ�ʵ忡 String.format���� ���������� ��ȯ�� ���ڿ��� �Ѱ���
				tf2.setText(String.format("%f", result));
		}
	}

public class ClacFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcFrame cf = new CalcFrame();
	}

}
