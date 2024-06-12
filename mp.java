import java.io.*;
import java.util.*;
import java.lang.*;

class global
{
	public static  int guess=0;
	public static int total=0;
}
class question extends global
{

	private String question_text;
	private String answer_1;
	private String answer_2;
	private String answer_3;
	private String answer_4;
	private int correct_answer;
	private int question_score;
Scanner s = new Scanner(System.in);
	//settter function
	public void setvalues(String q,String a1,String a2,String a3,String a4,int ca,int pa)
	{
       question_text = q;
       answer_1 = a1;
       answer_2 = a2;
       answer_3 = a3;
       answer_4 = a4;
       correct_answer = ca;
       question_score = pa;
	}
	//function to ask questions
	public void ask_question()
	{
		//print questions
		System.out.println(question_text);
		System.out.println("1. "+answer_1);
		System.out.println("2. "+answer_2);
		System.out.println("3. "+answer_3);
		System.out.println("4. "+answer_4);

		//display the answer
		System.out.println("What is your answer?(in number)");
		guess = s.nextInt();

		//if the answer is correct
		if (guess==correct_answer)
		{
			System.out.println("Correct!!");

			//update the correct score
			total = total + question_score;
			System.out.println("Score = "+question_score+" Out of "+question_score+"!!!");
		}
		else
		{
			System.out.println("Wrong!!!");
			System.out.println("Score = 0 Out of "+question_score+"!!!");
			System.out.println("Correct answer is option "+correct_answer+".");
		}

	}
}
class java_mp
{
	public static void main(String args[])
	{
	
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		//input details
		System.out.println("THE DAILY QUIZ");
  		System.out.println("What is your name?");
		name = sc.nextLine();
		System.out.println("How old are you?");
		age = sc.nextInt();
		System.out.println("Good luck for the quiz!!");
		//objects of question class
		question obj = new question();
		question q1 = new question();
		question q2 = new question();
		question q3 = new question();
		question q4 = new question();
		question q5 = new question();
		question q6 = new question();
		question q7 = new question();
		question q8 = new question();
		question q9 = new question();
		question q10 = new question();
		//correct answer is 3 in all the questions
		//each question carries 10 marks;
		System.out.println("There are 10 questions.");
		q1.setvalues("Q1] MS-Word is an example of ___ ","An operating system","A processing device"," Application software","An input device",3,10);
		q2.setvalues("Q2] Ctrl, Shift and Alt are called .......... keys. "," modifier"," function","alphanumeric"," adjustment",1,10);
		q3.setvalues("Q3] A computer cannot boot if it does not have the ___ "," Compiler	"," Loader"," Operating system","Assembler",3,10);
		q4.setvalues("Q4] ___ is the process of dividing the disk into tracks and sectors ","Tracking	","Formatting","Crashing","Allotting",2,10);
		q5.setvalues("Q5] Junk e-mail is also called __ ","Spam"," Spoof","Sniffer script"," Spool",1,10);
		q6.setvalues("Q6] .Microsoft Office is an example of a ","Closed source software","Open source software"," Horizontal market software"," vertical market software",3,10);
		q7.setvalues("Q7] __are attempts by individuals to obtain confidential information from you by falsifying their identity "," Phishing trips","Computer viruses"," Phishing scams"," Spyware scams",3,10);
		q8.setvalues("Q8]  default, your documents print in ____ mode "," Landscape	"," Portrait","Page Setup	","Print View",2,10);
		q9.setvalues("Q9] Storage capacity of magnetic disk depends on "," disk pack in disk surface"," tracks per inch of surface","bits per inch of tracks","All of the above",4,10);
		q10.setvalues("Q10] A ___ is a software program used to view Web pages. ","site","host"," link"," browser",4,10);
		q1.ask_question();
		q2.ask_question();
		q3.ask_question();
		q4.ask_question();
		q5.ask_question();
		q6.ask_question();
		q7.ask_question();
		q8.ask_question();
		q9.ask_question();
		q10.ask_question();

		//display total score
		System.out.println("Total Score = "+obj.total+" out of 100");
		//display results

		//if the player pass the quiz
		if (obj.total>=70)
		{
			System.out.println("congrats you passed the quiz!!");
		}
		else
		{
			System.out.println("Alas! You failed the quiz.");
			System.out.println("Better luck next time.");
		}

	}


}