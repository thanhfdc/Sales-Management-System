package org.example.Demo.Mapper;

import org.example.Demo.Modal.DTO.Products.ProductPriceDTO;
import org.example.Demo.Modal.Entity.Products.ProductPrice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductPriceMapper {
    ProductPriceDTO toDTO(ProductPrice productPrice);

    ProductPrice toEntity(ProductPriceDTO productPriceDTO);
}
