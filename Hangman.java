import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args){


        try(BufferedReader reader = new BufferedReader(new FileReader("words.txt"))){
            ArrayList<String> words = new ArrayList<>();
            String line;
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int count = 0;

            while((line = reader.readLine()) != null){
                words.add(line.trim());

            }

            String word = words.get(random.nextInt(words.size()));

            System.out.print("Your Word: ");

            ArrayList<Character> newword = new ArrayList<>();

            for(int i = 0; i <word.length();i++){
                newword.add('_');
            }
            for(char c : newword){
                System.out.print(c + " ");
            }

            while(count < 6) {
                System.out.println();
                System.out.println("**********************************************");
                System.out.print("Enter the letter you think your word contain: ");
                Character guess = scanner.nextLine().charAt(0);
                System.out.println("**********************************************");


                if (word.indexOf(guess) >= 0){
                    System.out.println("Correct guess");

                    for (int i = 0; i < word.length(); i++) {
                        char letterinword = word.charAt(i);

                        if (letterinword == guess) {
                            newword.set(i, guess);
                        }
                    }
                }
                else{
                    System.out.println("Wrong guess");
                    count++;
                }

                if (!newword.contains('_')) {
                    System.out.println("Congratulations! You guessed the word!");
                    System.out.println("The word was: " + word);
                    break;
                }

                System.out.println("****");
                result(count);
                System.out.println("****");
                System.out.print("Your Word: ");

                for (char c : newword) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }



            scanner.close();



        }catch(IOException exception){
            System.out.println("Something went wrong");

        }

    }
    static void result (int count){
        switch (count){
            case 0 -> System.out.println("""
                    
                    
                    
                    """);
            case 1 -> System.out.println("""
                     O
                    
                    
                    """);
            case 2 -> System.out.println("""
                     O
                     |
                    
                    """);
            case 3 -> System.out.println("""
                     O
                    /|
                    
                    """);
            case 4 -> System.out.println("""
                     O
                    /|\\
                    
                    """);
            case 5 -> System.out.println("""
                     O
                    /|\\
                    /
                    """);
            case 6 -> System.out.println("""
                     O
                    /|\\
                    / \\
                    """);
        }

    }
}
