package com.devsuperir.dsvendas.mapper;

import com.devsuperir.dsvendas.dto.SaleDTO;
import com.devsuperir.dsvendas.entities.Sale;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SaleMapper {
    Sale toEntity(SaleDTO dto);
    SaleDTO toDto(Sale entity);
    List<SaleDTO> toDto(List<Sale> entity);
}
