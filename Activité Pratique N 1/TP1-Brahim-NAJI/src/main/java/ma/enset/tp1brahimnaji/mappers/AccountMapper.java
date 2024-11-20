package ma.enset.tp1brahimnaji.mappers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import ma.enset.tp1brahimnaji.dtos.BankAccountResponseDTO;
import ma.enset.tp1brahimnaji.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}
