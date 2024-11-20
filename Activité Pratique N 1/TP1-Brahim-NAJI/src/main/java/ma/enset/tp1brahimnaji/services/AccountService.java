package ma.enset.tp1brahimnaji.services;

import ma.enset.tp1brahimnaji.dtos.BankAccountRequestDTO;
import ma.enset.tp1brahimnaji.dtos.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    public BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
