import java.io.File;
import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Follower {

	public static final String DESKTOP_PATH = System.getProperty("user.home") + "/Desktop";
	
	public String IP;
	private Follower follower;
	public boolean inited = false;
	
	
	public boolean Init() {
		
		try {
			//Machine's IP
			IP = Inet4Address.getLocalHost().getHostAddress();
		
			
			//Creating Directory on desktop
			makeDir("TDrive", DESKTOP_PATH);
			
			//First Sync
			firstSync();
			
			//First init called
			inited = true;
			
			return true;
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	
	
	
	public Follower() {
		
		Init();
	}
	
	public boolean makeDir(String folderName, String path) {
		
		File dir = new File(path);
		dir.mkdir();
		
		return true;
	}
	
	public boolean firstSync() {
		
		
		return false;
	}
	
}
