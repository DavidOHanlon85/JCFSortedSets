/**
 * 
 */
package slideDeckChallenges;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 */
public class Example10SortedSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SortedSet<String> set = new TreeSet<String>();
		
		set.add("Zidane");
		set.add("Messi");
		set.add("Pele");
		set.add("O'Hanlon");
		set.clear();
		
		for (String name : set) {
			System.out.println(name);
		}
		
		//System.out.println("First : "+set.first());
		//System.out.println("Last : "+set.last());
		
		//set.remove("Messi");
		
		for (String name : set) {
			System.out.println(name);
		}
		
		
		
	}

}
