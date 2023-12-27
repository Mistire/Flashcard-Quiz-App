package quizs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;
public class Quiz {
	Scanner scanner = new Scanner(System.in);
ArrayList<Scores> result=new ArrayList();
private ArrayList<String> questions=new ArrayList();
private ArrayList<String> answer=new ArrayList();
ArrayList<Integer> qList=new ArrayList();
private String flip(int index){
	return answer.get(index);
}
void setQuestions(ArrayList<String> questions,ArrayList<String> answers) {
	this.questions=questions;
	this.answer=answers;
}
//generates an array of random numbers for a quiz with a 
//parameter for the upperbound of the random numbers being generated
private int[] generateQs(int limit) {
	Random nums=new Random();
	HashSet<Integer> uniqueNums=new HashSet<>();
	while(uniqueNums.size()<limit) {
		int odd=nums.nextInt(questions.size());
		//if(odd%2==0)odd--;
		odd=abs(odd);
		uniqueNums.add(odd);
	}
	int[] arr = new int[limit];
    int i = 0;
    for(Integer num : uniqueNums) {
        arr[i++] = num;
    }
    return arr;
}
//
void quiz(int question) {
	
	int[] questionCatalogue=generateQs(question);
	int correctAnswers=0;
	for(int i:questionCatalogue) {
		System.out.println(questions.get(i));

		System.out.print("Your answer: ");
		String userAnswer = scanner.nextLine();

		// Check user's answer
		String correctAnswer = answer.get(i);
		boolean isCorrect = check1(userAnswer, correctAnswer);

		// Display whether the answer is correct
		if(isCorrect) {
			System.out.println("Correct!");
		correctAnswers++;	
		}
		else System.out.println("Incorrect!\n The answer is: "+flip(i));
	}
	//needs to store the answers and check if they are right
	//need to store the final result on the result ArrayList
	result.add(new Scores(question,correctAnswers));
	displayResults();

}

void displayResults() {
	System.out.println("\nResults:");

for (Scores score : result) {
		System.out.println("Question: " + Scores.getQuestions(score));
		//System.out.println("Your Answer: " + score.getUserAnswer());
		System.out.println("Correct Answers: " + Scores.getScore(score));
		System.out.println("Result: " +Scores.getScore(score)+"/"+ Scores.getQuestions(score));
		System.out.println("--------------------");
	}

}
void showQuestions() {
	int i=0;
	while(i<questions.size()) {
		System.out.println(questions.get(i));
		i=i+2;
	}
	//this needs Scanner
}

//simple check
    boolean check1(String str1, String str2) {
        return str1.equals(str2);
    }
//Character check
   float check2(String str1, String str2) {
        HashSet<Character> set1 = new HashSet<>();
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }

        HashSet<Character> set2 = new HashSet<>();
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }

        HashSet<Character> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        HashSet<Character> union = new HashSet<>(set1);
        union.addAll(set2);
//Jaccard Similarity coefficient
        return (float) intersection.size()*100 / union.size();
    }
 //Sequance check it goes character for character and checks 
 //if they match returns the ratio of th sequaential matchs and the total elements
   float check3(String str1,String str2) {
	   int check=0,totalChecks;
	   int size;
	   if(str1.length()<=str2.length()) {
		   totalChecks=str2.length();
		   size=str1.length();
		   }
	   else {
		   size=str2.length();
	   totalChecks=str1.length();
	   }
	   for(int i=0;i<size;i++) {
		   if(str1.charAt(i)==str2.charAt(i))check++;
	   }
	  return (float)check/totalChecks;
   }
}
