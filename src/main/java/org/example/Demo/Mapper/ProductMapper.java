package org.example.Demo.Mapper;

import org.example.Demo.Modal.DTO.Products.ProductDTO;
import org.example.Demo.Modal.Entity.Products.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProductPriceMapper.class, ProductAttributeMapper.class})
public interface ProductMapper {
    ProductDTO toDTO(Product product);

    Product toEntity(ProductDTO productDTO);
}
