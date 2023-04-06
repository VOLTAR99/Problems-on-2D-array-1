import java.util.Scanner;

public class Ques1 {
    static void printMatrix(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] multiply(int[][] arr1,int[][] arr2,int r1,int c1,int c2){
        int[][] mul=new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    mul[i][j]+=(arr1[i][k]*arr2[k][j]);
                }
            }
        }
        return mul;
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
        System.out.println("Enter the size of the row:");
        int r2=sc.nextInt();
        System.out.println("Enter the size of column:");
        int c2=sc.nextInt();
        int[][] arr2=new int[r2][c2];
        System.out.println("Enter the elements:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        if(r2==c1){
            int[][] mul=multiply(arr1,arr2,r1,c1,c2);
            printMatrix(mul,r1,c2);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
