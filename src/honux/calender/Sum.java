package honux.calender;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {  //목표 2개의 정수를 입력받아서 합친 값을 출력하기(입력받은 문자열을 정수로 변환)
		int a,b;
		
		System.out.println("두 수를 입력해 주세요"); //눈속임이다. 아래 코드중 가운데에 들어가도 scanner의 작동에 아무런 영향 x
		
		//객체 생성
		Scanner scanner = new Scanner(System.in);//입력을 받게 도와줌, 원래는 파일을 받음, 키보드는 System.in
		
		String s1, s2;			//String Integer 등을 통해 바로 변수선언
		
		s1 = scanner.next();   // scanner 중 next 메서드 
		s2 = scanner.next();	// next-공백이전문장열 nextLine-문제열전체 nextInt-정수 nextDouble-실수 형을 입력받음 
		
		
		a = Integer.parseInt(s1);  //string을 int로 형변환
		b = Integer.parseInt(s2);
		
		System.out.println(a + "," + b);
		
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in); //입력받기
//        int number = scanner.nextInt();
		
//		int c = a + b;
//		System.out.println("두 수의 합은 " + (a+b)); //c를 넣는 대신 
		System.out.printf("%d와 %d의 합은 %d입니다 ", a, b, a+b );  //Systemout.println 대신 
														//%d-정수형 %c-문자 %s-문자열 %b-boolean %n-줄바꾸기 
		
		scanner.close();
		
		//정답:scanner 통해 입력받은 str값을 Integer.parseInt로 정수형으로 바꾼 후 println이나 printf 통해 출력
		
		

	}

}
 