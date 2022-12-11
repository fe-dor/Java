package sort.ex2;

public class Student {
    private double score;
    private int id;

    public double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setScore(String score) {
        this.score = Double.parseDouble(score);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
