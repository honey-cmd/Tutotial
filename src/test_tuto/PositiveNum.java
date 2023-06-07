package test_tuto;

import java.util.Scanner;

public class PositiveNum {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter One Number : ");
		num = sc.nextInt();

		if (num >= 0) {
			System.out.println(num + "is a positive number");

		} else {
			System.out.println(num + " is a negative number");
		}

	}

}
