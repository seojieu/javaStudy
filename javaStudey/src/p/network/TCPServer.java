package p.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	public static void main(String[] args) {
		/*
		  	TCP
		  	- 서버,클라이언트간에 1: 1 소캣통신
		  	-데이터를 교환하기에 앞서 서버,클라이언트 연결이 되어야한다.(서버가 먼저 실행되어 클라이언트 요청을 기다린다.)
		  	-신뢰성 있는 데이터 전달 가능
		  	
		  	socket
		  	-프로세스간의 통신을 담당
		  	-input/outStream을 가지고 있다 (해당 스트림을 이용해서 입출력이 가능하다)
		  	
		  	ServerSockdt
		  	- 포트
		 */
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		int port = 3000;
		try {
		ServerSocket server = new ServerSocket(port);
		
		System.out.println("클라이언트 요청을 기다리고 있습니다");
		
		Socket socket = server.accept();
		System.out.println(socket.getInetAddress().getHostAddress() +"가 연결을 요청함 . . .");
		
		//4) 클라이언트와 입출력 기반 스트림 생성(바이트스트림밖에 안됨
		//5) 보조스트림을 활용해서 성능개선
		
		//입력용 스트림
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//BufferedReader : 데이터 입력시 nextLine메소드 이용가능
		
		pw = new PrintWriter(socket.getOutputStream());
		
		//PrintWriter : 데이터출력시 print(), println() 메소드를 가지고 있는 보조 스트림
		while(true) {
		String message = br.readLine();
		System.out.println("클라이언트로부터 전달받은 메세지 : " + message);
		
		System.out.println("클라이언트에게 보낼 내용: ");
		String sendMessage = sc.nextLine();
		
		pw.println(sendMessage);
		pw.flush();
		
		}
		}	catch(IOException e) {
		e.printStackTrace();
	}finally {
		
		try {
			pw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
}
