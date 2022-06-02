package exercise2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        char[][] table = new char[(n + 1) / 2][n];
        int shift = 0;

        for (int i = 0; i < (n + 1) / 2; i++){
            char symbol = 'a';
            for (int j = shift; j >= 0; j--){
                table[i][j] = symbol;
                if (symbol >= 'z'){
                    symbol = 'a';
                } else {
                    symbol++;
                }
            }
            symbol = 'a';
            for (int j = shift; j < (n+1) / 2; j++){
                table[i][j] = symbol;
                if (symbol >= 'z'){
                    symbol = 'a';
                } else {
                    symbol++;
                }
            }
            symbol = 'a';
            for(int j = n - shift - 1; j >= n / 2; j--){
                table[i][j] = symbol;
                if (symbol >= 'z'){
                    symbol = 'a';
                } else {
                    symbol++;
                }
            }
            symbol = 'a';
            for(int j = n - shift - 1; j < n; j++){
                table[i][j] = symbol;
                if (symbol >= 'z'){
                    symbol = 'a';
                } else {
                    symbol++;
                }
            }
            shift++;
        }

        for (int i = 0; i < (n + 1) / 2; i++){
            for(int j = 0; j < n; j++){
                System.out.print(table[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = n / 2 - 1; i > 0; i--){
            for(int j = 0; j < n; j++){
                System.out.print(table[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < n; i++){
            System.out.print(table[0][i]);
        }
    }
}
