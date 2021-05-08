package com.devsuperir.dsvendas.mapper;

import com.devsuperir.dsvendas.dto.SellerDTO;
import com.devsuperir.dsvendas.entities.Seller;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-07T10:12:01-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.9.1 (Ubuntu)"
)
@Component
public class SellerMapperImpl implements SellerMapper {

    @Override
    public Seller toEntity(SellerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Seller seller = new Seller();

        seller.setId( dto.getId() );
        seller.setName( dto.getName() );

        return seller;
    }

    @Override
    public SellerDTO toDto(Seller entity) {
        if ( entity == null ) {
            return null;
        }

        SellerDTO sellerDTO = new SellerDTO();

        sellerDTO.setId( entity.getId() );
        sellerDTO.setName( entity.getName() );

        return sellerDTO;
    }

    @Override
    public List<SellerDTO> toDto(List<Seller> entity) {
        if ( entity == null ) {
            return null;
        }

        List<SellerDTO> list = new ArrayList<SellerDTO>( entity.size() );
        for ( Seller seller : entity ) {
            list.add( toDto( seller ) );
        }

        return list;
    }
}
