package services;

public class RowService {
    private String name;
    private Integer marks;

    public RowService(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }
    public void setMarks(Integer marks) {
    	this.marks=marks;
    }
    public void displayRow() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

}
