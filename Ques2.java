import java.util.Scanner;

public class Ques2 {
    static void transpose(int[][] arr,int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void printMatrix(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] reverse(int[][] arr,int start,int i,int end,int j){
        int temp=arr[start][i];
        arr[start][i]=arr[end][j];
        arr[end][j]=temp;
        return arr;
    }
    static void Rotate90(int[][] arr,int n){
        transpose(arr,n,n);

        for(int i=0;i<n;i++) {
            int start = 0;
            int end = n - 1;
            while (start<end){
                arr=reverse(arr,start,i,end,i);
                start++;
                end--;
            }
        }
        printMatrix(arr, n, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row:");
        int r1=sc.nextInt();
        System.out.println("Enter the size of column:");
        int c1=sc.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("Enter the elements:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        Rotate90(arr1,r1);
    }
}
