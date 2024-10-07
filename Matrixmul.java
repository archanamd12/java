import java.util.Scanner;

class Matrixmul {
    public static void main(String[] argv) {
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int[][] c = new int[10][10];
        int i, j, k;
        Scanner sc = new Scanner(System.in);

        System.out.println("Matrix Multiplication...\n");

        // Input for first matrix
        System.out.println("1st Matrix...\n");
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("1st Matrix...");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // Input for second matrix
        System.out.println("2nd Matrix...\n");
        System.out.print("Enter number of rows: ");
        int p = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int q = sc.nextInt();
        if (n != p) {
            System.out.println("Matrix multiplication not possible.");
            return; // Exit the program if multiplication is not possible
        }
        System.out.println("Enter elements:");
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("2nd Matrix...");
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        // Matrix multiplication
        for (i = 0; i < m; i++) {
            for (j = 0; j < q; j++) {
                c[i][j] = 0;
                for (k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplied Matrix...");
        for (i = 0; i < m; i++) {
            for (j = 0; j < q; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

