package com.company;
import java.util.Scanner;
import java.lang.String;

public class Main {
      //task 31Даны строки S и S0. Проверить, содержится ли строка S0 в строке S. Если содержится, то вывести True, если не содержится, то вывести False.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input String 'S':");
	String S = in.nextLine();
        System.out.println("input String 'S0':");
    String S0 = in.nextLine();
    boolean i =S.contains(S0);
    System.out.println(i);
    }
}
class task8{
    public static void main(String[] args){
        task8();
        //Дано целое число N (> 0) и символ C. Вывести строку длины N, которая состоит из символов C.
    }
    private static void task8(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        String S = "X";

        for (int i = 2;i <= N;i++) {
            S += "X";
        }
        System.out.println(S);
    }
}
class task54{
    public static void main(String[] args){
        task54();
        //Дана строка-предложение заданное кириллицей. Подсчитать количество содержащихся в строке гласных букв.
    }
    private static void task54() {
        char[] golos = {'а', 'у', 'е', 'ы', 'о', 'э', 'я', 'и', 'ю', 'У', 'Е', 'Ы', 'А', 'Э', 'Я', 'И', 'Ю'};
        Scanner in = new Scanner(System.in);
        int glas = 0;
        String s = "Светит солнце";
        char[] b = s.toCharArray();
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 17; j++){
                if (b[i] == golos[j])
                    glas++;


            }
        }
        System.out.println(glas);
    }







    }

