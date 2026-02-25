import java.util.Scanner;

public class hackathonex1_part2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        System.out.print("Tu hop le: \n");
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
            }
        }
        sc.close();
    }
}
