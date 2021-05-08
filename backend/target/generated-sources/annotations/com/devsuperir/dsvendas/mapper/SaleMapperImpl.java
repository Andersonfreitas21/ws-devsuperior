package com.devsuperir.dsvendas.mapper;

import com.devsuperir.dsvendas.dto.SaleDTO;
import com.devsuperir.dsvendas.dto.SellerDTO;
import com.devsuperir.dsvendas.entities.Sale;
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
public class SaleMapperImpl implements SaleMapper {

    @Override
    public Sale toEntity(SaleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Sale sale = new Sale();

        sale.setId( dto.getId() );
        sale.setVisited( dto.getVisited() );
        sale.setDeals( dto.getDeals() );
        sale.setAmount( dto.getAmount() );
        sale.setDate( dto.getDate() );
        sale.setSeller( sellerDTOToSeller( dto.getSeller() ) );

        return sale;
    }

    @Override
    public SaleDTO toDto(Sale entity) {
        if ( entity == null ) {
            return null;
        }

        SaleDTO saleDTO = new SaleDTO();

        saleDTO.setId( entity.getId() );
        saleDTO.setVisited( entity.getVisited() );
        saleDTO.setDeals( entity.getDeals() );
        saleDTO.setAmount( entity.getAmount() );
        saleDTO.setDate( entity.getDate() );
        saleDTO.setSeller( sellerToSellerDTO( entity.getSeller() ) );

        return saleDTO;
    }

    @Override
    public List<SaleDTO> toDto(List<Sale> entity) {
        if ( entity == null ) {
            return null;
        }

        List<SaleDTO> list = new ArrayList<SaleDTO>( entity.size() );
        for ( Sale sale : entity ) {
            list.add( toDto( sale ) );
        }

        return list;
    }

    protected Seller sellerDTOToSeller(SellerDTO sellerDTO) {
        if ( sellerDTO == null ) {
            return null;
        }

        Seller seller = new Seller();

        seller.setId( sellerDTO.getId() );
        seller.setName( sellerDTO.getName() );

        return seller;
    }

    protected SellerDTO sellerToSellerDTO(Seller seller) {
        if ( seller == null ) {
            return null;
        }

        SellerDTO sellerDTO = new SellerDTO();

        sellerDTO.setId( seller.getId() );
        sellerDTO.setName( seller.getName() );

        return sellerDTO;
    }
}
