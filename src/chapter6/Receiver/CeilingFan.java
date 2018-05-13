package chapter6.Receiver;

public class CeilingFan {
    private String location;
    private int speed;
    private int HIGH = 3;
    private int MEDIUM = 2;
    private int LOW = 1;
    private int OFF = 0;

    public CeilingFan (String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " ceiling fan is set to high.");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is set to medium.");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " ceiling fan is set to low.");
    }

    public void off() {
        System.out.println(location + " ceiling fan is off.");
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
