package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.service.PizzaShopService;

public class Main {

	public static void main(String[] args) {

        PizzaShopService pizzaShopService = new PizzaShopService();

        System.out.println("Pizzas - menu");

        for (PizzaHotPizza pizza : pizzaShopService.getPizzasPizzaHot()) {
            System.out.println(String.format("%s - %.2f", pizza.getTopping(), pizza.getPrice()));
        }
  

        Pizza pizza = new PizzaShopPizza("pepperoni", 55.0f);

            
        Pizza discountCoupon = new DiscountDecorator(discountdecorator);
        Pizza extradecoartor = new ExtraDecorator((extradecorator);
        Pizza panDecorator = new PanDecorator(pizza);

        pizzaShopService.orderPizza(stuffedCrust);

        
    }

}
