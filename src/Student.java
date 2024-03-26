import java.util.ArrayList;

public class Student {
    public int id = getNextId();
    public String firstName;
    public String lastName;
    public int age;
    public int yearLevel;
    public static int studentCount=1;
    public static int nextId=1;

    public Student(String firstName, String lastName, int age, int yearLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
    }

    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String name){
        this.firstName= name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String name){
        this.lastName = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int yl){
        this.yearLevel = yl;
    }
    public int getNextId(){
        return nextId++;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public boolean equals(Student student){
        return (this.equals(student));
    }
    public String toString(){
        return "Student{id="+ id + ", firstName='"+ firstName + "', lastName='"+ lastName +"', age=" +age+", yearLevel=" +yearLevel + "}";

    }


}
