import java.io.File;
import java.util.ArrayList;

public class SyncThread implements Runnable{

	
	public String MasterIP;
	public int MasterPort;
	public Follower follower;
	public ArrayList<File> oldFiles, currentFiles;
	public ArrayList<SyncPair<Integer, File>> syncFiles;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
	}

	
	public SyncThread(String MasterIP, int MasterPort) {
		this.MasterIP = MasterIP;
		this.MasterPort = MasterPort;
		follower = Main.follower;
	}
	
	public void Start() {
		System.out.println("Sync Thread has been started.");
	}
	
	
	
}
