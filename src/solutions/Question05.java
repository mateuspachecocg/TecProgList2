package solutions;
import solutions.Question04;
public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(100, 3);
	}
	
	public static void solution (int n, int m) {
		int i = 0;
		
		System.out.print("{");
		int k = n%m;
		for (i = 0;i < n-k ; i += m) {
			System.out.printf("%d,", i);
		}
		
		System.out.printf("%d}", i);
	}

}
