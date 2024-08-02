package e_array;

public class A_Array {

	public static void main(String[] args) {
		//int형 변수 5개 만들어서 0~4의 값을 각각 할당해주세요.

		/*
		 * 1. 배열선언(여러개의 값들을 보관할 배열을 만들겠다. -> 참조변수 선언)
		 * 자료형[] 배열이름;
		 * 자료형 배열이름[];
		 */
		
		int[] arr1;
		
		/*
		 * 2. 배열 할당(이 배열에 몇개의 값들을 보관할건지 크기를 지정하는 과정)
		 * 배열명 = new 자료형[배열의크기(길이)];
		 */
		
		arr1 = new int[10]; 
		
		/*
		 * 3. 값을 대입하고 가져와서 사용하기
		 * index를 이용해서 접근한다.
		 */
		
		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 2;
//		arr[3] = 3;
//		arr[4] = 4;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]);
		} 
	}

}
