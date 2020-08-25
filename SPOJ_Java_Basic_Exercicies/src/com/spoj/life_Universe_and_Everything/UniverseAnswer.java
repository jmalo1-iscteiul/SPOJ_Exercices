package com.spoj.life_Universe_and_Everything;

import java.util.Scanner;

public class UniverseAnswer {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while(keyboard.hasNext()){
			int num = Integer.parseInt(keyboard.nextLine());
			if(num == 42)
				break;
			System.out.println(num);
		}
		keyboard.close();
	}

}
