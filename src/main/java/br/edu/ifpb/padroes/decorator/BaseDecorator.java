package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public abstract class BaseDecorator implements Pizza {
  Pizza pizza;

  BaseDecorator(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public Float getPrice() {
    return pizza.getPrice();
  }

  @Override
  public String getName() {
    return pizza.getName();
  }
}
