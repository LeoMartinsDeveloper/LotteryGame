package Lottery;
import java.util.Random;
import java.util.Scanner;

public class Lottery2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, which is the quantity of numbers of the prize draw? ");
		int tamanho = scan.nextInt();
		while (tamanho <= 0 || tamanho > 10) {
			System.out.println("Limit of number quantity (10) exceeded.\nPlease, tell me again, which is the quantity of "
					+ "numbers of the prize draw?");
			tamanho = scan.nextInt();

		}
		
		int value, i, j, cont,new_i, new_j, val1, val2, flag;
		int array [] = new int [tamanho];
		Random r = new Random();
		cont = 0;
		new_i = 0;
		new_j = 0;
		val1 = 0;
		val2 = 0;
		flag = 0;
	    
		for (i = 0; i < tamanho; i ++) {
			array[i] = r.nextInt(60) + 1;
		}	
		
		for (i = 0; i < tamanho; i ++) {
			for (j = 0; j < tamanho; j ++) {
				if (array [i] == array [j] && i != j) {
					val1 = array[i];
					array[i] = r.nextInt(60) + 1;
					cont ++;
					new_i = i;
					new_j = j;
					val2 = array[i];
					flag = 1;		
				}
			}
			
		}
		
		for (i = 0; i < tamanho; i ++) {
			System.out.format("[%d] = [%d]\n", i, array[i]);
			}
			
		
		if (flag == 1) {
		
		System.out.format("Repeated numbers had changed %d time(s).", cont);
		System.out.format("\nThe position %d has switched with %d.\n", new_i, new_j);
		System.out.format("Old value was %d and the new value is %d.", val1, val2);
		
			}
		}
	
	}

	
