package jump2java;

import java.util.HashMap;

public class TestMap {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people","john");
		map.put("sport","baseball");
		
		System.out.println(map.get("people"));
		System.out.println(map.containsKey("people"));
		System.out.println(map.remove("people"));
		System.out.println(map.size());
		
	}
}
