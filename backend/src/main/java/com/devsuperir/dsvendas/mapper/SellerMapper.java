package com.devsuperir.dsvendas.mapper;

import com.devsuperir.dsvendas.dto.SellerDTO;
import com.devsuperir.dsvendas.entities.Seller;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SellerMapper {

    Seller toEntity(SellerDTO dto);

    @Mappings({
            @Mapping(target = "id", source="entity.id"),
            @Mapping(target = "name", source="entity.name")
    })
    SellerDTO toDto(Seller entity);

    List<SellerDTO> toDto(List<Seller> entity);
}
