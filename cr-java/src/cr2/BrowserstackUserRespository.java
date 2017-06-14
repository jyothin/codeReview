package cr2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BrowserstackUserRespository {
	
	public class BrowserstackUserRepository {
		private final List<BrowserstackUser> browserstackUsers = new ArrayList<>();
		
		public void addBrowserstackUser(BrowserstackUser browserstackUser) {
			browserstackUsers.add(browserstackUser);
		}
		
		public List<BrowserstackUser> getBrowserstackUsers() {
			Collections.sort(browserstackUsers, new Comparator<BrowserstackUser>() {
				
				@Override
				public int compare(BrowserstackUser bs1, BrowserstackUser bs2) {
					return bs1.getBrowserstackHandle().compareTo(bs2.getBrowserstackHandle());
				}
				
			});
			return browserstackUsers;
		}
	}


}
