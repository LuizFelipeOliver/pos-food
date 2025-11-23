package com.pos_food.rawmaterial;

import java.util.UUID;

import com.pos_food.model.Unit;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class RawMaterial {

  @Id
  @GeneratedValue
  private UUID id;

  private String name;
  private double quantity;

  @Enumerated(EnumType.STRING)
  private Unit unit;
  private double unitValue;
  private double price;

  public RawMaterial() {
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getQuantity() {
    return quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  public Unit getUnit() {
    return unit;
  }

  public void setUnit(Unit unit) {
    this.unit = unit;
  }

  public double getUnitValue() {
    return unitValue;
  }

  public void setUnitValue(double unitValue) {
    this.unitValue = unitValue;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getUnitCost() {
    return price / unitValue;
  }

  public void consume(double amount) {
    this.quantity -= amount;
  }
}
