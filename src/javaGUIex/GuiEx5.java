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

public class GuiEx5 extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = {
			"Backspace","","","CE","C",
			"7","8","9","/","sqrt",
			"4","5","6","x","%",
			"1","2","3","-","1/x",
			"0","+/-",".","+","=",
	};
	
	public GuiEx5() {
		tField = new JTextField("0",35);
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,5,3,3));
		buttons = new JButton[25];
		int index = 0;
		for(int rows=0; rows < 5; rows++) {
			for(int cols = 0; cols < 5; cols++) {
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
		//for문으로 각 버튼마다 값을 받아와 tField에 값 넣어줌
		for(int i=0; i<buttons.length;i++)
			if(e.getSource() == buttons[i]) {
				//CE버튼만 텍스트는 아무것도 나오지 않도록 설정
				if(buttons[i].getText().equals("CE"))
					tField.setText("");
				else
					tField.setText(buttons[i].getText());
			}
	}
	
	public static void main(String[] args) {
		GuiEx5 ex5 = new GuiEx5();
	}

}
