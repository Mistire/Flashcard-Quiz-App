package quizs;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionFolder {
	   
	  protected  ArrayList<String> qList=new ArrayList();
	   protected ArrayList<String> aList=new ArrayList();
	   public QuestionFolder() {
		   qList.addAll(Arrays.asList("The powerhouse of the cell is called...",
		            "The molecule that carries genetic instructions in all living things is known as...",
		            "The basic unit of life is a...",
		            "The building blocks of proteins are...",
		            "The process by which plants make food using sunlight is called...",
		            "The process by which cells divide is known as...",
		            "The largest organ in the human body is the...",
		            "Cells that carry oxygen to the body's tissues are known as...",
		            "The process of converting food into energy is called...",
		            "The main component of the central nervous system is the...",
		            "The organelle that produces energy in a cell is the...",
		            "Organelles that synthesize proteins in a cell are called...",
		            "The organelle that controls cell activities is the...",
		            "The structure that controls the movement of substances in and out of a cell is the...",
		            "The component of the cell that contains all organelles and is the site for most cellular processes is the..."
		        ));
		   aList.addAll(Arrays.asList("Mitochondria",
		            "Deoxyribonucleic Acid",
		            "Cell",
		            "Amino Acids",
		            "Photosynthesis",
		            "Mitosis",
		            "Skin",
		            "Red Blood Cells",
		            "Metabolism",
		            "Brain",
		            "Mitochondria",
		            "Ribosomes",
		            "Nucleus",
		            "Cell Membrane",
		            "Cytoplasm")); 
	   }
	   public QuestionFolder(String[] questions,String[] answers) {
		   qList.addAll(Arrays.asList(questions));
		   aList.addAll(Arrays.asList(answers));
	   }
	   public ArrayList<String> getQuestions(){
		   return qList;
	   }
	   public ArrayList<String> getAnswers(){
		   return aList;
	   }
	   public void display() {
		   int i=0;
		   for(String Q:qList) {
			   System.out.println(Q+"\n"+aList.get(i));
			   i++;
		   }
	   }
}
