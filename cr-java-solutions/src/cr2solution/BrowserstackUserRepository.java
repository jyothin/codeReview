/*
 * Lists
 * Anti-Pattern: Frequent Reordering
 * Lists are great if you want to stick to their default order, but if as a reviewer you see code that’s re-sorting the 
 * list, question whether a list is the correct choice. In the code above, the browserstackUsers list is always 
 * re-sorted before being returned. Once again, Java 8 makes this operation look so easy it might be tempting to 
 * ignore the signs.
 * 
 * In this case, given that a BrowserstackUser is unique and it looks like you want a collection that’s sorted by 
 * default, you probably want something like a TreeSet.
 */
package cr2solution;

//import java.util.ArrayList;
import static java.util.Comparator.comparing;
//import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BrowserstackUserRepository {
	
	//private final List<BrowserstackUser> browserstackUsers = new ArrayList<>();
	private final Set<BrowserstackUser> browserstackUsers = 
			new TreeSet<>(comparing(BrowserstackUser::getBrowserstackHandle));
	
	public void addBrowserstackUser(BrowserstackUser browserstackUser) {
		browserstackUsers.add(browserstackUser);
	}
	
	/*public List<BrowserstackUser> getBrowserstackUsers() {
		//browserstackUsers.stream().sorted(comparing(BrowserstackUser::getBrowserstackHandle));
		return browserstackUsers;
	}*/
	
	public Set<BrowserstackUser> getBrowserstackUsers() {
		return browserstackUsers;
	}

}
