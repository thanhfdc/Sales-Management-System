package org.example.Demo.Mapper;

import org.example.Demo.Modal.DTO.Orders.OrderDTO;
import org.example.Demo.Modal.Entity.Orders.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDTO toDTO(Order order);

    Order toEntity(OrderDTO orderDTO);
}
