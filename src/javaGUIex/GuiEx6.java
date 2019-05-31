package javaGUIex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiEx6 extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private int inputChk=0 ,count = 0;
	private int numOne, sum, total;
	private String chkInput;
	private String mainNum="";
	
	private String[] labels = {
			"Backspace","","","CE",
			"7","8","9","/",
			"4","5","6","x",
			"1","2","3","-",
			"0","=",".","+",
	};
	
	public GuiEx6() {
		tField = new JTextField(35);
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,4,3,3));
		buttons = new JButton[25];
		int index = 0;
		for(int rows=0; rows < 5; rows++) {
			for(int cols = 0; cols < 4; cols++) {
				buttons[index] = new JButton(labels[index]);
				if( cols >= 3)
					buttons[index].setForeground(Color.red);
				else
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.yellow);
				buttons[index].addActionListener(this);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//버튼 누른 값을 eventText에 넣어줌
		String eventText = e.getActionCommand();
		//각각 수식 기호 버튼마다 if로 수식들을 넣어줌
		if(eventText.equals("+")) {
			inputChk = 1;
		}else if(eventText.equals("-")) {
			inputChk = 2;
		}else if(eventText.equals("x")) {
			inputChk = 3;
		}else if(eventText.equals("/")) {
			inputChk = 4;
		}else if(eventText.equals("=")) {
			inputChk = 5;
		}else if(eventText.equals("CE")){
			inputChk = 6;
		}else {
			//x + 다음 숫자들이 올 if
			if(count == 1) {
				tField.setText(String.valueOf(total) + chkInput);
				count = 0;
			//계산 완료수 count변수로인해 tField 초기화에 count 다시 초기화
			}else if (count == 2) {
				tField.setText("");
				count = 0;
			}
			//위수식들을 제외한 버튼들(숫자) 값들을 tField에 입력값마다
			tField.setText(tField.getText()+e.getActionCommand());
			//입력값들을 mainNum에 저장해줌
			mainNum += e.getActionCommand();
		}
		try {
			if((total != 0) && (inputChk <= 5)){
				tField.setText(tField.getText());
			} else {
				//위 수식들을 확인하고 첫번째로 대입할 수를 total에 계산해주고 식 입력한곳까지 출력해줌
				if( inputChk == 1) { // 더하기
					numOne = Integer.parseInt(mainNum);
					total += numOne;
					numOne = 0;
					chkInput = "+";
					tField.setText(String.valueOf(total)+chkInput);
					mainNum = "";
					
					count = 1;
					
				}else if( inputChk == 2) { // 빼기
					numOne = Integer.parseInt(mainNum);
					total += numOne;
					numOne = 0;
					chkInput = "-";
					tField.setText(String.valueOf(total)+chkInput);
					mainNum = "";
					
					count = 1;
					
				}else if( inputChk == 3) { // 곱하기
					numOne = Integer.parseInt(mainNum);
					total += numOne;
					numOne = 0;
					chkInput = "x";
					tField.setText(String.valueOf(total)+chkInput);
					mainNum = "";
					
					count = 1;
					
				}else if( inputChk == 4) { // 나누기
					numOne = Integer.parseInt(mainNum);
					total += numOne;
					numOne = 0;
					chkInput = "/";
					tField.setText(String.valueOf(total)+chkInput);
					mainNum = "";
					
					count = 1;
				}else if(inputChk == 6) { // CE
					tField.setText("");
					numOne = 0;
					total = 0;
					sum = 0;
					count = 0;
					inputChk = 0;
					mainNum="";
				}
			}
		} catch(Exception ef) {
		}
		
		if(total == 0) {
			tField.setText(tField.getText());
		}else {
			//두번째 수 입력계산용
			if((inputChk == 5) && chkInput.equals("+")) { // 더하기
				
				numOne = Integer.parseInt(mainNum);
				
				sum = numOne + total;
				
				count = 2;
				numOne = 0;
				total = 0;
				mainNum = "";
				tField.setText(String.valueOf(sum));
				
			} else if((inputChk == 5) && chkInput.equals("-")) { // 빼기
				
				numOne = Integer.parseInt(mainNum);
				
				sum = total - numOne;
				
				count = 2;
				numOne = 0;
				total = 0;
				mainNum = "";
				tField.setText(String.valueOf(sum));
				
			} else if((inputChk == 5) && chkInput.equals("x")) { // 곱하기
				
				numOne = Integer.parseInt(mainNum);
				
				sum = numOne * total;
				
				count = 2;
				numOne = 0;
				total = 0;
				mainNum = "";
				tField.setText(String.valueOf(sum));
				
			} else if((inputChk == 5) && chkInput.equals("/")) { // 나누기
				
				numOne = Integer.parseInt(mainNum);
				
				sum = total / numOne;
				
				count = 2;
				numOne = 0;
				total = 0;
				mainNum = "";
				tField.setText(String.valueOf(sum));
				
			}
		}
	}
	
	public static void main(String[] args) {
		GuiEx6 ex6 = new GuiEx6();
	}

}