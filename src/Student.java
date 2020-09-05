import java.lang.*;
public class Student {
    private String name;
    private int age;

    public Student(String n, int a){
        name=n;
        age=a;
    }
    public Student(String n){
        name=n;
        age=19;
    }
    public Student(){
        name="Svatoslav";
        age=19;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }

}
