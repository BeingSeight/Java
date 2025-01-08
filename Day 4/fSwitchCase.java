// Switch Case
// WAP to accept a number and print the season

import java.util.Scanner;

public class fSwitchCase {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = sc.nextInt();
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Summer";
                break;
            case 6:
            case 7:
            case 8:
                season = "Monsoon";
                break;
            case 9:
            case 10:
            case 11:
                season = "Winter";
                break;
            default:
                season = "Invalid month";
                break;
        }
        System.out.println("The season is " + season);
    }
}
