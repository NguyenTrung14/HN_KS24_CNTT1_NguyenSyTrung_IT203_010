import java.util.Scanner;

public class hackathonex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Moi ban nhap so luong phan tu mang A: ");
        int n=sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.print("Moi ban nhap so luong phan tu mang B: ");
        int m=sc.nextInt();
        int[] B = new int[n];
        for(int i=0;i<m;i++){
            B[i]=sc.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            boolean existsInB = false;
            for (int k = 0; k < B.length; k++) {
                if (A[i] == B[k]) {
                    existsInB = true;
                    break;
                }
            }
            if (count == 1 && !existsInB) {
                System.out.print(A[i] + " ");
            }
        }
        sc.close();
    }
}
