// The file has to have the same name as the class, you can create INNER classes (class inside another class) only
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
    public static void main (String [] args) 
    // Main Method - Static im using this method without creating an object, I can call it directly from the class - () parameters of the method
    {
        /* ----------------------------- printing a msg ----------------------------- */
        System.out.println("Hello World!"); 
        // PRINTING A MSG (println = print line), ONLY DOUBLE "" IS A STRING, '' IS A CHARACTER // Static Call
        System.out.println(4/3); // (int/int) going to result in 1, because it changes the decimal to fit into the int variable
        System.out.println(4.0/3); // (double/int), 1.3333
        System.out.println((double)4/3); // (double/int), 1.3333

        /* --------------------------- creating variables --------------------------- */
        int a = 3;
        float b = 3.455f;
        double c = 2.567; // you can add 'f' to the double because 32 bits fit in 64, but you cannot remove f from float because it turns the numbers into 64 bits and that cant fit into 32 bit float
        char d = ' '; // space is a character, unsigned, 16 bits
        long l = 3242l;
        byte e = 4; // unsigned, +1 +0
        short s = 19;

        /* ------------------------------- arithmatic ------------------------------- */
        double result = a+b+c+d+l+e+s; // DOUBLE IS THE BIGGEST DATA TYPE, IT WILL SAVE ANYTHING
        System.out.println(result);

        /* ----------------------- convert the result into int ---------------------- */
        int result_int = (int)result;
        System.out.println(result_int); // Will remove the decimal points

        /* ----------------------- calling another inner class ---------------------- */
        double r = calculate(3,4);
        System.out.println(r);

        double av = average(1,5,9);
        System.out.println(av);
    }
}