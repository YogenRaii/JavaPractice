import java.util.Scanner;

public class Main {

      static void print(String display){
         System.out.println(display);
    }

    static void chkAnswer(int x, int y){
          if (x==y){
              System.out.println("Correct Answer!");
          }else{
              System.out.println("Incorrect Answer!");
          }
    }
    public static void main(String [] args){
        System.out.println("***** WELCOME TO BASIC JAVA QUIZ! *****");

        Scanner sc= new Scanner(System.in);

        //Question1
        System.out.println("\n1: What is a correct syntax to output \"Hello World\" in Java?");
        String a1= "1: print (\"Hello World\")";
        String b1= "2: System.out.println(\"Hello World\");";
        String c1= "3: Console.WriteLine(\"Hello World\");";
        String d1= "4: echo(\"Hello World\");";
        print(a1);print(b1);print(c1);print(d1);
        int input1= sc.nextInt();
        chkAnswer(input1,2);

        //QUestion2
       System.out.println("\n2: Which data type is used to create a variable that should store text?");
        String a2= "1: myString";
        String b2= "2: string";
        String c2= "3: Txt";
        String d2= "4: String";
        print(a2);print(b2);print(c2);print(d2);
        int input2 = sc.nextInt();
        chkAnswer(input2, 4);

        //Question3
        System.out.println("\n3: How do you create a variable with the floating number 2.8?");
        String a3= "1: float x = 2.8f;";
        String b3= "2: byte x = 2.8f";
        String c3= "3: x = 2.8f;";
        String d3= "4: int x = 2.8f;";
        print(a3);print(b3);print(c3);print(d3);
        int input3 = sc.nextInt();
        chkAnswer(input3, 1);

        //Question4
        System.out.println("\n4: How do you call a method in Java?");
        String a4= "1: methodName;";
        String b4= "2: methodName[];";
        String c4= "3: methodName();";
        String d4= "4: (methodName);";
        print(a4);print(b4);print(c4);print(d4);
        int input4 = sc.nextInt();
        chkAnswer(input4, 3);

        //Question5
        System.out.println("\n5: How do you start writing a while loop in Java?");
        String a5= "1: while (x > y)";
        String b5= "2: x > y while {";
        String c5= "3: while x > y {";
        String d5= "4: while x > y:";
        print(a5);print(b5);print(c5);print(d5);
        int input5 = sc.nextInt();
        chkAnswer(input5, 1);


    }
}
