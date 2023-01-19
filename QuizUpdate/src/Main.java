import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class startTest{
    //prints with a new line
    void print(String message){
        System.out.println(message);
    }


    public void testMethod(){

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


        //Hash map to store questions and choices:stored as a integer 1,2,3,4
        Map<Questions,Integer> hmap=new HashMap<>();
        hmap.put(q1,2);
        hmap.put(q2,4);
        hmap.put(q3,1);
        hmap.put(q4,3);
        hmap.put(q5,1);

        Scanner sc= new Scanner(System.in);
        int correctCount=0;

        //iterate the map to print out question and choice out for all 5 questions in the map
        for(Map.Entry<Questions,Integer> map:hmap.entrySet()){
            print(map.getKey().getQuestion());
            print(map.getKey().getChoice1());
            print(map.getKey().getChoice2());
            print(map.getKey().getChoice3());
            print(map.getKey().getChoice4());
            print("Select an option: ");

            //get answer choice from user
            Integer answer=sc.nextInt();

            //checking user input integer answer against correct answer from hashmap
            int correctAnswer=Integer.compare(answer, map.getValue());
            if(correctAnswer==0){
                print("Correct Answer");
                correctCount++;

            }
            else{
                print("Wrong Answer");
            }



        }
        print("Score percentage: "+(100*correctCount)/hmap.size()+"%");

    }
}
public class Main {
    public static void main(String[] args) {
        startTest q= new startTest ();
        q.testMethod();
    }
}
