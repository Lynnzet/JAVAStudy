package j190604;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing1 extends JFrame implements ActionListener {
	JPanel panel1,panel2,panel3;
	JLabel lb1,lb2;
	JTextField tf1;
	JButton but1,but2;
	
	//1~100까지중 랜덤 숫자가 들어가있는 변수
	int ranNum = (int)((Math.random()*99)+1);
	//유저 입력시 int로 변환한 숫자를 담아줄 변수
	int tf1_int;
	
	
	public Swing1() {
		this.setTitle("숫자게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,150);
		
	//랜덤값 확인용 print
		System.out.println(ranNum);
		
		panel1 = new JPanel();
		
		lb1 = new JLabel("숫자를 추측하시오 : ");
		tf1 = new JTextField(10);
	//JTextField에서 엔터 입력시 이벤트 발생
		tf1.addActionListener(this);
		
		panel1.add(lb1);
		panel1.add(tf1);
		
		panel2 = new JPanel();
		lb2 = new JLabel("숫자를 입력하시오.");
		panel2.add(lb2);
		
		panel3 = new JPanel();
		//리셋 버튼
		but1 = new JButton("새 게임");
		but1.addActionListener(this);
	
		//종료 버튼	
		but2 = new JButton("종료");
		but2.addActionListener(this);
		panel3.add(but1);
		panel3.add(but2);
		
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.add(panel3, BorderLayout.SOUTH);
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//텍스트 필드 이벤트
		if(e.getSource() == tf1) {	
			//tf1_int 변수에 tf1에 입력한 숫자 int형으로 받아옴
			tf1_int = Integer.parseInt(tf1.getText());
			
			//둘이 비교후 정답이거나 높거나 낮음을 lb2에 출력
			if(ranNum == tf1_int) {
				lb2.setText("정답입니다.");
			}else if(ranNum < tf1_int){
				lb2.setText("높습니다");
			}else if(ranNum > tf1_int) {
				lb2.setText("낮습니다");
			}
		}
		//리셋 버튼 이벤트
		if(but1 == e.getSource()) {
			System.out.println(ranNum);
			//랜덤 변수에 다시 랜덤값을 넣어줌
			ranNum = (int)((Math.random()*100)+1);
			//텍스트필드, 라벨 둘다 공백 초기화
			tf1.setText("");
			lb2.setText("숫자를 입력하시오.");
		}
		//종료버튼 이벤트
		if(but2 == e.getSource()) {
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing1 ex1 = new Swing1();
	}
}

