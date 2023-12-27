package quizs;
import java.util.Scanner;
public class CustomQuestion extends QuestionFolder {
public CustomQuestion() {
	qList.clear();
	aList.clear();
}
public void addQuestions() {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number of questions you wish to add");
	int numOfQ=input.nextInt();
	input.nextLine();
	String question,answer;
	while(numOfQ>0) {
		System.out.println("Add the question: ");
		question=input.nextLine();
		
		System.out.println("Add the answer: ");
		answer=input.nextLine();
		
		numOfQ--;
		aList.add(answer);
		qList.add(question);
	}
	input.close();
}

}
