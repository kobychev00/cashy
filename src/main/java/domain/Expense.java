package domain;

import java.util.Set;

public class Expense extends Operation {

    private String vector;

    public Expense(String type, String source, int amount, String comment, int numbers, String vector) {
        super(type, source, amount, comment, numbers);
        this.vector = vector;
    }


    public String getVector() {
        return vector;
    }

    public void setVector(String vector) {
        this.vector = vector;
    }
}
