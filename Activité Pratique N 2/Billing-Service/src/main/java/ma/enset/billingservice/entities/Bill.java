package ma.enset.billingservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.billingservice.models.Customer;

import java.util.Collection;
import java.util.Date;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
    private Long customerID;
    @Transient
    private Customer customer;

    public double getTotal(){
        double s = 0;
        for (ProductItem pi:productItems){
            s+= pi.getAmount();
        }
        return s;
    }
}
