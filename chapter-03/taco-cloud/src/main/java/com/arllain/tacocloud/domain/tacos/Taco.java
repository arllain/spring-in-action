package com.arllain.tacocloud.domain.tacos;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Taco {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotNull
  @Size(min=5, message="Name must be at least 5 characters long")
  private String name;

  @Size(min=1, message="You must choose at least 1 ingredient")
  @NotNull
  @ManyToMany
  public List<Ingredient> ingredients = new ArrayList<>();

  private Date createdAt = new Date();

  public void addIngredient(Ingredient ingredient) {
    this.ingredients.add(ingredient);
  }
}
