import java.util.Scanner;

public class prompt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �Է��ϼ���.");
			int month = scanner.nextInt();
			
			if(month==-1) {
				System.out.println("Have a nice day!");
				break;
			}
		
			System.out.println(month + "���� " + Calendar.maxDay(month) + "�ϱ��� �ֽ��ϴ�");
			System.out.println();
			Calendar.printSampleCalendar();
		}
		
		scanner.close();
	}
}
