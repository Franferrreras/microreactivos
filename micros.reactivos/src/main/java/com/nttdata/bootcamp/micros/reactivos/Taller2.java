package com.nttdata.bootcamp.micros.reactivos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import com.nttdata.bootcamp.micros.reactivos.model.Product;
import com.nttdata.bootcamp.micros.reactivos.model.Tax;

public class Taller2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> shoppingCart = List.of(
				new Product("Ropa", new BigDecimal("15.90"), Tax.NORMAL ),
				new Product("Pan", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Carne", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Quesoo¡", new BigDecimal("15.90"), Tax.SUPERREDUCED)
		);

//		shoppingCart.stream().parallel().reduce((a,b)-> a.getPrice().add(b.getPrice()));
//		BigDecimal totalPrice = shoppingCart.stream().map(x -> x.getPrice().add(x.getPrice().multiply(new BigDecimal(x.getTax().percent)).divide(new BigDecimal(100))))
//				.reduce(BigDecimal.ZERO, (x, y) -> x.add(y).setScale(2, RoundingMode.CEILING));
		BigDecimal totalPriceSinIva = shoppingCart.stream().map(x -> x.getPrice())
				.reduce(BigDecimal.ZERO, (x, y) -> x.add(y).setScale(2, RoundingMode.CEILING));
		System.out.println("________________________" + "\n");
		System.out.println("Total sin IVA: " + totalPriceSinIva);
		
		BigDecimal totalPrice = shoppingCart.stream().map(x -> x.getPrice().add(x.getPrice().multiply(new BigDecimal(x.getTax().percent)).divide(new BigDecimal(100))))
				.reduce(BigDecimal.ZERO, (x, y) -> x.add(y).setScale(2, RoundingMode.CEILING));
		System.out.println("________________________" + "\n");
		System.out.println("Total con IVA: " + totalPrice);
		System.out.println("________________________");
		
	}

}
