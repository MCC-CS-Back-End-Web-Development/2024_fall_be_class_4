
public class Car extends Vehicle implements SteeringBehavior {
    private boolean fourWheelDrive;

    private boolean fourDoor;

    private boolean thirdRow;

    private boolean entertainmentSystem;

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public Car setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
        return this;
    }

    public boolean isFourDoor() {
        return fourDoor;
    }

    public Car setFourDoor(boolean fourDoor) {
        this.fourDoor = fourDoor;
        return this;
    }

    public boolean isThirdRow() {
        return thirdRow;
    }

    public Car setThirdRow(boolean thirdRow) {
        this.thirdRow = thirdRow;
        return this;
    }

    public boolean isEntertainmentSystem() {
        return entertainmentSystem;
    }

    public Car setEntertainmentSystem(boolean entertainmentSystem) {
        this.entertainmentSystem = entertainmentSystem;
        return this;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fourWheelDrive=" + fourWheelDrive +
                ", fourDoor=" + fourDoor +
                ", thirdRow=" + thirdRow +
                ", entertainmentSystem=" + entertainmentSystem +
                '}';
    }

    @Override
    public String turnLeft(int degrees) {
        return "Turn on left turn signal; Turn wheel left until at " + degrees + "degrees.";
    }

    @Override
    public String turnRight(int degrees) {
        return "Turn on right turn signal; Turn wheel right until at " + degrees + "degrees.";
    }
}
