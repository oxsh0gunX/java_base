class Product {

    int pcode;
    double price;
    String pname;

    public static void main(String[] args) {

        Product p1 = new Product();
        p1.pcode = 1;
        p1.price = 3433;
        p1.pname = "monitor";

        Product p2 = new Product();
        p2.pcode = 2;
        p2.price = 333;
        p2.pname = "mouse";

        Product p3 = new Product();
        p3.pcode = 3;
        p3.price = 1000;
        p3.pname = "keyboard";

        Product choice;

        if (p1.price < p2.price && p1.price < p3.price) {
            choice = p1;
        } else if (p2.price < p3.price) {
            choice = p2;
        } else {
            choice = p3;
        }

        System.out.println("Lowest price product:");
        System.out.println(choice.pname + " - " + choice.price);
    }
}
