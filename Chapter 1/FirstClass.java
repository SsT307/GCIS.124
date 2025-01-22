// The file has to have the same name as the class, you can create INNER classes (class inside another class) only

import java.util.Scanner;

public class FirstClass {

    public static double calculate (int num1, int num2) // recieves int and outputs double, use static because we do not have any members 
    {
        return num1 + (double)num2/num1; 
        /** We have to convert one to (double), because you are (int/int) and that rounds the number, 
         * so we change one to double so that it (double/int), so it turns the result of that into a double */
    }

    public static double average(int num1, int num2, int num3)
    {
        return (num1 + num2 + num3)/3.0;
    }

    public static void yearOfBirth() // you change void to something else if you are RETURNING SOMETHING
    {
        Scanner year = new Scanner(System.in);
        System.out.println("What is your name and what age are you turning this year?");
        
        String name = year.nextLine();
        int age = year.nextInt();

        int CurrentYear = 2025;

        int birthYear = CurrentYear - age;

        System.out.println(name+" your year of birth is: "+  birthYear);

        year.close();
    }
    public static void main (String [] args) 
    // Main Method - Static im using this method without creating an object, I can call it directly from the class - () parameters of the method
    {
        /* ----------------------------- printing a msg ----------------------------- */
        System.out.println("Hello World!"); 
        // PRINTING A MSG (println = print line), ONLY DOUBLE "" IS A STRING, '' IS A CHARACTER // Static Call


        /* --------------------------- creating variables --------------------------- */
        // whole numbers can be saved to floats and doubles, but cant to the same for decimals and int, short, long
        // short can be saved to int, because less bits (ex.)
        
        byte e = 4; // 8 bit   
        // unsigned, +1 +0

        char d = ' '; // 16-bit unsigned 
        // space is a character, unsigned, 16 bits

        // ------------ WHOLE NUMBERS ------------ //

        short f = 19; // 16 bit
        //

        int a = 3; // 32 bit
        // the range is -2 billion to +2 billion

        long g = 3242l; // 64 bit
        // range is 3 billion +
        
        
        // ------------ DECIMAL NUMBERS ------------ //

        float b = 3.455f; // 32 bit
        //

        double c = 2.567; // 64 bit
        // you can add 'f' to the double because 32 bits fit in 64, but you cannot remove f from float because it turns the numbers into 64 bits and that cant fit into 32 bit float
        
        /* ---------------------------------- FINAL --------------------------------- */
        final int h = 9; // this is a final, meaning it cannot be changed (from chapt 2)
        
        /* ------------------------------- arithmatic ------------------------------- */
        System.out.println("\nARITHMATICS: ");

        double result = a+b+c+d+g+e+f+h; // DOUBLE IS THE BIGGEST DATA TYPE, IT WILL SAVE ANYTHING
        System.out.println(result);

        System.out.println(4/3); // (int/int) going to result in 1, because it changes the decimal to fit into the int variable
        System.out.println(4.0/3); // (double/int), 1.3333
        System.out.println((double)4/3); // (double/int), 1.3333

        /* ----------------------- convert the result into int ---------------------- */
        System.out.println("\nCONVERT RES TO INT: ");

        int result_int = (int)result;
        System.out.println(result_int); // Will remove the decimal points

        /* ----------------------- calling another inner class ---------------------- */
        System.out.println("\nCALLING ANOTHER CLASS: ");

        double res = calculate(3,4);
        System.out.println(res);

        double av = average(1,5,9);
        System.out.println(av);
        /*  
        double error = calculate(5, 5.6); // ERROR BECAUSE IT IS EXPECTING AN INT AND A DOUBLE IS PROVIDED 
        */   

        /* --------------------------------- STRINGS -------------------------------- */
        System.out.println("\nSTRINGS:");

        String str = "Hey Class!";
        System.out.println(str); // Hey Class!

        str = str.toUpperCase(); // HEY CLASS!
        str = str.toLowerCase(); // hey class!

        System.out.println(str);

        // STRINGS HAVE INDEXES
        System.out.println(str.charAt(3)); // every charcter counts as a index
        System.out.println(str.substring(1,6)); // print from index 1 to 5, 6 is not included


        //     //     //     //     //     //     //     //     //     //     //     //     //     //     //
        char chr = 's';
        System.out.println(chr);
        // cant do anything with this cause it is not a class, unlike String, thats why String is capitalized 



        /* ------------------------- IF STATEMENT and >, <, == ------------------------ */
        System.out.println("\nIF STATEMENT:");
        
        int t = 3;
        int r = 5;
        
        // if only one line, no need for {}, if more then add {}
        if (t==5 && r==5) //                            AND
            System.out.println("Value of t and r is 5!");
        else if (!(t > 5) || r > 2) //                 ! NOT, || OR
            System.out.println("t is less than 5 or r greater than 2!");
        else
            System.out.println("Nope");
        
        /* ------------------------------ WHILE LOOOOP ------------------------------ */
        System.out.println("\nWHILE LOOP1:");
        
        while (t < 15) {
            System.out.println(t);
            t++; // increase by 1, print from the number that t is till 14
        }

        System.out.println("\nWHILE LOOP2:");
        
        int num1 = 9;
        while (num1 > 0) {
            System.out.println(num1);
            num1--;
        }

        System.out.println("\nWHILE LOOP3:");
        
        int num2 = 104856;
        while (num2 != 2 && num2 > 0){
            System.out.println(num2);
            num2 = num2/2;
        }


        
        /* -------------------------- WHILE AND FOR LOOPSSS ------------------------- */
        System.out.println("\nCONVERT THIS WHILE TO FOR:");

        int i = 890;
        while(i!=2 && i>0){
            System.out.println(i);
            i = i/2;
        }
               
        
                // FOR LOOPS
        System.out.println("\nFOR LOOP CONVERSION:");
        // WHILE --> FOR
        for(int w = 890; w !=2 && w>0; w = w/2) {
            System.out.println(w);
        }


        System.out.println("\nFOR LOOP2:");
        for(int ex = 10; ex >= 1; ex--){
            System.out.println(ex);
        }



        /* ------------------------- INPUT FUNCTION IN JAVA ------------------------- */
        System.out.println("\nINPUT FUNCTION:");
        /*
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please enter your name, age, and height: ");
        
        // make sure to do the String first, because Java has a bug which doesnt let you do it inbetween for some reason
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();

        System.out.println("Person "+name+","+age+", and"+height);
        scanner.close(); // close the scanner for no error
        */

        System.out.println("\nINPUT FROM METHOD:");
        /* 
        yearOfBirth();
        */

    }
}