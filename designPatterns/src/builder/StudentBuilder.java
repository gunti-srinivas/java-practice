package builder;

public class StudentBuilder {
    private String name;

    private String phoneNumber;

    private int id;

    private int gradYear;


    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public StudentBuilder setId(int id){
        this.id = id;
        return this;
    }

    public StudentBuilder setGradYear(int year){
        this.gradYear = year;
        return this;
    }

    public int getGradYear(){
        return this.gradYear;
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



    public Student build(){
        return new Student(this);
    }
}
