package ma.enset.tp1brahimnaji.entities;

import ma.enset.tp1brahimnaji.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {
    public String getId();
    public AccountType getType();
}
