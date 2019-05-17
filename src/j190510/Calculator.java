package j190510;
import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{
	
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	//계산기 버튼안에 들어갈 내용들 배열로 저장
	private String[] labels = {
			"Backspace","","","CE","C",
			"7","8","9","/","sqrt",
			"4","5","6","x","%",
			"1","2","3","-","1/x",
			"0","+/-",".","+","=",
	};
	
	public Calculator() {
		//계산기 값이 나올 텍스트박스
		tField = new JTextField("0",35);
		panel = new JPanel();
		//임으로 못바꾸도록 투명하게 조정
		tField.setEnabled(false);
		//판넬에 레이아웃을 GridLayout으로 설정 (5열, 여백 3)
		panel.setLayout(new GridLayout(0,5,3,3));
		//버튼 25개 생성
		buttons = new JButton[25];
		//label, button 배열에 선택값을 위한 index 변수 
		int index = 0;
		//행을 위한 반복문
		for(int rows=0; rows < 5; rows++) {
			//열을 위한 반복문
			for(int cols = 0; cols < 5; cols++) {
				//버튼에 0번부터 24번까지 label에있는 값들을 index 변수를 참조하여 넣어주게됨 
				buttons[index] = new JButton(labels[index]);
				//cols가 3 이상이 되엇을때
				if( cols >= 3)
					// 버튼글자색을 빨강으로 함
					buttons[index].setForeground(Color.red);
				else
					// 버튼글자색을 파랑으로 함
					buttons[index].setForeground(Color.blue);
				//반복하는동안 버튼의 모든 바탕색을 노랑으로 함
				buttons[index].setBackground(Color.yellow);
				//반복하는 동안 버튼을 모두 panel에 add함
				panel.add(buttons[index]);
				//반복을 할때마다 index를 1씩 올려줘 button 배열 위치와 label 배열 위치를 정해줌
				index++;
			}
		}
		//gridlayout의 tFeld를 북쪽에 배치
		add(tField, BorderLayout.NORTH);
		//계산기 버튼들이 들어잇던 panel을 중앙에 배치
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		//프레임의 크기를 컴포넌트에 맞춤
		pack();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator s = new Calculator();
	}

}
