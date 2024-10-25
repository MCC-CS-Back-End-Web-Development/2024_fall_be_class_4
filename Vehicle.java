public class Vehicle {

    private String color;

    private Integer numberOfPassengers;

    private Integer mpg;

    private boolean storage;

    public String honkHorn(){
        return "honk!";
    }

    public String getColor() {
        return color;
    }

    public Vehicle setColor(String color) {
        this.color = color;
        return this;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public Vehicle setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
        return this;
    }

    public Integer getMpg() {
        return mpg;
    }

    public Vehicle setMpg(Integer mpg) {
        this.mpg = mpg;
        return this;
    }

    public boolean isStorage() {
        return storage;
    }

    public Vehicle setStorage(boolean storage) {
        this.storage = storage;
        return this;
    }
}
