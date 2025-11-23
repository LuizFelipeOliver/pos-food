package com.pos_food.rawmaterial;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class RawMaterialService {

  private final RawMaterialRepository rawMaterialRepository;

  public RawMaterialService(RawMaterialRepository rawMaterialRepository) {
    this.rawMaterialRepository = rawMaterialRepository;
  }

  public RawMaterial get(UUID id) {
    return rawMaterialRepository.findById(id).orElseThrow();
  }

  public List<RawMaterial> list() {
    return rawMaterialRepository.findAll();
  }

  public RawMaterial create(RawMaterial data) {
    return rawMaterialRepository.save(data);
  }

  public RawMaterial update(UUID id, RawMaterial data) {
    RawMaterial entity = rawMaterialRepository.findById(id).orElseThrow();

    entity.setName(data.getName());
    entity.setQuantity(data.getQuantity());
    entity.setUnit(data.getUnit());
    entity.setUnitValue(data.getUnitValue());

    return rawMaterialRepository.save(entity);
  }

  public void delete(UUID id) {
    rawMaterialRepository.deleteById(id);
  }
}
