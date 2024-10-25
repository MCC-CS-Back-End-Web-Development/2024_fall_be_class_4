import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car1 = getCarDetails(scanner);
        System.out.println(car1.honkHorn());
        System.out.println(car1.turnLeft(85));
        System.out.println(car1.turnRight(90));

        Motorcycle motorcycle = getMotorcycleDetails(scanner);
        System.out.println(motorcycle.honkHorn());
        System.out.println(motorcycle.turnLeft(85));
        System.out.println(motorcycle.turnRight(90));
    }

    private static Car getCarDetails(Scanner input){
        Car ret = new Car();
        System.out.print("Enter the color of your car: ");
        ret.setColor(input.nextLine());

        System.out.print("How many passengers can it hold: ");
        ret.setNumberOfPassengers(input.nextInt());
        input.nextLine();

        System.out.print("Is your car 4 door (y/n): ");
        ret.setFourDoor(input.nextLine().equalsIgnoreCase("y"));

        return ret;
    }

    private static Motorcycle getMotorcycleDetails(Scanner input){
        Motorcycle ret = new Motorcycle();

        System.out.print("Enter the color of your Motorcycle: ");
        ret.setColor(input.nextLine());


        System.out.print("Does your motorcycle have a Radio: ");
        ret.setRadio(input.nextLine().equalsIgnoreCase("y"));

        return ret;
    }

}
