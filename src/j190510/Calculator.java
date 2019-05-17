package j190510;
import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{
	
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	//���� ��ư�ȿ� �� ����� �迭�� ����
	private String[] labels = {
			"Backspace","","","CE","C",
			"7","8","9","/","sqrt",
			"4","5","6","x","%",
			"1","2","3","-","1/x",
			"0","+/-",".","+","=",
	};
	
	public Calculator() {
		//���� ���� ���� �ؽ�Ʈ�ڽ�
		tField = new JTextField("0",35);
		panel = new JPanel();
		//������ ���ٲٵ��� �����ϰ� ����
		tField.setEnabled(false);
		//�ǳڿ� ���̾ƿ��� GridLayout���� ���� (5��, ���� 3)
		panel.setLayout(new GridLayout(0,5,3,3));
		//��ư 25�� ����
		buttons = new JButton[25];
		//label, button �迭�� ���ð��� ���� index ���� 
		int index = 0;
		//���� ���� �ݺ���
		for(int rows=0; rows < 5; rows++) {
			//���� ���� �ݺ���
			for(int cols = 0; cols < 5; cols++) {
				//��ư�� 0������ 24������ label���ִ� ������ index ������ �����Ͽ� �־��ְԵ� 
				buttons[index] = new JButton(labels[index]);
				//cols�� 3 �̻��� �Ǿ�����
				if( cols >= 3)
					// ��ư���ڻ��� �������� ��
					buttons[index].setForeground(Color.red);
				else
					// ��ư���ڻ��� �Ķ����� ��
					buttons[index].setForeground(Color.blue);
				//�ݺ��ϴµ��� ��ư�� ��� �������� ������� ��
				buttons[index].setBackground(Color.yellow);
				//�ݺ��ϴ� ���� ��ư�� ��� panel�� add��
				panel.add(buttons[index]);
				//�ݺ��� �Ҷ����� index�� 1�� �÷��� button �迭 ��ġ�� label �迭 ��ġ�� ������
				index++;
			}
		}
		//gridlayout�� tFeld�� ���ʿ� ��ġ
		add(tField, BorderLayout.NORTH);
		//���� ��ư���� ����մ� panel�� �߾ӿ� ��ġ
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		//�������� ũ�⸦ ������Ʈ�� ����
		pack();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator s = new Calculator();
	}

}
