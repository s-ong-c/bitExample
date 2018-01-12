package network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.rmi.ConnectException;

public class TcpIpClient {
	public static void main(String[] args) {
		try {
			String serverIP ="192.168.3.32";
			System.out.println("서버에 연결중입니다. 서버IP:"+serverIP);
			
			Socket socket = new Socket(serverIP, 7777);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis =new DataInputStream(in);
			
			System.out.println(dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			dis.close();
			socket.close();
			System.out.println("asdsad");
			System.out.println("연결을 종료합니다.");
		
		
		} catch (ConnectException ce) {
			ce.printStackTrace();
		}
		catch (IOException ie) {
			ie.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
