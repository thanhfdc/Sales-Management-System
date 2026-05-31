package org.example.Demo.Mapper;

import org.example.Demo.Modal.DTO.Finance.WalletDTO;
import org.example.Demo.Modal.Entity.Finance.Wallet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WalletMapper {
    WalletDTO toDTO(Wallet wallet);

    Wallet toEntity(WalletDTO walletDTO);
}
