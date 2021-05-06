package com.devsuperir.dsvendas.dto;

import com.devsuperir.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum){
        sellerName = seller.getName();
        this.sum = sum;
    }
}
