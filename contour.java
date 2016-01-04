import java.util.*;
class contour {
    
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
        String z = sc.nextLine();
        z = z.toLowerCase;
        if (z="y") {
            
        }
        else {
            System.out.println("Goodbye!")
        }
    }
        
}