package com.devsuperir.dsvendas.controller;

import com.devsuperir.dsvendas.dto.SaleDTO;
import com.devsuperir.dsvendas.dto.SaleSuccessDTO;
import com.devsuperir.dsvendas.dto.SaleSumDTO;
import com.devsuperir.dsvendas.services.SaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/sales")
public class SaleController {

    private final SaleService service;

    public SaleController(SaleService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> findAll(){
        return ResponseEntity.ok(service.amountGroupedBySeller());
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> findAllSuccess(){
        return ResponseEntity.ok(service.successGroupedBySeller());
    }
}
