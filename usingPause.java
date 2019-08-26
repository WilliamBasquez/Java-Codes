import java.io.*;
public class usingPause{
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("We're going to wait a little\nPlease enter a string: ");
        String word = scanner.readLine();
        char[] letters = word.toCharArray();
        int times = 0;
        try{
            while(times < 3){
                for (char letter : letters){
                    System.out.print(letter);
                    Thread.sleep(500);
                }
                for(char l : letters)
                	System.out.print("\b");
                times++;
            }
        } catch (Exception a){
            System.out.print("Well, this is awkward :/");
        }
    }
}