package domain;

import java.util.Set;

public class Income extends Operation {

    private int speed;

    public Income(String type, String source, int amount, String comment, int numbers, int speed) {
        super(type, source, amount, comment, numbers);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
