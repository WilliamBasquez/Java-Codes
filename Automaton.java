import java.util.*;
import java.io.*;
class Automaton{
    public static void main(String[] args){
		int numStates = 2, numSymbols = 2;
		String str = "";
        int[][] states = new int[numStates][numSymbols];
			states[0][0] = 0;
			states[0][1] = 1;
			states[1][0] = 0;
			states[1][1] = 1;
        boolean[] finalState = new boolean[]{true, false};
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string you want to test: ");
        try{
			str = myReader.readLine();
			stringTest(numStates, numSymbols, states, finalState, str);
			myReader.close();	
		} catch (Exception a){
			System.out.println("Input read was not an accepted symbol\nCurr. State: Sink State\nThis word was not accepted");
		}
    }
    
    public static void stringTest(int N, int M, int[][] Q, boolean[] fS, String word){
		int current = 0;
		for(int i = 0; i < word.length(); i++){
			current = Q[current][Character.getNumericValue(word.charAt(i))];
			System.out.println("Curr. State:" + current + "\tS. Read:" + word.charAt(i) + "\tNew State:" + current);
		}
		if(fS[current] == true)
			System.out.println("This word was accepted");
		else
			System.out.println("This word was not accepted");
	}
}
