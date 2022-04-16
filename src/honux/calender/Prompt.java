package honux.calender;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal>";
	
	public void runPrompt(){
		//While활용해서 입력값이 -1 아니면 반복되게(prompt 활용)
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
		System.out.print(PROMPT); //prompt 활용 
		month = scanner.nextInt();
		if(month == -1) {	//-1인 경우 반복문이 중단되고 while을 벗어남
			break;
		}
		if(month>12) {		//벗어나는 경우 while의 처음으로 돌아감
			continue;
		}
//		System.out.printf("%d월은 %d일 까지 있습니다%n", month, cal.maxDaysofMonth(month));
		
		//cal의 달력출력
		cal.printSampleCalendar(2022, month);	
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
