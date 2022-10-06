package com.nttdata.bootcamp.micros.reactivos;

import java.util.List;

/**
 * Hello world!
 *
 */
public class Taller1 {
	
	public static void methodImperativo() {
		
		Integer count = 0;
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12 , 9, 8);
		
		for (Integer i : numbers) {
			if(i > 10) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static void methodFuncional() {
		
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12 , 9, 8);
		
		System.out.println(numbers.stream().filter(numero -> numero > 10).count());
		
	}
	
    public static void main( String[] args ) {
        System.out.println("_____Forma imperativa_____");
        methodImperativo();
        System.out.println("_____Forma funcional_____");
        methodFuncional();
    }
}
