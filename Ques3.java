import java.util.Scanner;

public class Ques3 {
    static void printMatrix(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row:");
        int r = sc.nextInt();
        System.out.println("Enter the size of column:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count=0;
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                   if(arr[i-1][j-1]==arr[i][j]){
                     count++;
                   }
                   if(arr[i-1][j-1]!=arr[i][j]){
                       count=0;
                       break;
                   }

            }
        }
        printMatrix(arr,r,c);
        if (count>=1){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
