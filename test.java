import java.util.Scanner; 
class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        // int age = 22;
        // String name ="safvan";
        // char  grade = 'P';
        // double mark = 45.3;
        // System.out.println("The name is "+name);
        // System.out.println("The grade is "+  grade );
        // System.out.println("The makr is " + mark );
        // System.out.println(" My favorate movie is here:");
        // String name="Pendulam";
        // double date = 2023.16;
        // int rateing=5;
        // System.out.println("THE MOVEI IS " + name);
        // System.out.println("THE RELESEAE DATE IS "+ date );
        // System.out.println("THE RATING IS " + rateing);
        
        
//         Your Next Challenge
// Let's pretend you are building a simple Store Checkout system.

// Create a variable for price (double) and set it to 10.50.

// Create a variable for quantity (int) and set it to 3.

// Create a third variable called total that multiplies the price by the quantity.

// Print the total.

// Try writing that in your compiler. What total do you get?

// System.out.println("SIMPLE STORE CHECKOUT SYSEM ");
// double price =10.50;
// int quantity=3;
// double total = quantity * price;
// System.out.println ("Total price " + total);
    // System.out.println("Enter the name here: ");
    // String name = sc.nextLine();
    // System.out.println("Enter the age");
    // int age = sc.nextInt();
    // System.out.println("Enter the mark here ");
    // double mark =sc.nextDouble();
    // System.out.println("The name is " + name);
    // System.out.println("The age is "+ age );
    // System.out.println("The makr is " + mark );
    // System.out.println("Enter the age to check adult or not :) ");
    // int mark  = sc.nextInt();
    // if ( age >= 18 ){
    //     System.out.println("thandha   ");
    // }else{
    //     System.out.println("kannapi mon ");
    // }
//       90 or above: "Grade A"

// 80 or above: "Grade B"

// 70 or above: "Grade C"

// Below 70: "Needs Improvement" 
// if ( mark >= 90  ){
//     System.out.println("GRADE A");
// }else if ( mark >= 80 ){
//     System.out.println("B GRADE");
// }else if ( mark >= 70 ){
//     System.out.println("GRADE C ");
// }else {
//     System.out.println("You need to Imporvement ");
// }
// int number = 10 ;
// while ( number !=0 ){
//     System.out.println(number);
//     number --;
    
// }


// Ask the user for a number (e.g., 5).

// Use a for loop that starts at 1 and goes up to 10.

// Inside the loop, multiply the user's number by the loop's counter.

// Print the result like this: 5 x 1 = 5, 5 x 2 = 10, etc.

// Can you try writing the for loop part for this? Remember: for (int i = 1; i <= 10;

int number = sc.nextInt();
for( int i =1;i<=number;i++){
    System.out.println(i + "*" +number+ "="+ i*number);
}

    }
}
