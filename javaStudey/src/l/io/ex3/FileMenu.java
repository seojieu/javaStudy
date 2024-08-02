package l.io.ex3;

import java.io.File;
import java.util.Scanner;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");// ➔ fileSave()
			System.out.println("2. 노트 열기");// ➔ fileOpen()
			System.out.println("3. 노트 열어서 수정하기");// ➔ fileEdit()
			System.out.println("9. 끝내기"); // ➔ “프로그램을 종료합니다.” 출력 후 종료
			System.out.print("메뉴 번호 :");
			int num = sc.nextInt();
			// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
			switch (num) {
			case 1:
				this.fileSave();
				break;
			case 2:
				this.fileOpen();
				break;
			case 3:
				this.fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder(); // StringBuilder 문자열을 다루는 객체(String

		System.out.println("파일에 저장할 내용을 입력하세요.");
		System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
		System.out.println("내용 : ");
		String str = sc.nextLine();

		if (str.equals("ex끝it")) {
			//파일명이 존재하면서 덮어쓰기를 하지 않겠다고 할때 계속반복
			while (true) {
				System.out.println("저장할 파일 명을 입력해주세요(ex. myFile.txt) :");
				String fileName = sc.next();
				File f = new File(fileName);
				
				//파일명이 존재할 때
				if (f.exists()) {
					System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n) : ");
					char isPass = sc.next().charAt(0);
					//덮어쓰겠다고 할 때
					if (isPass == 'y') {
						fc.fileSave(fileName, sb);
						return;
					}
				} else {	//파일명이 
					fc.fileSave(fileName, sb);
					return;
				}
			}
		}
		sb.append(str);

	}
		// “ex끝it”를 입력할 때까지 사용자가 입력하게 하고 그 값들을 StringBuilder에 저장

		

		// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면
		// “이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)”가 출력됨
		// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 StringBuilder 넘김
		// n를 입력하면 “저장할 파일 명을 입력해주세요 ~”가 다시 나오게끔 반복
		// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
		// 파일 명과 내용을 fc에 fileSave 메소드로 넘김
	
	
	public void fileOpen() {
		System.out.println("열 파일 명 : ");
		String file = sc.nextLine();
		if(fc.checkName(file)) {
			StringBuilder sb = fc.fileOpen(file);
			System.out.println(sb.);
		} else 
	}
	
	public void fileEdit() {
		
	}
}
