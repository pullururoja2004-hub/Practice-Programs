import java.util.*;
class Student{
    private String rollno;
    private String name;
    private String email;
    public Student(String rollno,String name,String email){
        super();
        this.rollno=rollno;
        this.name=name;
        this.email=email;
    }
    public String getrollNo(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String toString(){
        return "Student rollno is:"+rollno+"student name is:"+name+"student mail is:"+email;
    }

}
public class Example1ForLinkedHashSet {
    public static void main(String[] args){
        Student s1=new Student("A3633", "roja", "roja@gmail.com");
        Student s2=new Student("AK3623", "manasa", "manasa@gmail.com");
        LinkedHashSet<Student>hs=new LinkedHashSet<Student>();
        hs.add(s1);
        hs.add(s2);
        for(Object i:hs){
            System.out.println(i);
        }
    }
    
}
