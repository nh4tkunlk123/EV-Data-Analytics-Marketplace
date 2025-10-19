package edu.uth.evdatamarketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.uth.evdatamarketplace.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
