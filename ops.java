class Dogesh_bhai{
    int age ;
    String name;
   void bow(){
       System.out.println("bowwww bowwww");}
static void plan(){
System.out.println("HEHEHE DOGESH ARE READY LAUDE");
}
}



class main {
    public static void main(String args[])
{
     Dogesh_bhai dogesh = new Dogesh_bhai();
     dogesh.bow();
     dogesh.name="dogu";
     dogesh.age=33;
   System.out.println("THE NAME OF THE DOGESH IS " + dogesh.name);
   System.out.println("THE AGE OF THE DOGESH IS " + dogesh.age);
  dogesh.name="gandu";
System.out.println("THE NEW NAME OF DOGESH IS " + dogesh.name);
Dogesh_bhai.plan();
}
} 
