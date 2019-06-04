package j190604;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Swing2 extends JFrame implements ActionListener{
	
	JPanel panel1, panel2, panel3;
	JLabel lab1;
	JTextField tb1;
	JButton but1;
	JComboBox combo1;
	
	public Swing2() {
		this.setSize(250, 150);
		this.setTitle("�޺� �ڽ�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		//�� panel1
		lab1 = new JLabel("����� ������ �ּ���");
		panel1.add(lab1);
		//�޺��ڽ� panel2
		combo1 = new JComboBox();
		combo1.addItem("Small");
		combo1.addItem("Medium");
		combo1.addItem("Large");
		panel2.add(combo1);
		//��ư panel2
		but1 = new JButton("Ȯ��");
		but1.addActionListener(this);
		panel2.add(but1);
		//�ؽ�Ʈ�ڽ� panel3
		tb1 = new JTextField(20);
		tb1.setEditable(false);
		panel3.add(tb1);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.add(panel3, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		//��ư �̺�Ʈ
		//�޺��ڽ��� ������ ������ Ȯ���� �װ��� small, medium, large Ȯ���� �ű⿡ �´°� tb1�� ���
		if(e.getSource() == but1) {
			if(combo1.getSelectedItem().equals("Small")) {
				tb1.setText("Small ������� 3000�� �Դϴ�.");
			}else if(combo1.getSelectedItem().equals("Medium")) {
				tb1.setText("Medium ������� 4000�� �Դϴ�.");
			}else if(combo1.getSelectedItem().equals("Large")) {
				tb1.setText("Large ������� 5000�� �Դϴ�.");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing2 sw2 = new Swing2();
	}

}
