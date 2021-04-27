package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountDecorator extends BaseDecorator {
  public DiscountDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public Float getPrice() {
    return super.getPrice() * 0.25f;
  }

  @Override
  public String getName() {
    return super.getName() + " ( pizza)";
  }
}
