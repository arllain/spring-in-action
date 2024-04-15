package com.arllain.tacocloud.web;

import com.arllain.tacocloud.data.IngredienteRepository;
import com.arllain.tacocloud.domain.tacos.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

  private IngredienteRepository ingredienteRepository;

  @Autowired
  public IngredientByIdConverter(IngredienteRepository ingredienteRepository) {
    this.ingredienteRepository = ingredienteRepository;
  }

  @Override
  public Ingredient convert(String id) {
    return ingredienteRepository.findById(id).orElse(null);
  }

}
