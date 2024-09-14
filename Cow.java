public class Cow {
    private String id;
    private String color;
    private int ageYear;
    private int ageMonth;

    public Cow(String id, String color, int year, int month) {
        this.id = id;
        this.color = color;
        this.ageYear = year;
        this.ageMonth = month;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return ageYear;
    }

    public int getMonth() {
        return ageMonth;
    }

    @Override
    public String toString() {
        return id + "," + color + "," + ageYear + "," + ageMonth;
    }
}
