package j190618;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import java.util.*;


//Entity 클래스
class Student {
	int stuNum;			// 학번
	String name;		// 이름
	String phone;
	

	// 생성자
	public Student(int stuNum, String name, String phone) {
		this.stuNum = stuNum;
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhonenum() {
		return phone;
	}
}
		
//Manager 클래스
class StudentManager{
	HashMap<Integer, Student> st = new HashMap<Integer, Student>();
	
	public void inputMenu(int stnum, String stname, String phnum ) {
		int studnum = stnum;
		String studname = stname; 
		String phoneNum = phnum;
		
		st.put(studnum, new Student(studnum, studname, phoneNum));
	}
	
	public Student searchMenu( int stnum ) {
		int studnum = stnum;
		
		for(Map.Entry<Integer, Student> s : st.entrySet()) {
			if(s.getKey() == studnum) {
				return s.getValue();
			}
		}
		return null;
	}
	
}


// UI 클래스
class StudentUI extends JFrame implements ActionListener {
	
	StudentManager SM = new StudentManager();	// StudentManager 생성
	
	// GUI 관련 변수들
	private JRadioButton RBinput, RBsearch;
	private JPanel northPanel, centerPanel, southPanel;	
	private JButton okButton;	
	private JTextField textStuNum, textName, textPhone, textResult;
	
	// 생성자
	public StudentUI() {
		setTitle("학생 정보 관리");
		setSize(225, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// North
		northPanel = new JPanel();
		
		RBinput = new JRadioButton("입력", true);
		RBinput.addActionListener(this);
		RBsearch = new JRadioButton("검색");
		RBsearch.addActionListener(this);
		ButtonGroup BGchoice = new ButtonGroup();
		BGchoice.add(RBinput);
		BGchoice.add(RBsearch);		
		
		okButton = new JButton("확인");		
		okButton.addActionListener(this);
		
		northPanel.add(RBinput);
		northPanel.add(RBsearch);
		northPanel.add(okButton);		
		add(northPanel, BorderLayout.NORTH);

		//Center
		centerPanel = new JPanel();		
		centerPanel.setLayout(new GridLayout(3,0));
		
		JLabel label1 = new JLabel("     학        번: ");
		JLabel label2 = new JLabel("     이        름: ");		
		JLabel label3 = new JLabel("     전화번호: ");

		textStuNum = new JTextField(10);
		textName = new JTextField(10);
		textPhone = new JTextField(10);
	
		centerPanel.add(label1);
		centerPanel.add(textStuNum);
		centerPanel.add(label2);		
		centerPanel.add(textName);		
		centerPanel.add(label3);		
		centerPanel.add(textPhone);		
		
		
		
		add(centerPanel, BorderLayout.CENTER);
		
		// South
		southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label4 = new JLabel("   결         과 : ");
		
				
		textResult = new JTextField(11);
		textResult.setEditable(false);
		
		southPanel.add(label4);
		southPanel.add(textResult);		
		
		add(southPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == RBinput ) {
			textStuNum.setText("");
			textStuNum.setEditable(true);
			textName.setText("");
			textName.setEditable(true);
			textPhone.setText("");
			textPhone.setEditable(true);			
			
			textResult.setText("");
		}
		else if(e.getSource() == RBsearch ) {
			textStuNum.setText("");
			textStuNum.setEditable(true);
			textName.setText("");
			textName.setEditable(false);
			textPhone.setText("");
			textPhone.setEditable(false);			
			
			textResult.setText("");
		}
		else if(e.getSource() == okButton) {
			
			if(RBinput.isSelected()){
				int stunum = Integer.parseInt(textStuNum.getText());
				String stuname = textName.getText();
				String phonenum = textPhone.getText();
				SM.inputMenu(stunum, stuname, phonenum);
				
				textStuNum.setText("");
				textName.setText("");
				textPhone.setText("");
				
				textResult.setText("저장완료!");
				
			}
			else if(RBsearch.isSelected())
			{
				int stunum = Integer.parseInt(textStuNum.getText());
				
				if(SM.searchMenu(stunum) == null) {
					textResult.setText("해당 학번의 학생이 없습니다.");
				} else {
					textName.setText(SM.searchMenu(stunum).getName());
					textPhone.setText(SM.searchMenu(stunum).getPhonenum());
					textResult.setText("찾았습니다.");
				}
			
			}
		}		
	}
}

public class StudentMainGUI {

	public static void main(String[] args) {
		
		new StudentUI();
	}
}
