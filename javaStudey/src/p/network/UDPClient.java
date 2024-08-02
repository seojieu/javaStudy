package p.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.rmi.UnknownHostException;
import java.util.Scanner;

public class UDPClient {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보낼메세지 : ");
		String msg = sc.nextLine();
		
		InetAddress inet;
		int port = 4000;
		
		try(DatagramSocket dsoc = new DatagramSocket();){
			inet = InetAddress.getByName("192.168.30.28");
		
		
		DatagramPacket dp = new DatagramPacket(msg.getBytes().length,inet,port)
		dsoc.send(dp);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
