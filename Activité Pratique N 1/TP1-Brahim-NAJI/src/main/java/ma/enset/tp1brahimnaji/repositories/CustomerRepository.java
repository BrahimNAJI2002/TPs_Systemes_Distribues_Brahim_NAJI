package ma.enset.tp1brahimnaji.repositories;

import ma.enset.tp1brahimnaji.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long > {

}
