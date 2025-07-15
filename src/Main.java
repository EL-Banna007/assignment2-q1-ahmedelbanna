import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double average (double a , double b , double c ){
        return a/3+b/3+c/3 ;
    }
    public static Character grade (double determinegrad){
        if(determinegrad>=85){
            return 'A';
        }
        else if(determinegrad>=70){
            return 'B';
        }
        else if(determinegrad>=50){
            return 'C';
        }
        else {
            return 'F';
        }

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Scanner cin1 = new Scanner(System.in);
        System.out.println("How many students do you have ?");
        int studentsnum = cin.nextInt() ;

          for(int i = 0; i < studentsnum; i++){
              System.out.println("what is the student name ?");
            String studentname = cin1.nextLine() ;
            System.out.println("what is his / her arabic exam score ? ");
            double arabic = cin.nextDouble() ;
              System.out.println("what is his / her english exam score ? ");
              double english = cin.nextDouble() ;
              System.out.println("what is his / her math exam score ? ");
              double math = cin.nextDouble() ;
              double average =average(arabic,math,english);
              char thegrade = grade(average) ;
              System.out.println(studentname + " : " + average + " , " + thegrade);
        }
    }

}
