package com.springadmin.springadmin.repository;

import com.springadmin.springadmin.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import java.util.Optional;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant,Long> {
//Optional<Merchant> findByEmail (String email);
//
//Boolean existsByEmail(String email);

}
