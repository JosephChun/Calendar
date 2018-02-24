import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("두 수를 입력하세요.");
		
		String num = scanner.nextLine();
		String[] nums = num.split(" ");
		
		int first = Integer.parseInt(nums[0]);
		int second = Integer.parseInt(nums[1]);
		
		System.out.println("두 수의 합은 " + (first+second) + "입니다.");
		
		scanner.close();
		*/
		
		System.out.println("달을 입력하세요.");
		int month = scanner.nextInt();
		int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println(month + "월은 " + monthDay[(month-1)] + "일까지 있습니다");
		
	}

}
