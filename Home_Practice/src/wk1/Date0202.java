package wk1;

import java.util.Scanner;

import java.util.Iterator;
import java.util.Scanner;

public class Date0202 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
`