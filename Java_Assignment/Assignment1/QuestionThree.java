class Match {
	int totalRuns = 0;
	float strikeRate = 0.0f;
	int arr[] = new int[30];
	int arr2[] = {0,0,0,0,0,0,0};
	
	
	Match() {
		
		//Generate score
		for(int i =0;i<arr.length;i++) {
			this.arr[i] = (int)(Math.random()*6) + 1;
		}
		
		//calculate the total runs scored
		for(int i=0; i<arr.length; i++)
			totalRuns += arr[i];
		//avg = (totalRuns / 30.0f);
		// calculate the no. of 0s, 1s, 2s, 3s, 4s and 6s
		
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
		
		strikeRate = (totalRuns / 30 ) * 100;	
		
	}
}

class Output{
	
	
}

public class QuestionThree {
	public static void main(String args[]) {

		Match m1 = new Match();
		Match m2 = new Match();
		Match m3 = new Match();
		Match m4 = new Match();
		Match m5 = new Match();
		
		
		float avgScore = (m1.totalRuns+m2.totalRuns+m3.totalRuns+m4.totalRuns+m5.totalRuns) / 5;

		//total no. of 0s, 1s, 2s, 3s, 4s and 6s 
		int arr3[] = new int[7];
		for (int i = 0; i<arr3.length; i++) {
			arr3[i] = m1.arr2[i] + m2.arr2[i] + m3.arr2[i] + m4.arr2[i] + m5.arr2[i];
		}
		
		float avgStrikeRate = (m1.strikeRate + m2.strikeRate + m3.strikeRate + m4.strikeRate + m5.strikeRate ) / 5;
		//print the final output
				System.out.println("Average score : " + avgScore);
				for(int i = 0; i < 6 ; i++) {
					System.out.println("no. of " + i + "s : " + arr3[i]);
				}
				System.out.println("Strike rate : " + avgStrikeRate);
		
	}
}
