package algorithm;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		StuSearch st1 = new StuSearch("Elena","1682");
		StuSearch st2 = new StuSearch("Lydia", "1772");
		StuSearch st3 = new StuSearch("Sandra", "1813");
		
		ArrayList <StuSearch>list = new ArrayList<StuSearch>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(StuSearch stu:list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		while(true) {
			System.out.println("if you want to continue,then press y, or press n");
			String input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("Start the search");
				String name = scan.next();
				boolean flag= false;
				
				for(StuSearch stu:list) {
					if(stu.getName().equals(name)) {
						System.out.println("The student's number: "+stu.getNo());
						flag = true;
					}
				}
				
				if(!flag) {
					System.out.println("The student doesn't exist in the list");
				}
				
			} else if(input.equals("n")) {
				break;
			}
		}
		
		System.out.println("End the Search");
	}
	


}
