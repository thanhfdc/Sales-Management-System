package org.example.Demo.Service.Interface;

import org.example.Demo.Modal.DTO.Products.ProductPriceDTO;
import org.springframework.data.domain.Page;

public interface IProductPriceService {
    ProductPriceDTO createProductPrice(ProductPriceDTO productPriceDTO);

    ProductPriceDTO updateProductPrice(Long id, ProductPriceDTO productPriceDTO);

    void deleteProductPrice(Long id);

    ProductPriceDTO getProductPrice(Long id);

    Page<ProductPriceDTO> getProductPrices(Long productId, String rank, int page, int size);

    Page<ProductPriceDTO> getAllProductPrices(int page, int size);
}
