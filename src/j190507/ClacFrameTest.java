package j190507;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class CalcFrame extends JFrame implements ActionListener{
	//다른 메소드에서도 사용할 박스들과 버튼들을 위에서 정의
	private JButton button;
	private JTextField tf1;
	private JTextField tf2;
	
	public CalcFrame(){
		
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("온도변환기");
		
		JPanel panel1 = new JPanel();
		JLabel la1 = new JLabel("화씨 온도");
		JLabel la2 = new JLabel("섭씨 온도");
		//화씨 받아올 택스트 필드 생성 (기본값 100지정)
		tf1 = new JTextField("100",20);
		//섭씨를 표시할 텍스트 필드 생성
		tf2 = new JTextField(20);
		button = new JButton("변환");
		//버튼에 밑 actionPerformed를 적용
		button.addActionListener(this);
		
		panel1.add(la1);
		panel1.add(tf1);
		panel1.add(la2);
		panel1.add(tf2);
		panel1.add(button);
		
		add(panel1);
		setVisible(true);
		
		
	}
		public void actionPerformed(ActionEvent e) {
				//화씨를 정수형으로 받아올 변수
				int f;
				double result;
				//화씨를 입력한 텍스트필드에서의 텍스트를 받아온뒤 parseInt로 문자열을 정수형으로 변환
				f = Integer.parseInt(tf1.getText());
				//수식을 넣어 계산후 result변수에 넣어줌
				result = (f-32) / 1.8;
				//섭씨를 출력할 텍스트필드에 String.format으로 정수형에서 변환후 문자열로 넘겨줌
				tf2.setText(String.format("%f", result));
		}
	}

public class ClacFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcFrame cf = new CalcFrame();
	}

}
