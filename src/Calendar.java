import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���.");
		
		String num = scanner.nextLine();
		String[] nums = num.split(" ");
		
		int first = Integer.parseInt(nums[0]);
		int second = Integer.parseInt(nums[1]);
		
		System.out.println("�� ���� ���� " + (first+second) + "�Դϴ�.");
		
		scanner.close();


	}

}
