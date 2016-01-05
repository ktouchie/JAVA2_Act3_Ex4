import java.util.*;
class zorro {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a whole number:");
        int x = sc.nextInt();
        
        String[][] array = new String[x][x];

        for (int i=0; i<x; i++) {
            for (int j=0; j<x; j++) {
                array[i][j] = "-";
            }
        }
        
        for (int i=0; i<x; i++) {
            for (int j=0; j<x; j++) {
                array[i][j] = "-";
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("Paint Zorro? (Y/N)");
        char z = sc.next().charAt(0);
        z = Character.toUpperCase(z);
        
        if (z=='Y') {
            
            for (int i=0; i<array[0].length; i++) {
                array[0][i] = "*";
            }
            
            int i=0;
            int j=x-1;
            
            while (i<x && j>=0) {
                array[i][j] = "*";
                i++;
                j--;
            }
            
            for (int k=0; k<array[0].length; k++) {
                array[x-1][k] = "*";
            }

            for (i=0; i<x; i++) {
                for (j=0; j<x; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println("");
            }
        }
        else {
            System.out.println("Goodbye!");
        }
    }
        
}