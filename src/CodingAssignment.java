
import java.util.*;

public class CodingAssignment {
	public static int noOfPossibleWays(int stairs)
	{
		int[] steps = new int[stairs + 1];
		
		if(stairs == 0 || stairs == 1) return 1;
		else if(stairs == 2) return 2;
		else {
			steps[0] = 1;
			steps[1] = 1;
			steps[2] = 2;			
			
			for (int i = 3; i <= stairs; i++)
				steps[i] = steps[i - 1] + steps[i - 2]+ steps[i - 3];

		}

		return steps[stairs];
	}

	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);		
        System.out.println("Enter the no.of stairs:");
		
        int stairs = sc.nextInt();
		
		System.out.println(noOfPossibleWays(stairs));
		
		sc.close();
	}
}
