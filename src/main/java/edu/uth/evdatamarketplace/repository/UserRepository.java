package edu.uth.evdatamarketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.uth.evdatamarketplace.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
