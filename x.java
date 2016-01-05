import java.util.*;
class x {
    
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
        
        System.out.println("Paint contour? (Y/N)");
        char z = sc.next().charAt(0);
        z = Character.toUpperCase(z);
        
        if (z=='Y') {
            
            int i = 0;
            int j = 0;
            
            while (i<x && j<x) {
                array[i][j] = "*";
                i++;
                j++;
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