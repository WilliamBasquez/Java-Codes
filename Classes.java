import java.util.*;
public class Classes{
	public static void main(String args[]){
		int[] math = new int[]{6,9,12};
		int[] geol = new int[]{9,12};
		int[] ee = new int[]{3,4};
		Set<Integer> points = new HashSet<>();
		
		for(int i = 0; i < math.length; i++){
			for(int j = 0; j < geol.length; j++){
				for(int k = 0; k <ee.length;k++)
					points.add(math[i]+geol[j]+ee[k]);
			}
		}
		
		for(int p : points)
			System.out.print(p + " ");
	}
}
