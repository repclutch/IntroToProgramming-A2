import java.util.Scanner;

public class Exercise5_8 {

	public static void main (String [] args ){
		
		Scanner input = new Scanner (System.in);
		
		int numberOfStudents;
		String studentName;
		int count = 0;
		int score;
		int highestScore = 0;
		String highestScoreName = " ";
		
		
		System.out.println("Enter the number of students: ");
		numberOfStudents = input.nextInt();
		
		System.out.println();
		
		while (count < numberOfStudents) {
			System.out.println("Enter Student #" + (count + 1) + " name: ");
			studentName = input.next();
			
			System.out.println("Enter Student #" + (count + 1) + " grade: ");
			score = input.nextInt();
			
			if (score > highestScore) {
				highestScore = score;
				highestScoreName = studentName;
				
			}
			System.out.println();
			count++;

		}
		
		System.out.println("Student with the highest score is: " + highestScoreName + ", with a score of " + highestScore);
		
	}
}
