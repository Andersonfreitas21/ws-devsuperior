package com.devsuperir.dsvendas.repositories;

import com.devsuperir.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Long> {
}