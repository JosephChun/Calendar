import java.util.Scanner;

public class prompt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("달을 입력하세요.");
			int month = scanner.nextInt();
			
			if(month==-1) {
				System.out.println("Have a nice day!");
				break;
			}
		
			System.out.println(month + "월은 " + Calendar.maxDay(month) + "일까지 있습니다");
			System.out.println();
			Calendar.printSampleCalendar();
		}
		
		scanner.close();
	}
}
