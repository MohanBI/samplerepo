import java.util.Random;
public class RandomData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random  r=new Random();
		int a=887052;
		for (int i = 0;i<200;i++)
		{
		System.out.println(r.nextInt(a));
		}
		System.out.println();
	}

}
