package streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Stream4Methods {
	public static void main(String[] args) {

	}

	public int solution(int[] A, int[] B) {

		Set<Integer> firstShop = new HashSet<>();
		for (int n : A) {
			firstShop.add(n);
		}
		
		Set<Integer> secondShop = new HashSet<>();
		for (int n : B) {
			secondShop.add(n);
		}
		
		int returnNum = 0;
		
		if (firstShop.size()<= A.length/2) {
			returnNum +=firstShop.size();
		}
		else {
			returnNum += A.length/2;
		}
		
		if(secondShop.size()<= B.length/2) {
			returnNum +=secondShop.size();
		}
		else {
			returnNum += B.length/2;
		}		

		return returnNum;
	}
}
