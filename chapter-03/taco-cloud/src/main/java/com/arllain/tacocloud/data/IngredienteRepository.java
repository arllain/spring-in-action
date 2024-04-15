package com.arllain.tacocloud.data;

import com.arllain.tacocloud.domain.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredienteRepository extends CrudRepository<Ingredient,String> {

}
