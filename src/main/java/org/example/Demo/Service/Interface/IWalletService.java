package org.example.Demo.Service.Interface;

import org.example.Demo.Modal.DTO.Finance.WalletDTO;
import org.springframework.data.domain.Page;

import java.math.BigDecimal;

public interface IWalletService {
    WalletDTO deposit(Long userId, BigDecimal amount, Long adminId);

    void deductBalance(Long userId, BigDecimal amount);

    void creditAdmin(BigDecimal amount);

    void creditPrinthouse(Long printerHouseId, BigDecimal amount);

    void refundOnCancel(Long userId, BigDecimal amount);

    WalletDTO getWallet(Long userId);

    Page<WalletDTO> getAllWallets(int page, int size);
}
