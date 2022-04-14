package honux.calender;

import java.util.Scanner;

public class calender {
	// (ABCD2) 아래로직을 위에서 함수(메서드)로 구현
	public static final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxDaysofMonth(int month) {
		return Max_Days[month - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calendar Stage 1
//		System.out.println("Hello calender ");
//		System.out.println("월 화 수 목 금 토 일");
//		System.out.println("----------------");
//		System.out.println(" 1 2 3  4 5  6 7");

		// 숫자입력시 해당 숫자월의 최대일수 출력
		// my try (31일, 30일 28일에 해당하는 월을 나눠서 각 배열에 넣고 if문 사용해서 입력이 배열내 요소에 해당하면 출력 시도함)

//		int[] one = new int [7];
//		int[] zero = new int [4];
//		int eight = 28;
//		int[] one = (1,3,5,7,8,10,12);
//		
//		System.out.println("지금은 몇월?(숫자로)");
//		
//		Scanner scanner = new Scanner(System.in);

		// answer 배열안에 최대일수들을 넣어놓고 배열번호이용해서 호출함
//		Scanner scanner = new Scanner(System.in);
//		calender cal = new calender(); // (ABCD3)위 메서드를 아래에서 활용하기 위해 필요 (클래스명 변수명 = new 클래스명)
//
//		System.out.println("달을 입력하세요");
//		int month = scanner.nextInt();

//		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //gugudan case외 직접적으로 배열만드는 법 ={};
//																		 // 중괄호 안에 직접 넣기
//		System.out.printf("%d월은 %d일 까지 있습니다",month, maxDays[month-1]);
		// (ABCD1)함수는 보기 좋게 위로 뺄수있다

		// 로직구현후(ABCD)
//		System.out.printf("%d월은 %d일 까지 있습니다",month, maxDaysofMonth(month)); (ABCD4)이렇게 하면 안되고
//		System.out.printf("%d월은 %d일 까지 있습니다", month, cal.maxDaysofMonth(month));		//이렇게 해야
		// 중요!!(같은 클래스 안의 메서드라도 사용하기 위해서는 cal. 필요)
		
		
		
		
		
		//숫자입력받은 후 숫자만큼 반복입력받기 EX 4 입력하면 네번 반복하여 입력받기
		//my try
//		Scanner scanner = new Scanner(System.in);
//		calender cal = new calender();
//		System.out.println("반복횟수를 입력하세요");
//		int num = scanner.nextInt();
//		
//		
//		System.out.println("월을 입력하세요");
//		int[] array = new int [num];
//		for(int q = 0; q<num; q++) {
//			int ArrayNumber = scanner.nextInt();
//			array[q] = ArrayNumber;
//		}
//
//		for(int i = 0; i<num; i++) {
//			//cal.maxDaysofMonth(array[i]);   //내 실수(위 메서드에서 return 이라는 게 춝력도 하는거라고 생각-return은 출력과 관계없음)
//			System.out.printf("%d월의 최대일수는 %d일입니다%n",array[i],cal.maxDaysofMonth(array[i]));
//		}
		
		
		//While활용해서 입력값이 -1 아니면 반복되게(prompt 활용)
		String PROMPT = "cal>";
		Scanner scanner = new Scanner(System.in);
		calender cal = new calender(); 

		int month = 1;
		
//		while(month!=-1) {		//입력값이 -1인 경우 중단
//			System.out.println("달을 입력하세요");
//			System.out.print(PROMPT);
//			month = scanner.nextInt();
//			System.out.printf("%d월은 %d일 까지 있습니다%n", month, cal.maxDaysofMonth(month));		
//	}		//-1이나 1~12 벗어나는 숫자가 들어가면 오류가 발생 - 반복문은 일단 입력되면 반복문내 동작문이 동작되고 난 후 조건을 비교하여 중단되기때문
			//so, -1이 들어간 경우 cal.maxDayofMonth에서 -1이 들어가기 때문에 오류가 발생 
			
		//이 경우 
		while(true) {		//무한루프
		System.out.println("달을 입력하세요");
		System.out.print(PROMPT);
		month = scanner.nextInt();
		if(month == -1) {	//-1인 경우 반복문이 중단되고 while을 벗어남
			break;
		}
		if(month>12) {		//벗어나는 경우 while의 처음으로 돌아감
			continue;
		}
		System.out.printf("%d월은 %d일 까지 있습니다%n", month, cal.maxDaysofMonth(month));	
		}
		System.out.println("BYE");
}
}
