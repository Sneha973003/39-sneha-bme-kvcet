
public class Main {

	public static void main(String[] args) {
		int n=10,firstterm=0,secondterm=1;
		System.out.println("Fibronacci series till"+n+"Term:");
		for(int i=1;i<n;++i);
		{
			System.out.println(firstterm+",");
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
		}

	}

}
