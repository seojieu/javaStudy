package test240726.object1;

import java.util.List;
import java.util.Scanner;

public class Musicview {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 마지막 위치에 곡 추가");// addList() 실행
		System.out.println("2. 첫 위치에 곡 추가 ");	// addAtZero()
		System.out.println("3. 전체 곡 목록 출력");// printAll()
		System.out.println("4. 특정 곡 검색"); // searchMusic()
		System.out.println("5. 특정 곡 삭제");// removeMusic()
		System.out.println("6. 특정 곡 정보 수정"); // setMusic()
		System.out.println("7. 곡명 오름차순 정렬"); // ascTitle()
		System.out.println("8. 가수명 내림차순 정렬"); // descSinger()
		System.out.println("9. 종료 ");// “종료” 출력 후 main()으로 리턴
		System.out.print("메뉴 번호 선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		 
		switch(num) {
		case 1:
			this.addList();
			break;
		case 2:
			this.addAtZero();
			break;
		case 3:
			this.printAll();
			break;
		case 4:
			this.searchMusic();
			break;
		case 5:
			this.removeMusic();
			break;
		case 6:
			this.setMusic();
			break;
		case 7:
			this.ascTitle();
			break;
		case 8:
			this.descSinger();
			break;
		case 9:
			System.out.println("종료");
			return;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입려해주세요.");
		}
	}	
		// 메뉴 화면 반복 실행 처리
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.next();
		System.out.print("가수 명 : ");
		String singer = sc.next();
		
		
		mc.addList(new Music (title, singer));
		int result = mc.addList(new Music (title, singer));
		if(result == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addList()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.next();
		System.out.print("가수 명 : ");
		String singer = sc.next();
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		mc.addAtZero(new Music (title, singer));
		int result = mc.addAtZero(new Music (title, singer));
		if(result == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
		}
		// MusicController에 addAtZero()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔 창에 출력
		
	
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		List list = mc.printAll();
		// MusicController에 printAll() 반환 값을 출력한다
		System.out.println(list);
	}
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.next();
		
		Music m = mc.searchMusic(title);
		if(m == null) {
			System.out.println("검색한 곡이 없습니다.");
		} else {
			System.out.println(m);
		}
		// 사용자에게 곡 이름을 받고 MusicController에 있는 searchMusic으로 값을 넘긴다.
		// searchMusic()의 반환 값에 따라 반환 값이 없으면 “검색한 곡이 없습니다.”
		// 반환 값이 있으면 “검색한 곡은 000(곡 명, 가수 명) 입니다.” 콘솔 창에 출력
	
	}
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("삭제할 곡의 이름 : ");
		String removemusicname = sc.next();
		Music m = mc.removeMusic(removemusicname);
		if(m == null) {
			System.out.println("삭제할 곡이 없습니다.");
		} else {
			System.out.println(m.toString() + "을 삭제했습니다.");
		}
		// 사용자에게 삭제할 곡의 이름을 직접 받고 MusicController에 removeMusic으로
		// 값을 넘긴다. removeMusic()의 반환 값에 따라 반환 값이 없으면 “ 삭제할 곡이 없습니다.”
		// 반환 값이 있으면 “000(곡 명, 가수 명)을 삭제 했습니다” 콘솔 창에 출력

	}
	
	public void setMusic() {
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String searchname = sc.next();
		
		System.out.print("수정할 곡 명 : ");
		String title = sc.next();
		System.out.print("수정할 가수 명 : ");
		String siger = sc.next();
		Music m = mc.setMusic(searchname, new Music(title, siger));
		if(m == null) {
			System.out.println("수정할 곡이 없습니다.");
		} else {
			System.out.println(m.toString() + "의 값이 변경 되었습니다.");
		}
		
		// 사용자에게 수정할 곡을 입력 하여 MusicController에 setMusic으로 검색 할 수 있게
		// 값을 넘기며 수정할 곡 명과 가수 명을 받아 setMusic으로 값을 넘긴다.
		// 검색 결과 값이 없으면 “수정할 곡이 없습니다.”, 검색 결과 값이 있고
		// 수정 했으면 “000(곡 명, 가수 명)의 값이 변경 되었습니다.” 콘솔 창에 출력
	}
	
	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		int res = mc.ascTitle();
		if(res == 1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
		// MusicController에 ascTitle()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패
	}
	
	public void descSinger() {
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		int res = mc.descSinger();
		if(res == 1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
		// musicController에 descSinger()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패” 
	}
}