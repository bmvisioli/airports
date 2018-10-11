package aiports.service;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    var scanner = new Scanner(System.in);
    var key = -1;
    do {
      System.out.println("Select the desired report or 0 to exit");
      key = scanner.nextInt();
      switch (key) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
      }
    } while(key != 0);

    System.out.println("Bye amigo!");

  }

}
