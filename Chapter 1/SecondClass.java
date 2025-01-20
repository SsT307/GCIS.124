public class SecondClass {
    public static void main (String[] arg){
        /* --------------------------------- arrays --------------------------------- */
        // define an array
        double[] array1 = {1, 2, 3, 5, 56, 8, 6, 424, 24};

        // System.out.println(x); doesnt work, so we have to use a for loop to iterate through the indexes
        for(int i = 0; i< array1.length; i++) // iterating by index, i is index (int)
            System.out.print(array1[i]+", "); // print - prints them together, while println - prints each one in a new line
        
        
        System.out.println('\n');

        // second way of doing for loop [same as the first loop ^^]
        for(double i : array1) // iterating by value, i is value (same value as the array (double[] - (double)i) )
            System.out.print(i+" ");
        
        System.out.println('\n');

        // creating an empty array
        int[] array2 = new int[5]; // creating an empty array with 5 indexes
        for(int i = 0; i< array2.length; i++)
            array2[i] = i*10; // initialization of the array to have each index equal to a certain value
        
        for(int i : array2) // iterating by value, i is value (same value as the array (double[] - (double)i) )
            System.out.print(i+" ");

        System.out.println('\n');
        /* -------------------------------- 2D arrays ------------------------------- */
        int[][] array2D = new int[5][3];

        // initializing the 2D list
        for(int i = 0; i< array2D.length; i++) 
            for(int j = 0; j < array2D[0].length; j++) 
            // each row has a row of its own, basically arr[2][2], goes to the second index, and goes to the second index of that index
                array2D[i][j] = i*10+j;


        // printing a 2D array using nested for loop, i is the row
        for(int i = 0; i< array2D.length; i++){
            for(int j = 0; j < array2D[i].length; j++)
                System.out.print(array2D[i][j] +" ");
            System.out.print("\n");
        
        /* ----------------------------- ragged 2D array ---------------------------- */
        // 2D array where the amount of elements in each row are different from one to the other

        
        }
    }
}
