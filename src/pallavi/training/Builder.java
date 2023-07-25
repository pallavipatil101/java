package pallavi.training;

public class Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		
		System.out.println(sb.insert(1, "o"));
		System.out.println(sb.charAt(3));
		sb.setCharAt(3, 'm');
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
	}

}
