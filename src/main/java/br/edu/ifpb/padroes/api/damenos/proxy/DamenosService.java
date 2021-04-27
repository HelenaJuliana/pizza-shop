package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;

import java.util.List;

public interface DamenosService;

List<DamenosPizza> Pizzas = new ArrayList<>():

public DamenosServiceImplProxy(){

    this.damenosService = new DamenosServiceImpl();


}
@Override
public List<DamenosPizza> getPizzas(){

    if(cachePizzas.isEmpty()){
        cachePizzas = damenosService.getPizzas();

    }else{
        System.out.println("Retrieved list from cache.")
    }
    return cachePizzas;
}


