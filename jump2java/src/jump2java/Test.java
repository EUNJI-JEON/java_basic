package jump2java;

public class Test {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		
		System.out.println(sb.toString());
		
		String temp="";
		temp += "hello";
		temp += " ";
		temp += "jump to java";
		System.out.println(temp);
		
		StringBuffer st = new StringBuffer();
		st.append("jump to java");
		st.insert(0, "hello ");
		System.out.println(st.toString());
	}

}
