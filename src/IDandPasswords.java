import java.util.HashMap;

public class IDandPasswords {
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	IDandPasswords() {
		loginInfo.put("Michael", "test123");
		loginInfo.put("Dwight", "test123");
		loginInfo.put("Jim", "test123");
	}
	
	protected HashMap getLoginInfo() {
		return loginInfo;
	}
}
