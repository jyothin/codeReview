/*
 * This class is used to track which websites a user has visited. The method getLastVisited
 * returns the last visited website.
 */

package cr4;

import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Set;

public class BrowserstackUser {
	private Set<URI> visitedURIs = new LinkedHashSet<>();
	
	public URI getLastVisited() {
		URI desired = null;
		for(URI visitedURI : visitedURIs) {
			desired = visitedURI;
		}
		return desired;
	}
}
