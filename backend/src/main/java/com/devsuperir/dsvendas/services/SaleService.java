package com.devsuperir.dsvendas.services;

import com.devsuperir.dsvendas.dto.SaleDTO;
import com.devsuperir.dsvendas.entities.Sale;
import com.devsuperir.dsvendas.mapper.SaleMapper;
import com.devsuperir.dsvendas.repositories.SaleRepository;
import com.devsuperir.dsvendas.repositories.SellerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    private final SaleRepository repository;
    private final SellerRepository sellerRepository;
    private final SaleMapper mapper;

    public SaleService(SaleRepository repository, SellerRepository sellerRepository, SaleMapper mapper) {
        this.repository = repository;
        this.sellerRepository = sellerRepository;
        this.mapper = mapper;
    }

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> salePage = repository.findAll(pageable);
        return salePage.map(sale -> mapper.toDto(sale));
    }
}
