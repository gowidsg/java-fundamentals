package stringproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next().toLowerCase();
		String b = sc.next().toLowerCase();

		byte[] abyte = a.getBytes();
		byte[] bbyte = b.getBytes();
		
		StringBuilder as = new StringBuilder();
		Arrays.sort(abyte);
		for(byte i:abyte){
			as.append(i);
		}
		StringBuilder bs = new StringBuilder();
		Arrays.sort(bbyte);
		for(byte i:bbyte){
			bs.append(i);
		}
		
		if(bs.toString().equals(as.toString())){
			System.out.println("Anagram");
		}
		else{
			System.out.println("Not");
		}

	}

}
