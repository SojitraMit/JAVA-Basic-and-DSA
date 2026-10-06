//Write a Java application which takes several command line arguments, which are supposed to be names
//of students and printsoutput as given below: (Suppose we enter 3 names then output should be asfollows):
//Number of arguments = 3
//        1: First Student Name is =Tom
//2: Second Student Name is =Dick
//3: Third Student Name is =Harry
//(Hint: An array may be used for converting from numeric values from 1 to 20 into String.)

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Exm_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of students");
        int n=s.nextInt();

        String s1[]=new String[n];
        System.out.println("enter name of students");
        for(int i=0;i<n;i++){
            s1[i]=s.next();
        }



        

        String s2[]={"First","Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth",
                "Tenth", "Eleventh", "Twelfth", "Thirteenth" ,"Fourteenth", "Fifteenth", "Sixteenth",
                "Seventeenth", "Eighteenth", "Nineteenth ","Twentieth"};

        for(int i=0; i<n;i++){
            System.out.println(s2[i]+" student name is ="+s1[i]);
        }
    }
}
