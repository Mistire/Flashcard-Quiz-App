package quizs;
import java.util.ArrayList;

public class Scores {
String quizName;
private int numberOfQuestions;
private int score;
private static int testNum;
private int num;
Scores(String name,int questions,int score){
	quizName=name;
	numberOfQuestions=questions;
	this.score=score;
	num=testNum++;
}
Scores(int questions,int score){
	testNum++;
	num=testNum;
	quizName="Quiz "+num;
	numberOfQuestions=questions;
	this.score=score;

	
}

static String getName(Scores s) {
	return s.quizName;//+" "+s.num;
}
static int getScore(Scores s) {
	//System.out.println(s.score+"/"+s.numberOfQuestions);
	return s.score;
}
static int getQuestions(Scores s) {
	return s.numberOfQuestions;
}

}
