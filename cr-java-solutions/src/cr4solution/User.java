/* Sets
 * Anti-pattern: Sometimes you really do want duplicates
 * There are a number of signs in this code that this is wrong though. Firstly, the author has 
 * had to do a costly full iteration of the whole set to reach the last element (lines 13-15) – 
 * sets are not designed for accessing elements by position, something that lists are perfect 
 * for. Secondly, because sets do not contain duplicate values, if the last page they visited 
 * had been visited previously, it will not be in the last position in the set. Instead, it will 
 * be where it was first added to the set.
 */

package cr4solution;

import java.net.URI;
import java.util.Stack;

public class User {
	private Stack<URI> visitedURIs = new Stack<URI>();
	
	public URI getLastVisited() {
		return visitedURIs.pop();
	}
}

