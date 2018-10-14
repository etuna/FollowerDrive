import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MasterConnection {

	//Default Values
	public static final String DEFAULT_SERVER_ADDRESS = "localhost";
	public static final int DEFAULT_SERVER_PORT = 9999;
	
	//Variables
	private String masterAddress;
	private int masterPort;
	private Socket socket;
	private BufferedReader br; //Input Stream
	private PrintWriter pw; //Output Stream
	
	
	
	public MasterConnection(String address, int port) {
		masterAddress= address;
		masterPort = port;
	}
	
	
	public boolean Connect() {
		
		try {
			socket = new Socket(masterAddress, masterPort);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			System.out.println("Connection Successful, address:"+masterAddress+", port :"+masterPort);
			return true;
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean Disconnect() {
		
		try {
			br.close();
			pw.close();
			socket.close();
			System.out.println("Connection Closed. Address: "+masterAddress+", port:"+masterPort);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	
}
