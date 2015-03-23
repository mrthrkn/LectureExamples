import java.io.*;
import java.net.*;


public class UcClient
{
	public static void main(String[] args) throws IOException {

		Socket socket = null;
		PrintWriter out = null; // Character output , mesaj gondermek icin
		BufferedReader in = null; // Character Input
		String host = "localhost";
		int port=8080;
		try {
			socket = new Socket(host, port); // "localhost" ya da sunucu IP adresi
			// input stream  olusuyor
						
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (UnknownHostException e) {
			System.err.println("Sunucu bulunamadi");
			System.exit(1);
		} 
		System.out.println("Sunucuya baglanildi. zaman alınıyor...\n"+in.readLine());
		in.close();
		socket.close();
	}

}
