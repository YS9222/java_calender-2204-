package honux.calender;

import java.util.Scanner;

public class calender {
	//(ABCD2) 아래로직을 위에서 함수(메서드)로 구현
	public static final int[] Max_Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysofMonth(int month) {
		return Max_Days[month-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calendar Stage 1
//		System.out.println("Hello calender ");
//		System.out.println("월 화 수 목 금 토 일");
//		System.out.println("----------------");
//		System.out.println(" 1 2 3  4 5  6 7");
		
		//숫자입력시 해당 숫자월의 최대일수 출력
		//my try (31일, 30일 28일에 해당하는 월을 나눠서 각 배열에 넣고 if문 사용해서 입력이 배열내 요소에 해당하면 출력 시도함)
		
//		int[] one = new int [7];
//		int[] zero = new int [4];
//		int eight = 28;
//		int[] one = (1,3,5,7,8,10,12);
//		
//		System.out.println("지금은 몇월?(숫자로)");
//		
//		Scanner scanner = new Scanner(System.in);
		
		//answer
		
		Scanner scanner = new Scanner(System.in);
		calender cal = new calender();  //(ABCD3)위 메서드를 아래에서 활용하기 위해 필요 
										
		
		System.out.println("달을 입력하세요");
		int month = scanner.nextInt();
		
		
//		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //gugudan case외 직접적으로 배열만드는 법 ={};
//																		 // 중괄호 안에 직접 넣기
//		System.out.printf("%d월은 %d일 까지 있습니다",month, maxDays[month-1]);
		//(ABCD1)함수는 보기 좋게 위로 뺄수있다
		
		//로직구현후
//		System.out.printf("%d월은 %d일 까지 있습니다",month, maxDaysofMonth(month)); (ABCD4)이렇게 하면 안되고
		System.out.printf("%d월은 %d일 까지 있습니다",month, cal.maxDaysofMonth(month));
													//중요!!(같은 클래스 안의 메서드라도 사용하기 위해서는 cal. 필요)
		
	
		
		
		
		
		
	}

}
