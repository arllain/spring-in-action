package com.arllain.tacocloud.data;

import com.arllain.tacocloud.domain.tacos.Ingredient;

import java.util.Optional;

public interface IngredienteRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
