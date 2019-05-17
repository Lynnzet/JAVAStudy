package j190517;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MouseClickedEX extends JFrame {
	private JLabel label;
	private JPanel panel;
	public MouseClickedEX() {
		setTitle("Mouse Event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel();
		panel = new JPanel();
		
		panel.add(label);
		
		panel.addMouseListener(new MyMouseAdapter());
		panel.addMouseMotionListener(new MyMouseAdapter());
		add(panel);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter{
		public void mouseMoved(MouseEvent e) {
			label.setText(" X=" + e.getX() + " Y=" + e.getY());
		}
		public void mousePressed(MouseEvent e) {
			panel.setBackground(Color.PINK);
		}public void mouseReleased(MouseEvent e) {
			panel.setBackground(null);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseClickedEX ex = new MouseClickedEX();
	}
}
