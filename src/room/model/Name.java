package room.model;

public class Name {

    private String name;
    private String surname;
    private int year;
    private double mark;

    @Override
    public String toString() {
        return name + " " + surname;
    }


    public Name(String line) {
        String[] split = line.split(",");
        name = split[0];
        surname = split[1];
        year = Integer.parseInt(split[2]);
        mark = Double.parseDouble(split[3]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String print() {
        return name + " " + surname + " " + year + " " + mark;
    }
}
