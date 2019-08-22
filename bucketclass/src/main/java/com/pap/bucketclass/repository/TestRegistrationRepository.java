package com.pap.bucketclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pap.bucketclass.entity.ServiceRegistration;

@Repository
public interface TestRegistrationRepository extends JpaRepository<ServiceRegistration, Long>{

}
