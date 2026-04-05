class India {
 public void speak(){
System.out.println("I can speak India languages ");

}
}

 class Kerala extends India{

 public void speak(){
System.out.println("I can speak malayalam ");
 }
}

class Delhi extends India{
public void speak(){
System.out.println("I can speak Hindi ");
}
}
//overwriding

class Main {


public static void main (String args[]){
Delhi d1 = new Delhi();
d1.speak();
}
}

