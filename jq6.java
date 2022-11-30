import java.util.Scanner;
public class jq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int row = sc.nextInt();
        System.out.println("Enter no of columns");
        int column = sc.nextInt();
        if(row != column){
            System.out.println("Enter valid input to multiply");
            sc.close();
            return;
        }
        int[][] m1 = new int[row][column];
        int[][] m2 = new int[row][column];
        System.out.println("Enter elements for first matrix : ");
        for(int i = 0; i<row;i++){
            for(int j = 0; j<column; j++){
                m1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter elements for second matrix : ");
        for(int i = 0; i<row;i++){
            for(int j = 0; j<column; j++){
                m2[i][j]=sc.nextInt();
            }
        }

        int[][] m3 = new int[row][column];
        for(int i = 0; i<row;i++){
            for(int j = 0; j<column; j++){
                m3[i][j] = 0;
                for(int k = 0; k< row; k++){
                m3[i][j]+= m1[i][k]*m2[k][j];
                }
            }
        }
    System.out.println("Result is : ");
        for(int i = 0; i<row;i++){
            for(int j = 0; j<column; j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
