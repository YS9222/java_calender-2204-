package honux.calender;

import java.util.Scanner;

public class calender {
	// (ABCD2) 아래로직을 위에서 함수(메서드)로 구현
	public static final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final int[] Leap_Max_Days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; //윤년용 최대일수(2월에 29일 )

	public boolean isLeepYear(int year) { //year을 입력받았을때 윤년인지 판단
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 ==0)) { // 4로나누어떨어지고 and (100으로나누어떨어지지않거나 or 400으로 나누어떨어짐)
			return true; 					//논리구조 and = && , or = || (sift+\\)
		}
		else return false;
	}
	
	public int maxDaysofMonth(int year, int month) {
		if (isLeepYear(year)) {
			return Leap_Max_Days[month - 1];
		}
		else  {
			return Max_Days[month - 1];		
		}
	}

	//for Prompt.java(달력출력)
	public void printSampleCalendar(int year, int month, int Day) {
		System.out.printf("    <<%4d %3d>>%n",year, month); //%3d = 1칸값이 들어가도라도 3칸 차지(앞2칸은 빈칸으로)
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		//넣은 day에 따라 맞는 공백 출력
		for(int i = 0; i<Day; i++) {
			System.out.print("   ");   // "   " * i 하려함 i개수만큼 반복되기에 곱할필요 없음
										//줄바꿈기능 있는 println이 아니라 print
		}
			
		int maxDay = maxDaysofMonth(year, month);
		//FIRST LINE
		int count = 7-Day;    //첫줄에서 7-day 만큼만 출력
		int delim = (count<7)? count:0;   //밑에서 else if 로 else if (i % 7 ==0)하는 대신 변수에서 if, elseif 로 나눠놓음
		/*if (delim<7){
		 * delim = count}
		 * else {
		 * delim = 0 
		 * }  해당 if문과 위 줄은 동일 의미 
		 */
		
		
		for(int i = 1; i<=count; i++) {
			System.out.printf("%3d",i);
		}
			System.out.println();
		//SECOND LINE TO LAST
		count++;  //count에 1 더하기
		for(int i = count; i <= maxDay; i++) {

			System.out.printf("%3d",i); //한글자다 3칸씩 자리 차지하면서 최대일수까지 1부터 출력
			
			if(i % 7 == delim) {  //들어가는 각 일의 값을 7로 나눠서 나머지를 따져서 언제 줄바꿈할지
				System.out.println(); //줄바꿈기능이 있는 빈칸 넣기
			}
		
		}
		System.out.println();
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
		
		

		
		
}
}
