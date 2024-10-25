public class Motorcycle extends Vehicle implements SteeringBehavior {
    private boolean radio;

    private boolean isHarley;

    @Override
    public String honkHorn(){
        return "vroom vroom!";
    }

    public boolean isRadio() {
        return radio;
    }

    public Motorcycle setRadio(boolean radio) {
        this.radio = radio;
        return this;
    }

    public boolean isHarley() {
        return isHarley;
    }

    public Motorcycle setHarley(boolean harley) {
        isHarley = harley;
        return this;
    }

    @Override
    public String turnLeft(int degrees) {
        return "Turn on left turn signal; Lean left; Turn handle bars left until at " + degrees + "degrees.";
    }

    @Override
    public String turnRight(int degrees) {
        return "Turn on right turn signal; Lean right; Turn handle bars right until at " + degrees + "degrees.";
    }
}
