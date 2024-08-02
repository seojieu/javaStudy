package array;

public class Test8 {

	public static void main(String[] args) {
		/*
		 	2차원 배열에 들어있는 데이터들의 합계와 평균을 구한다
		 	
		 	1. 사용 데이터
		 	int [][] array = {12,41,36,56},
		 					       {82, 10, 12, 61},
		 					       {14, 16, 18, 78},
		 					      {45, 26, 72, 23}};
		 					      
		 	2. 실행 결과
		 	합계 : 602.0
		 	평균 : 37.625
		 	합계와 평균 값은 double로 처리 한다.
		 */
		
		int [][] array = {{12,41,36,56},
			       {82, 10, 12, 61},
			       {14, 16, 18, 78},
			      {45, 26, 72, 23}};
			      
		double sum = 0, avg = 0;
				for(int i = 0; i < array.length; i++) {
					for (int j = 0; j < array.length; j++) {
						sum += array[i][j];
					}
				}
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + sum / (array.length * array.length));
	}
}

