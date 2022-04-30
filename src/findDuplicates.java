import java.util.Scanner;

public class findDuplicates {
    public static void main(String[] args) {

        System.out.println(" Please Enter a Sentence : ");
        Scanner scanner= new Scanner(System.in);
        String sentence = scanner.nextLine();

        String characters = "";
        String duplicates = "";
        System.out.println("The duplicate letters in this sentence are : ");

        for (int i = 0; i < sentence.length(); i++) {
            String current = Character.toString(sentence.charAt(i));
            if (characters.contains(current)){
                if(!duplicates.contains(current)){
                    duplicates +=current +  ",";

                }
            }
            else
                characters += current;
        }
        System.out.println(duplicates);

    }
}
