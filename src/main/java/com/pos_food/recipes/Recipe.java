package com.pos_food.recipes;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Recipe {
  @Id
  @GeneratedValue
  private UUID id;

  private String name;
  private UUID product_id;
  private UUID raw_material_id;
  private double quantity;

}
