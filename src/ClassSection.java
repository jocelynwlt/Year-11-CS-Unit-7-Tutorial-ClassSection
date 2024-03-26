import java.util.ArrayList;

public class ClassSection {
    public String subject;
    public int capacity;
    public int yearLevel;
    public ArrayList<Student> students;

    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        students= new ArrayList<>();
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }

    public void addStudent(Student newstudent){
        if(newstudent.getYearLevel()==yearLevel&&capacity>students.size()&&!isStudentEnrolled(newstudent)){
            students.add(newstudent);
        }
    }
    public void removeStudent(Student newstudent){
        if(newstudent.getYearLevel()==yearLevel){
            students.remove(newstudent);
        }
    }
    public boolean isStudentEnrolled(Student newstudent){
        for (Student student : students) {
            if (student.getId() == newstudent.getId()) {
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "ClassSection{subject='"+subject+"', capacity="+capacity+", yearLevel="+yearLevel+", students="+ students+"}";
    }



}
