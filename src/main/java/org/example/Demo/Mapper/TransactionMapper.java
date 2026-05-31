package org.example.Demo.Mapper;

import org.example.Demo.Modal.DTO.Finance.TransactionDTO;
import org.example.Demo.Modal.Entity.Finance.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    TransactionDTO toDTO(Transaction transaction);

    Transaction toEntity(TransactionDTO transactionDTO);
}
