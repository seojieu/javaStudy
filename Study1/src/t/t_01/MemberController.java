package t.t_01;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		int count = 0;
		
		for(int i =0; i < m.length; i++) {
			if(m[i] != null) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null ) {
				return true;
			}
			
			String userid = m[i].getId();
			if(userid.equals(inputId)) {
				return false;
			}
			
		}
		return false;

	}
	
	public void insertMember(String id,String name,String password, String email,String gender,int age) {
		
	}
	
	public String searchId(String id) {
		for( int i = 0; i < m.length; i++) {
			String userid = m[i].getId();
			if(userid.equals(id)) {
				return m[i].getId();
			}
			return null;
		}
	}
	
	public Member[] searchName(String name) {
		
	}
	
	public Member[] searchEmail(String email) {
		
	}
	
	public boolean updatePassword(String id,String password) {
		
	}
	
	public boolean updateName(String id, String name) {
		
	}
	
	public boolean updateEmail(String id , String email) {
		
	}
	
	public boolean delete(String id) {
		
	}
	
	public void delete() {
	
	}
	
	public Member[] printAll() {
		
	}
}
