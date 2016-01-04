import java.util.*;
class contour {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a whole number:");
        int x = sc.nextInt();
        
        String[][] array = new String[x][x];
        Arrays.fill(array, "-");
        
        System.out.println(Arrays.toString(array));
        
    }
}