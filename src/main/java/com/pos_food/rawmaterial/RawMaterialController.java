package com.pos_food.rawmaterial;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("raw-material")
public class RawMaterialController {

  private final RawMaterialService rawMaterialService;

  public RawMaterialController(RawMaterialService rawMaterialService) {
    this.rawMaterialService = rawMaterialService;
  }

  @GetMapping("/list")
  public List<RawMaterial> list() {
    return rawMaterialService.list();
  }

  @PostMapping("/create")
  public RawMaterial create(@RequestBody RawMaterial data) {
    return rawMaterialService.create(data);
  }

  @GetMapping("/{id}")
  public RawMaterial get(@PathVariable UUID id) {
    return rawMaterialService.get(id);
  }

  @PutMapping("/{id}")
  public RawMaterial update(
      @PathVariable UUID id,
      @RequestBody RawMaterial data) {
    return rawMaterialService.update(id, data);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable UUID id) {
    rawMaterialService.delete(id);
  }
}
