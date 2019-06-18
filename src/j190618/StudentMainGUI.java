package j190618;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import java.util.*;


//Entity Ŭ����
class Student {
	int stuNum;			// �й�
	String name;		// �̸�
	String phone;
	

	// ������
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
		
//Manager Ŭ����
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


// UI Ŭ����
class StudentUI extends JFrame implements ActionListener {
	
	StudentManager SM = new StudentManager();	// StudentManager ����
	
	// GUI ���� ������
	private JRadioButton RBinput, RBsearch;
	private JPanel northPanel, centerPanel, southPanel;	
	private JButton okButton;	
	private JTextField textStuNum, textName, textPhone, textResult;
	
	// ������
	public StudentUI() {
		setTitle("�л� ���� ����");
		setSize(225, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// North
		northPanel = new JPanel();
		
		RBinput = new JRadioButton("�Է�", true);
		RBinput.addActionListener(this);
		RBsearch = new JRadioButton("�˻�");
		RBsearch.addActionListener(this);
		ButtonGroup BGchoice = new ButtonGroup();
		BGchoice.add(RBinput);
		BGchoice.add(RBsearch);		
		
		okButton = new JButton("Ȯ��");		
		okButton.addActionListener(this);
		
		northPanel.add(RBinput);
		northPanel.add(RBsearch);
		northPanel.add(okButton);		
		add(northPanel, BorderLayout.NORTH);

		//Center
		centerPanel = new JPanel();		
		centerPanel.setLayout(new GridLayout(3,0));
		
		JLabel label1 = new JLabel("     ��        ��: ");
		JLabel label2 = new JLabel("     ��        ��: ");		
		JLabel label3 = new JLabel("     ��ȭ��ȣ: ");

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
		
		JLabel label4 = new JLabel("   ��         �� : ");
		
				
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
				
				textResult.setText("����Ϸ�!");
				
			}
			else if(RBsearch.isSelected())
			{
				int stunum = Integer.parseInt(textStuNum.getText());
				
				if(SM.searchMenu(stunum) == null) {
					textResult.setText("�ش� �й��� �л��� �����ϴ�.");
				} else {
					textName.setText(SM.searchMenu(stunum).getName());
					textPhone.setText(SM.searchMenu(stunum).getPhonenum());
					textResult.setText("ã�ҽ��ϴ�.");
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
