// In a switch, break statements are optional

public class cMissingBreak {
    public static void main(String[] args) {
        for(int i=0;i<12;i++){
            switch(i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                System.err.println("i is less than 5");
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                System.err.println("i is less than 10");
                break;
                default:
                System.err.println("i is 10 or more ");
            }
        }
    }
}