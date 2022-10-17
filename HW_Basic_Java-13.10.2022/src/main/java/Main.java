import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk;

        System.out.println("сегодня выходной? ");
        Scanner day = new Scanner(System.in); //true or false
        Boolean name = day.nextBoolean();

        if (isWeekend == true && isRain == false) {
            canWalk = false;
        } else canWalk = false;
        System.out.println("Go to the walk ");



        // if (isWeekend == true)  {
        // if (isRain == false) {
        // canWalk = true;
        // System.out.println("Go to the walk ");
        // } else if (isWeekend != true) {
        // else if ( isRain == false){
        //}
        // canWalk = false;
        // System.out.println("Go to the walk ");


        System.out.println("на улице дождь? ");
        Scanner weather = new Scanner(System.in); // true or false
        boolean name1 = weather.nextBoolean();

        if (isWeekend != true && isRain == false) {
            canWalk = false;
        } else canWalk = false;
        System.out.println("Stay at home ");

    }
}
// ничего не понял. опустились руки





