package Java.guess_the_number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Давай сыграем в угадай число" );
        Scanner scanner = new Scanner(System.in);
        int range = 100;
        int number = (int)(Math.random() + range);

    }
}
