package CollectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Orange");
		System.out.println(colors);
		//4
		
		colors.addFirst("First");
		colors.addLast("Last");
		System.out.println(colors);
		colors.removeFirst();
		System.out.println(colors);
		System.out.println(colors.get(1));
		colors.remove(1);
		System.out.println(colors);
		System.out.println(colors.get(1));
	}
}
