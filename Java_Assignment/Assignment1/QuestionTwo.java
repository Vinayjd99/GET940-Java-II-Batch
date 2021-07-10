import java.util.Scanner;

class Stats {
	
	public void stats(int arr[]) {
		
		int totalRuns = 0;
		//calculate the total runs scored
		for(int i=0; i<arr.length; i++)
			totalRuns += arr[i];
		
		// calculate the no. of 0s, 1s, 2s, 3s, 4s and 6s
		int arr2[] = {0,0,0,0,0,0,0};
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			temp = arr[i];
			switch(temp) {
			case 0:
				arr2[0]++;
				break;
			case 1:
				arr2[1]++;
				break;
			case 2:
				arr2[2]++;
				break;
			case 3:
				arr2[3]++;
				break;
			case 4:
				arr2[4]++;
				break;
			case 5:
				arr2[5]++;
				break;
			case 6:
				arr2[6]++;
				break;
			}
	}

		//calculate Strike Rate
		float strikeRate = 0f;
		strikeRate = (totalRuns / 30 ) * 100;
		
		
		//print the final output
		System.out.println("Sum : " + totalRuns);
		for(int i = 0; i < arr2.length ; i++) {
			System.out.println("no. of " + i + "s : " + arr2[i]);
		}
		System.out.println("Strike rate : " + strikeRate);
	}
}


public class QuestionTwo {
	public static void main(String args[]) {
		int temp = 0;
		int i = 0;
		int arr[] = new int[30];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Runs : ");
		while(i<30) {
			 temp = sc.nextInt();
			 //if condition to check runs generated per ball is 1 to 6
			 if (temp >=1 && temp <=6)
				 arr[i++] = temp;
			 else
				 System.out.println("Runs generated should be between 1 to 6");
			}
					
		sc.close();
		Stats s = new Stats();
		s.stats(arr);		
		
	}
}
