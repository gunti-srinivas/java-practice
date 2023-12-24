package builder;

public class Client {

    public static void main(String[] args){

        Student student = Student.builder()
                .setGradYear(1994)
                .setName("srinivas")
                .setId(1)
                .setPhoneNumber("9090909090")
                .build();
        System.out.println(student.getId()+" "+ student.getName()+" "+ student.getPhoneNumber()+" "+ student.getGradYear());
    }
}
