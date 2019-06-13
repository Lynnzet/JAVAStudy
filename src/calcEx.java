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
		setTitle("정수 4칙연산 프로그램");
				
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
			//버튼 입력시 이벤트 발생
			if(e.getSource()==button)
			{
				try{
					//첫번째 , 두번째 정수 받아옴
					int num1 = Integer.parseInt(t1.getText());
					int num2 = Integer.parseInt(t2.getText());
					int result = 0;
				
					// 더하기
					if(combo.getSelectedItem().equals("  +  ")) {
						result = num1 + num2;
						t3.setText(String.valueOf(result));
						t4.setText("정수 4칙연산 계산 완료!!");
					// 빼기
					}else if(combo.getSelectedItem().equals("  -  ")) {
						result = num1 - num2;
						t3.setText(String.valueOf(result));
						t4.setText("정수 4칙연산 계산 완료!!");
					// 곱하기
					}else if(combo.getSelectedItem().equals("  *  ")) {
						result = num1 * num2;
						t3.setText(String.valueOf(result));
						t4.setText("정수 4칙연산 계산 완료!!");
					// 나누기
					}else if(combo.getSelectedItem().equals("  /  ")) {
						//자동으로 큰수 / 작은수 계산값으로 바꿔줌
						if( num1 >= num2) {
							result = num1 / num2;
						}else if(num1 <= num2) {
							result = num2 / num1;
						}
						t3.setText(String.valueOf(result));
						t4.setText("정수 4칙연산 계산 완료!!(큰수 / 작은수)");
					}
				}
				//JTextField에 정수가아닌 다른 이상한 값이 들어왔을 경우 오류 처리
				catch(NumberFormatException a){
					t4.setText("쫌!! 정수만 사용 하라니깐!!");
				}
				//JTextField에서 나누기로 0의 값이 들어왔을 경우 오류 처리
				catch(ArithmeticException a){
					t4.setText("초등학교 안나왔나!! 0으로는 나눌수 없잖아!");
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
