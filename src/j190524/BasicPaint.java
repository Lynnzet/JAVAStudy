package j190524;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�. 


public class BasicPaint extends JFrame {
	static JPanel panel;
	
	BasicPaint() {
		ImageIcon image1 = new ImageIcon("image\\car.gif");
		JLabel ib = new JLabel(image1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.add(ib);
		panel.addMouseListener(new MyMouseAdapter());
		panel.addMouseMotionListener(new MyMouseAdapter());
		add(panel);
		
		setSize(800, 500);
		setVisible(true);
	}
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			panel.setBounds(e.getX(),e.getY(),50,50);
		}public void mouseDragged(MouseEvent e) {
			panel.setBounds(e.getX(),e.getY(),50,50);
		}
		
	}
	public static void main(String[] args) {
		BasicPaint bp = new BasicPaint();
	}
	
	
}


