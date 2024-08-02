package test240716.object3;

public class UserTest {

	public static void main(String[] args)  {
		User[] users = new User[3];
		// User 객체를 3개 생성하여 배열에 넣는다.
		users[0] = new User("user01","pass01","김철수", 32 ,'M',"010-1234-5678");
		users[1] = new User("user02","pass02","이영희", 25 ,'F',"010-5555-7777");
		users[2] = new User("user03","pass03","황진이", 20 ,'F',"010-9874-5632");
		 
		System.out.println("users list -----------------------------------------------------------------------------");
		
		// 배열에 있는 객체 정보를 모두 toString() 으로 출력 핚다. – for 문을 이용 할 것
		for(int i = 0; i < users.length; i++) {
			System.out.println(users[i].toString()); 
		}
		
		User[] copyUsers = new User[users.length];
		for(int i = 0; i < copyUsers.length; i++) {
			copyUsers[i] = (User) users[i].clone();
		}	
		
//		for(int i = 0; i < copyUser.length; i++) {
//			User copy = copyUser[i];
//			System.out.println(copy.toString());
//		}
		
		  for (User user : copyUsers) {
            System.out.println(copy.toString());
        }
		
	
        // users와 copyUsers의 각 index 별 객체의 값이 일치하는지 확인하고 출력하기
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].equals(copyUsers[i]));//copyUsers[i].equals(user[i])
        }
    }
}