package quizs;
import java.util.Scanner;
public class test {
   public static void main(String [] args) {
	   /*Quiz a=new Quiz();
	   a.result.add(new Scores(10,9));
	   a.result.add(new Scores("Bio",100,80));
	   System.out.println( Scores.getName(a.result.get(0)));*/
Scanner input=new Scanner(System.in);
int choice = 0;
boolean run=true;
CustomQuestion cquiz = null;
QuestionFolder bio = null;
Quiz demo=new Quiz();
//Opening interface
System.out.println("\tMenu\n\t"
		+ "1.Create a default flashcard"
		+ "\n\t2.Create a custom flash card\n\t3.Quiz");
choice=input.nextInt();
while(run) {
switch(choice) {
case 1:
	bio=new QuestionFolder();
	System.out.println("Default question created");
	choice=input.nextInt();
	break;
case 2:
	cquiz=new CustomQuestion();
	cquiz.addQuestions();
	System.out.println("Custom question created");
	choice=input.nextInt();
	break;
case 3:
	System.out.println("Enter the number of questions");
	int questionsCount=input.nextInt();
	System.out.println("1.Take custom quiz\n2.Take the default quiz");
	int choice3=input.nextInt();
	if(choice3==1) {
		demo.setQuestions(cquiz.getQuestions(), cquiz.getAnswers());		
	}else if(choice3==2)demo.setQuestions(bio.getQuestions(), bio.getAnswers());
	demo.quiz(questionsCount);
	System.out.println("Quiz ended");
	choice=input.nextInt();
	break;
case 4:
	run=false;
	break;
}
}
  }
}
