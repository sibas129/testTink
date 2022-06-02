package exercise1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] answers = {"cba", "bca", "cab", "acb", "bac", "abc"};

        String firstComp = in.next();
        String secondComp = in.next();
        String thirdComp = in.next();

        String compares = firstComp + secondComp + thirdComp;

        if (compares.equals(">>>") || compares.equals(">=>")){
            System.out.print(answers[0]);
        }
        if (compares.equals(">><") || compares.equals("=><")){
            System.out.print(answers[1]);
        }
        if (compares.equals("<>>") || compares.equals("<>=")){
            System.out.print(answers[2]);
        }
        if (compares.equals("<<>") || compares.equals("=<>")){
            System.out.print(answers[3]);
        }
        if (compares.equals("><<") || compares.equals("><=")){
            System.out.print(answers[4]);
        }
        if (compares.equals("<<<") || compares.equals("<=<")){
            System.out.print(answers[5]);
        }
        if (compares.equals("=>>")){
            System.out.print(answers[2] + "\n" + answers[0]);
        }
        if (compares.equals("=<<")){
            System.out.print(answers[5] + "\n" + answers[4]);
        }
        if (compares.equals(">=<")){
            System.out.print(answers[4] + "\n" + answers[1]);
        }
        if (compares.equals("<=>")){
            System.out.print(answers[3] + "\n" + answers[2]);
        }
        if (compares.equals(">>=")){
            System.out.print(answers[1] + "\n" + answers[0]);
        }
        if (compares.equals("<<=")){
            System.out.print(answers[5] + "\n" + answers[3]);
        }
        if (compares.equals("==>")){
            System.out.print(answers[3] + "\n" + answers[2] + '\n' + answers[0]);
        }
        if (compares.equals("==<")){
            System.out.print(answers[5] + "\n" + answers[4] + '\n' + answers[1]);
        }
        if (compares.equals("=<=")){
            System.out.print(answers[5] + "\n" + answers[4] + '\n' + answers[3]);
        }
        if (compares.equals("=>=")){
            System.out.print(answers[2] + "\n" + answers[1] + '\n' + answers[0]);
        }
        if (compares.equals(">==")){
            System.out.print(answers[4] + "\n" + answers[1] + '\n' + answers[0]);
        }
        if (compares.equals("<==")){
            System.out.print(answers[5] + "\n" + answers[3] + '\n' + answers[2]);
        }
        if (compares.equals("===")){
            System.out.print(answers[5] + "\n" + answers[4] + '\n' + answers[3] + "\n"
                    + answers[2] + "\n" + answers[1] + '\n' + answers[0]);
        }
    }
}
