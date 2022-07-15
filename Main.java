import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
           menu();
            Scanner in  = new Scanner(System.in);
            int i = in.nextInt();
            if (i == 1){
                Building b  = new Building();
            }if (i == 2){
                System.out.println("salam");
            }if (i == 3){
                System.out.println("sagol");
            }

        }
    }
    private static void menu(){
        System.out.println("Select what you want to do" +
                "\n1. Light control of buildings (1)" +
                "\n2. Control of Traffic Light (2)" +
                "\n3. Control of city light (3)" );
    }
    //    this project smart village project
    //    this project have smart building and smart Traffic light and city lights
    //    this pro.. is demo proje.


}
