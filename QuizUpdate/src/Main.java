import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Quiz {
    
    void print(String message){
        System.out.println(message);
    }


    public void play(){

        Questions q1= new Questions("\nWhat is a correct syntax to output \"Hello World\" in Java?",
                "1: print (\"Hello World\")","2: System.out.println(\"Hello World\");",
                "3: Console.WriteLine(\"Hello World\");","4: echo(\"Hello World\");");

        Questions q2 = new Questions("\nWhich data type is used to create a variable that should store text?",
                "1: myString", "2: string", "3: Txt", "4: String");

        Questions q3 = new Questions("\nHow do you create a variable with the floating number 2.8?",
                "1: float x = 2.8f;","2: byte x = 2.8f","3: x = 2.8f;","4: int x = 2.8f;");

        Questions q4= new Questions("\nHow do you call a method in Java?",
                "1: methodName;","2: methodName[];","3: methodName();","4: (methodName);");

        Questions q5= new Questions("\nHow do you start writing a while loop in Java?",
                "1: while (x > y)","2: x > y while {", "3: while x > y {","4: while x > y:");


        // Hash map to store questions and choices:stored as a integer 1,2,3,4
        Map<Questions, Integer> questionToCorrectAns = new HashMap<>();
        questionToCorrectAns.put(q1,2);
        questionToCorrectAns.put(q2,4);
        questionToCorrectAns.put(q3,1);
        questionToCorrectAns.put(q4,3);
        questionToCorrectAns.put(q5,1);

        Scanner sc = new Scanner(System.in);
        
        int correctCount = 0;

        //iterate the map to print out question and choice out for all 5 questions in the map
        for(Map.Entry<Questions,Integer> questionAndAns: questionToCorrectAns.entrySet()){
            print(questionAndAns.getKey().getQuestion());
            print(questionAndAns.getKey().getChoice1());
            print(questionAndAns.getKey().getChoice2());
            print(questionAndAns.getKey().getChoice3());
            print(questionAndAns.getKey().getChoice4());
            print("Select an option: ");

            Integer answer = sc.nextInt();

            //checking user input integer answer against correct answer from hashmap
            if(answer == questionAndAns.getValue()){
                print("Correct Answer");
                correctCount++;
            } else {
                print("Wrong Answer");
            }

        }
        print("Score percentage: "+(100*correctCount)/questionToCorrectAns.size()+"%");

    }
}

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.play();
    }
}
