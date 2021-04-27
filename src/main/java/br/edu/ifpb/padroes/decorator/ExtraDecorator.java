package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraDecorator extends BaseDecorator {
  public ExtraDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public Float getPrice() {
    return super.getPrice() * 1.10f;
  }

  @Override
  public String getName() {
    return super.getName() + " (extra )";
  }
}
