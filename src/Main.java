
public class Main {

	//Default Values
	public static final String DEFAULT_MASTER_IP = "localhost";
	public static final int DEFAULT_MASTER_PORT = 9999;
	
	//Variables
	public Follower follower;
	public static String MasterIP;
	public static int MasterPort;
	static SyncThread syncThread;
	static UploadThread uploadThread;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		syncThread = new SyncThread(MasterIP, MasterPort);
		syncThread.run();

	}
	
	
	public boolean Init() {
		
		follower = Follower.getInstance();
		setupMaster(DEFAULT_MASTER_IP, DEFAULT_MASTER_PORT);
		return false;
	}
	
	public void setupMaster(String address, int port) {
		MasterIP = address;
		MasterPort = port;
	}
	
	
	
	

}
