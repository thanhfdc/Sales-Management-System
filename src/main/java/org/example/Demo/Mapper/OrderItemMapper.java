package org.example.Demo.Mapper;

import org.example.Demo.Modal.DTO.Orders.OrderItemDTO;
import org.example.Demo.Modal.Entity.Orders.OrderItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {
    OrderItemDTO toDTO(OrderItem orderItem);

    OrderItem toEntity(OrderItemDTO orderItemDTO);
}
