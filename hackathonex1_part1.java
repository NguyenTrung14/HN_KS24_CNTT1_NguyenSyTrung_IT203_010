import java.util.Scanner;


public class hackathonex1_part1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String[] words= input.split("\\s+");
        System.out.print("So tu hop le: ");
        int count=0;
        for(String word : words){
            if(word.matches("[a-zA-Z]+")){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
