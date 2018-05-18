import java.util.*;

public class WordsInAlphabeticalOrder {
	
	public static void main(String[] args) {
		String[] str = new String[] {"said", "robley", "gadiid", "geele"};
		getAlphaticalOrder(str);
		String[] str1 = new String[] {"a", "b", "C"};
		String[] str2 = new String[] {"C", "a", "d", "f"};
		testHashSet(str1, str2);
		
	}
	
	// get the words
	public static Set getAlphaticalOrder(String[] words) {
	//	ArrayList<String> arrayList = new ArrayList<>();
		Set<String> treeSet = new TreeSet<>();
		for(String word: words) {
			treeSet.add(word);
		}
	//	Collections.sort(arrayList);
		System.out.println(treeSet);
		return treeSet;
	}
	
	public static void testHashSet(String[] str, String[] str2) {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		for(String st: str) {
			set1.add(st);
		}
		for(String st: str2) {
			set2.add(st);
		}
		set1.removeAll(set2);
		System.out.println(set1);
	}
	
}
