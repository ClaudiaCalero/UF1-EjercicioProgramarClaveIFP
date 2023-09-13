package com.IFPClaudiaC.UF1EjercicioProgramarClave;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Uf1EjercicioProgramarClaveIfpApplication {
		public static String encrypt(String text, int key) {
			StringBuilder encryptedText = new StringBuilder();
			for (char character : text.toCharArray()) {
				int valueAscii = (int) character + key;
				encryptedText.append((char) valueAscii);
			}
			return encryptedText.toString();
		}

		public static String decrypt(String encryptText, int key) {
			StringBuilder decryptedText = new StringBuilder();
			for (char character : encryptText.toCharArray()) {
				int valueAscii = (int) character - key;
				decryptedText.append((char) valueAscii);
			}
			return decryptedText.toString();
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Encryption and Decryption Program");
		System.out.print("Enter the key: ");
		int key = scanner.nextInt();

		while (true) {
			System.out.println("\nMain Menu:");
			System.out.println("1. Encrypt text");
			System.out.println("2. Decrypt text");
			System.out.println("3. Exit");
			System.out.print("Select an option: ");
			int option = scanner.nextInt();
			scanner.nextLine();

			if (option == 1) {
				System.out.print("Enter the text to encrypt: ");
				String text = scanner.nextLine();
				String encryptedText = encrypt(text, key);
				System.out.println("Encrypt text: " + encryptedText);
			} else if (option == 2) {
				System.out.print("Enter the encrypted text: ");
				String encryptedText = scanner.nextLine();
				String decryptedText = decrypt(encryptedText, key);
				System.out.println("Decrypt text: " + decryptedText);
			} else if (option == 3) {
				System.out.println("¡See you!");
				break;
			} else {
				System.out.println("Invalid option. Please try again.");
			}
		}

		scanner.close();
	}
}
