
public class SyncThread implements Runnable{

	
	public String MasterIP;
	public int MasterPort;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
	public SyncThread(String MasterIP, int MasterPort) {
		this.MasterIP = MasterIP;
		this.MasterPort = MasterPort;
	}
	
	public void Start() {
		System.out.println("Sync Thread has been started.");
	}
	
}
