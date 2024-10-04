import java.util.Scanner;

public class AirTrafficControl{
    public static void main(String[] args){
        
        //The following block of code allows for user input
        //You do not need to change this code
        System.out.println("\nAir Traffic Control Simulator\n_______________________________________________________");
        Scanner airplane3input = new Scanner(System.in);
        System.out.print("Enter call sign for Airplane 3: ");
        String a3callSign = airplane3input.nextLine();
        System.out.print("Enter distance from tower in miles for Airplane 3: ");
        double a3distance = airplane3input.nextDouble();
        System.out.print("Enter bearing angle in degrees for Airplane 3: ");
        int a3direction = airplane3input.nextInt();
        System.out.print("Enter altitude in feet for Airplane 3: ");
        int a3altitude = airplane3input.nextInt();
        airplane3input.close();

        /*  Milestone 1
         *  Write a constructor call to create the first default plane. 
         *  Write a constructor call to create a second plane with the non-default values.
         *  Then write code to get inputs of the correct type for each field for the third plane.
         */




         
         /*  Milestone 2
          *  Write code that prints the relevant details for all three airplanes. 
          *  Calculates the distance between each of the airplanes then prints this value. 
          */




          /*  Milestone 3
           *  Write code that moves the planes as desired (the first airplane up 3000 feet, the second down 2000 feet, and the third down 4000 feet).
           *  Then move the first airplane by the initial distance between the second and third on a heading of 65°, 
           *  the second 8.0 miles on a heading of 135°, and the third 5.0 miles on a heading of 55°.
           *  Repeat the code from milestone 2 to print the new positions.
           */




        System.out.println("");
    }
}
