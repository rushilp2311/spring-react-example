package com.springadmin.springadmin.repository;


import com.springadmin.springadmin.helper.Key;
import com.springadmin.springadmin.model.Queue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueRepository extends JpaRepository<Queue, Long> {

}
