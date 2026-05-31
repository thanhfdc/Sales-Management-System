package org.example.Demo.Service.Interface;

import org.example.Demo.Modal.DTO.Products.ProductDTO;
import org.springframework.data.domain.Page;

public interface IProductService {
    ProductDTO createProduct(ProductDTO productDTO);

    ProductDTO updateProduct(Long id, ProductDTO productDTO);

    void deleteProduct(Long id);

    ProductDTO getProduct(Long id);

    Page<ProductDTO> getAllProducts(String name, int page, int size);
}
