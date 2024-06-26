package quiz;

public class B10_Gugudan {
	
	/*
 	1. 구구단을 다음과 같이 가로로 출력
 	
 	2단: 2x1=2 2x2=4 2x3=6 ...
 	3단: 3x1=3 3x2=6 ...
 	4단: ...
 	
 	2. 구구단을 다음과 같이 세로로 출력해 보세요
 	
 	2단		3단 		4단
 	2x1=2	3x1=3	4x1=4 ...
 	2x2=4	3x2=6	4x2=8 ...
 */

	public static void main(String[] args) {
		
		//1.
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d단: ", dan);
			for (int j = 1; j < 10; ++j) {
				System.out.printf("%dx%d=%-2d ", dan, j, dan*j);
			}
			System.out.println();
		}
		System.out.println();
		
		//2.
		for (int i = 2; i < 10; ++i) {
			System.out.printf("%d단\t", i);
		}
		System.out.println();
		for (int j = 1; j < 10; ++j) {
			for (int dan = 2; dan < 10; ++dan) {
				System.out.printf("%dx%d=%d\t", dan, j, dan*j);
				}
				System.out.println();
		}
		
		
		
		
		
		
		
	}
		
	

}


