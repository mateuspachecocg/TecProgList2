package solutions;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(100, 2);
	}
	public static void solution (int n, int m) {
		int i = 0;
		
		System.out.print("{");
		
		for (i = 0;i < n; i += m) {
			System.out.printf("%d,", i);
		}
		
		System.out.printf("%d}", i);
	}

}
