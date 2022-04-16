package honux.calender;

import java.util.Scanner;

public class Prompt {
	public int parseDay(String Day) {
		if(Day.equals("SU")) {
			return 0;
		}else if(Day.equals("MO")) {
			return 1;
		}else if(Day.equals("TU")) {
			return 2;
		}else if(Day.equals("WE")) {
			return 3;
		}else if(Day.equals("TH")) {
			return 4;
		}else if(Day.equals("FR")) {
			return 5;
		}else if(Day.equals("SA")) {
			return 6;
		}else return 0; //위 요일말고 아무거나 집어넣어도 0을 RETURN하도록
	}
	
	private final static String PROMPT = "cal>";
	
	public void runPrompt(){
		//While활용해서 입력값이 -1 아니면 반복되게(prompt 활용)
		Scanner scanner = new Scanner(System.in);
		calender cal = new calender(); 

		int month = 1; //변수선언(숫자상관없음 )
		int year = 2022;
		int Day = 2;
		
//		while(month!=-1) {		//입력값이 -1인 경우 중단
//			System.out.println("달을 입력하세요");
//			System.out.print(PROMPT);
//			month = scanner.nextInt();
//			System.out.printf("%d월은 %d일 까지 있습니다%n", month, cal.maxDaysofMonth(month));		
//	}		//-1이나 1~12 벗어나는 숫자가 들어가면 오류가 발생 - 반복문은 일단 입력되면 반복문내 동작문이 동작되고 난 후 조건을 비교하여 중단되기때문
			//so, -1이 들어간 경우 cal.maxDayofMonth에서 -1이 들어가기 때문에 오류가 발생 		
		
		//이 경우
		while(true) {		//무한루프
		System.out.println("연도를 입력하세요");
		System.out.print("Year> ");
		year = scanner.nextInt();
		if(year==-1) {
			break;  //-1인경우 반복문을 벗어남
		}
		
		System.out.println("달을 입력하세요");
		System.out.print("Month> "); //prompt 활용 위치 중요
		month = scanner.nextInt();
		
		if(month>12 || month<1) {		//벗어나는 경우 while의 처음으로 돌아감 12보다 크거나 1보다 작을때 
			continue;
		}
		
		System.out.println("첫번째 요일을 입력하세요 (SU,MO,TU,WE,TH,FR,SA)");
		System.out.print("Day> "); //prompt 활용 위치 중요
		String StrDay = scanner.next(); //.nextLine 했다가 버그발생 - 왜?
		Day = parseDay(StrDay); //위에서 정의했으니 int Day 이렇게 앞에 정의할 필요 없음 
		
		
//		System.out.printf("%d월은 %d일 까지 있습니다%n", month, cal.maxDaysofMonth(month));
		
		//cal의 달력출력
		cal.printSampleCalendar(year, month, Day);	
		System.out.println(); // 달력끝난후 줄바꿈위해
		}
		System.out.println("BYE");
		
	}

	public static void main(String[] args) {
		//월 입력받으면 해당월의 달력 출력,  -1을 받기전까지 반복 입력받음, prompt 활용 
		//셀실행
		Prompt p = new Prompt();
		p.runPrompt();
	

	}

}
