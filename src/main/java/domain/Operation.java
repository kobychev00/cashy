package domain;

import java.util.Set;

public class Operation {
    private String type;
    private String source;
    private int amount;

    private String comment;
    private int numbers;

    public Operation(String type, String source, int amount, String comment, int numbers) {
        this.type = type;
        this.source = source;
        this.amount = amount;
        this.comment = comment;
        this.numbers = numbers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public void changeComment(String comment) {
        if (comment != null && !comment.isBlank()) {
            this.comment = comment;
        }
    }
}
