package cr2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserRespository {
	
	public class BrowserstackUserRepository {
		private final List<User> browserstackUsers = new ArrayList<>();
		
		public void addBrowserstackUser(User browserstackUser) {
			browserstackUsers.add(browserstackUser);
		}
		
		public List<User> getBrowserstackUsers() {
			Collections.sort(browserstackUsers, new Comparator<User>() {
				
				@Override
				public int compare(User bs1, User bs2) {
					return bs1.getBrowserstackHandle().compareTo(bs2.getBrowserstackHandle());
				}
				
			});
			return browserstackUsers;
		}
	}


}
