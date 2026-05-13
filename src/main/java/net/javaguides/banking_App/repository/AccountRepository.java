package net.javaguides.banking_App.repository;

import net.javaguides.banking_App.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
