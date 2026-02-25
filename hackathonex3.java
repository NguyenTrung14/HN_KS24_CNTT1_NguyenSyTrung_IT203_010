public class hackathonex3 {
    public static void main(String[] args) {

        int[] A = {1, 2, 2, 3, 5};
        int[] B = {2, 5, 6};

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
    }
}
