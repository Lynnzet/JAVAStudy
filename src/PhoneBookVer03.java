
public class PhoneBookVer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PhoneBookManager class�� manager��� �ν��Ͻ��� ������
		PhoneBookManager manager = new PhoneBookManager();
		
		int choice;
		
		
		while (true) {
			
			//�޴���� Ŭ������ showmenu�޼ҵ带 �ҷ��� �ȿ� ���� �����
			MenuViewer.showMenu();
			//������ ������ choice��� ������ ������ ���� ������ ������ �޴��� ���� ����
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
			//choice�� �޴����� PhoneBookManager���� �����ߴ� �޼ҵ���� case�� �����ؼ� �ʿ��Ҷ����� �ҷ���
			//4�� �Է½� ���� �ݺ��ϴ� while�� �׸��ǰԵ�.
			
			switch(choice) {
				case 1:
					manager.inputDate();
					break;
				case 2:
					manager.serchData();
					break;
				case 3:
					manager.deleteData();
					break;
				case 4:
					System.out.println("���α׷��� �����մϴ�.");
					return;
			}
		}

	}

}
