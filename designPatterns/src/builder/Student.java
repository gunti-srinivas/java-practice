package builder;

public class Student {

    private String name;

    private String phoneNumber;

    private int id;

    private int gradYear;

    public Student(StudentBuilder studentBuilder){
        this.name = studentBuilder.getName();
        this.phoneNumber = studentBuilder.getPhoneNumber();
        this.id = studentBuilder.getId();
        this.gradYear = studentBuilder.getId();
    }

    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public int getId(){
        return this.id;
    }


    public int getGradYear(){
        return this.gradYear;
    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }
}
