import java.util.Scanner;

public class hackathonex2_part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        if (n <= 0) {
            System.out.println("So luong phan tu khong hop le");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.printf("Moi ban nhap gia tri %d: ", i);
                numbers[i] = sc.nextInt();
            }
            System.out.print("Moi ban nhap gia tri muon chen vao: ");
            int x = sc.nextInt();
            System.out.print("Moi ban nhap vi tri muon chen gia tri vao: ");
            int index = sc.nextInt();
            int[] newNumbers = new int[numbers.length + 1];
            for (int i = 0; i < index; i++) {
                newNumbers[i] = numbers[i];
            }
            for (int i = index; i < newNumbers.length; i++) {
                newNumbers[i] = numbers[i - 1];
            }
            newNumbers[index] = x;

            for (int i = 0; i < newNumbers.length + 1; i++) {
                System.out.println(newNumbers[i] + " ");
            }
        }
        sc.close();

    }
}
