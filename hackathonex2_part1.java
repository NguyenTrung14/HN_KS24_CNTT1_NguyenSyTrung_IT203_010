import java.util.Scanner;

public class hackathonex2_part1 {
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
            int count = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] != numbers[i + 1]) {
                    count++;
                }
            }
            System.out.println("Do dai day tang lien tiep la: " + count);
        }
        sc.close();
    }
}
