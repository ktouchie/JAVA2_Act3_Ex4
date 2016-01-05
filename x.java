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
        
        int a = array.length;
        
        if (z=='Y') {
            for (int i=0; i<array[0].length; i++) {
                array[0][i] = "*";
            }
            
            for (int j=1; j<a-1; j++) {
                array[j][0]="*";
                array[j][array[j].length-1]="*";
            }

            for (int k=0; k<array[0].length; k++) {
                array[a-1][k] = "*";
            }

            for (int i=0; i<x; i++) {
                for (int j=0; j<x; j++) {
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