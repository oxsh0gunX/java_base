class Person{
int phone;
String name;
public void show_detials(){
System.out.println("The name is " + name);
System.out.println("The phone is " + phone);
}
}

class Teacher extends Person{}
class Student  extends Person{}

class Main{
public static void main (String args[]){
Teacher t1 = new Teacher();
t1.phone=23;
t1.name="louda";
t1.show_detials();

}}
