import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Myframe extends JFrame
{
	JButton button;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	
	JComboBox combo;
	
	public Myframe()
	{
		setSize(350,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� 4Ģ���� ���α׷�");
				
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();		
		
		
        String[] opList = { "  +  ", "  -  ", "  *  ", "  /  "};
		combo = new JComboBox(opList);
		
		t1=new JTextField(5); 
		t2=new JTextField(5);
		t3=new JTextField(5);
		t4=new JTextField(28);
		
		t3.setEditable(false);
		t4.setEditable(false);
		
		button=new JButton("  =  ");
		button.addActionListener(new MyListener());		

		panel1.add(t1);		
		panel1.add(combo);		
		panel1.add(t2);
		panel1.add(button);		
		panel1.add(t3);		
		this.add(panel1, BorderLayout.NORTH);
		
		panel2.add(t4);
		this.add(panel2, BorderLayout.CENTER);		

		setVisible(true);
	}

	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			//��ư �Է½� �̺�Ʈ �߻�
			if(e.getSource()==button)
			{
				try{
					//ù��° , �ι�° ���� �޾ƿ�
					int num1 = Integer.parseInt(t1.getText());
					int num2 = Integer.parseInt(t2.getText());
					int result = 0;
				
					// ���ϱ�
					if(combo.getSelectedItem().equals("  +  ")) {
						result = num1 + num2;
						t3.setText(String.valueOf(result));
						t4.setText("���� 4Ģ���� ��� �Ϸ�!!");
					// ����
					}else if(combo.getSelectedItem().equals("  -  ")) {
						result = num1 - num2;
						t3.setText(String.valueOf(result));
						t4.setText("���� 4Ģ���� ��� �Ϸ�!!");
					// ���ϱ�
					}else if(combo.getSelectedItem().equals("  *  ")) {
						result = num1 * num2;
						t3.setText(String.valueOf(result));
						t4.setText("���� 4Ģ���� ��� �Ϸ�!!");
					// ������
					}else if(combo.getSelectedItem().equals("  /  ")) {
						//�ڵ����� ū�� / ������ ��갪���� �ٲ���
						if( num1 >= num2) {
							result = num1 / num2;
						}else if(num1 <= num2) {
							result = num2 / num1;
						}
						t3.setText(String.valueOf(result));
						t4.setText("���� 4Ģ���� ��� �Ϸ�!!(ū�� / ������)");
					}
				}
				//JTextField�� �������ƴ� �ٸ� �̻��� ���� ������ ��� ���� ó��
				catch(NumberFormatException a){
					t4.setText("��!! ������ ��� �϶�ϱ�!!");
				}
				//JTextField���� ������� 0�� ���� ������ ��� ���� ó��
				catch(ArithmeticException a){
					t4.setText("�ʵ��б� �ȳ��Գ�!! 0���δ� ������ ���ݾ�!");
				}			
			}			
		}
	}
}

public class calcEx {
	public static void main(String[] arge)
	{
		Myframe f=new Myframe();
	}
}
