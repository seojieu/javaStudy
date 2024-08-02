package array;

import java.util.ArrayList;

public class Test10 {

	public static void main(String[] args) {
		/*
		 	문제10
		 	2차원 배열에 들어있는 데이터들 중 3의 배수만 골라내서 새로운 1차원 배열에 기록하고 출력한다.
		 	단 중복 값은 하나만 기록되게 한다.
		 	
		 	1. 사용 데이터
		 	int [][] array = {{12, 41, 36, 56},
		 							{82, 10, 12, 61},
		 							{14, 16, 18, 78},
		 						 	{45, 26, 72, 23}};
		 	int[] copyAr = new int[array의 행갯수 * 열갯수];
		 	
		 	2. 실행 결과
		 	copyAr : 12 36 18 78 45 72
		 */
		
	 	int [][] array = {{12, 41, 36, 56},
					{82, 10, 12, 61},
					{14, 16, 18, 78},
				 	{45, 26, 72, 23}};
	 	
		int[] copyAr = new int[size];
		int copyIndex = 0;
		
		//2차원 배열 array을 전체 검사
		for(int i = 0; i<array.length; i++) {
			size += array[i].length;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if ( array[i][j] % 3 == 0) {	//2차원배열의 i,j의 요소가 3의 배수인지 확인
					//i,j의 요소가 이미 copyAr들어있는 요소인지 확인
					boolean isCountinue = false;
						for(int k =0; k<copyIndex; k++) {
							if({copyAr[k] == array[i][j]) {
								isContinue = true;
								break;
							}
						}
							//isCountinue -> true일 때는 반복값이 존재;
							//!isCountinue ->반복값이 존재하지 않는다면 copyAr -> array[i][j]대입
							if (!isCountinue) {
								copyAr[copyIndex++] = array[i][j];
							}
						}
						//copyAr출력
						System.out.println("copyAr : ");
						for(int i = 0; i<copyIndex; i++) {
							System.out.println(copyAr[i] + " ");
						}			
			}
		}
		}
	


	
//	 	ArrayList<Integer> resultList = new ArrayList<>();
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				resultList.add(array[i][j]);
//
//				int[] copyAr = new int[resultList.size()];
//				for (int x = 0; x < resultList.size(); x++) {
//					copyAr[i] = resultList.get(i);
//				}
//				System.out.println("copyAr : ");
//				for (int num : copyAr) {
//					System.out.println(num + " ");
//				}
//				System.out.println();
//			}
//		}
//	}
//}


	 	        int[][] array = {
	 	            {12, 41, 36, 56},
	 	            {82, 10, 12, 61},
	 	            {14, 16, 18, 78},
	 	            {45, 26, 72, 23}
	 	        };
	 	        
	 	        // 결과값을 저장할 ArrayList 생성
	 	        ArrayList<Integer> resultList = new ArrayList<>();
	 	        
	 	        // 배열 순회하면서 3의 배수인 값만 추출하여 resultList에 추가
	 	        for (int i = 0; i < array.length; i++) {
	 	            for (int j = 0; j < array[i].length; j++) {
	 	                if (array[i][j] % 3 == 0) {
	 	                    resultList.add(array[i][j]);
	 	                }
	 	            }
	 	        }
	 	        
	 	        // ArrayList를 int 배열로 변환
	 	        int[] copyAr = new int[resultList.size()];
	 	        for (int i = 0; i < resultList.size(); i++) {
	 	            copyAr[i] = resultList.get(i);
	 	        }
	 	        
	 	        // 결과 출력
	 	        System.out.print("copyAr : ");
	 	        for (int num : copyAr) {
	 	            System.out.print(num + " ");
	 	        }
	 	        System.out.println();
	 	    }
	 	}
