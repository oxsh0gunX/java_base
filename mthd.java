class Main {
    public static void main (String args[]){
        System.out.println("hello myrree ");
        int a =4 ;
        int b =4;
        if ( a == b ){
            System.out.println("Same an ");
        }
        int umbi=3;
        switch(umbi){
            case 1 :
                System.out.println("1 umbi");
                break;
            case 2:
                System.out.println("2 umbi ");
                break;
            default:
                 System.out.println("umbiko myrre ");
        }
        // STRINGMETHod
        String myrr="umb";
        System.out.println(myrr.length());
        System.out.println(myrr.toUpperCase());
        System.out.println(myrr.toLowerCase());
        String pottan="pottan";
        String mandan="marra ";
        System.out.println(mandan.concat(pottan));
        
        // MATH METHORDS   
        System.out.println(Math.max(12,34));
        System.out.println(Math.min(12,34));
        System.out.println(Math.sqrt(27)); 
        System.out.println(Math.abs(-5));   // abs help to find the positive number of any number
        System.out.println((int)(Math.random() * 100));
        

    }
}
