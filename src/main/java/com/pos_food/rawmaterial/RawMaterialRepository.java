package com.pos_food.rawmaterial;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RawMaterialRepository extends JpaRepository<RawMaterial, UUID> {
}
