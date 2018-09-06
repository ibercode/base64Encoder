package com.ibercode;

import java.util.Scanner;

public class App {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println(" />");
		String word = scanner.nextLine();
		
		
		String encrypted = B64Encoder.getEncoded(word);
		System.out.println("ENCRYPTED " + encrypted);
		
		String decrypted = B64Encoder.getDecoded(encrypted);
		System.out.println("DECRYPTED " + decrypted);
		
		scanner.close();
	}

}
