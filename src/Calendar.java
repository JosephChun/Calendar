import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("�� ���� �Է��ϼ���.");
		
		String num = scanner.nextLine();
		String[] nums = num.split(" ");
		
		int first = Integer.parseInt(nums[0]);
		int second = Integer.parseInt(nums[1]);
		
		System.out.println("�� ���� ���� " + (first+second) + "�Դϴ�.");
		
		scanner.close();
		*/
		
		System.out.println("���� �Է��ϼ���.");
		int month = scanner.nextInt();
		int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println(month + "���� " + monthDay[(month-1)] + "�ϱ��� �ֽ��ϴ�");
		
	}

}
