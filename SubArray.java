import java.util.*;
public class SubArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {4, 1, 2, 3 }; 
        int start;
        int end;
        int n = 4;
         
        for(start = 0; start < n-1 ; start++ ){
            for(end = start ; end <= n-1; end++){
                for(int j = start; j<= end ; j++){
                 System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
