package j190517;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ColorChangeFrame extends JFrame {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JPanel panel;
	
	public ColorChangeFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		panel = new JPanel();
		button1 = new JButton("노란색");
		button1.addActionListener(new MyListener());
		panel.add(button1);
		button2 = new JButton("핑크색");
		button2.addActionListener(new MyListener());
		panel.add(button2);
		button3 = new JButton("파랑색");
		button3.addActionListener(new MyListener());
		panel.add(button3);
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				panel.setBackground(Color.YELLOW);
			}else if(e.getSource() == button2) {
				panel.setBackground(Color.PINK);
			}else if(e.getSource() == button3) {
				panel.setBackground(Color.BLUE);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorChangeFrame cf = new ColorChangeFrame();
	}

}
