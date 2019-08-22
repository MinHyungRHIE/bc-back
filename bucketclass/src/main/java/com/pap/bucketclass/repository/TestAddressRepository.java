package com.pap.bucketclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pap.bucketclass.entity.ServiceAddress;

@Repository
public interface TestAddressRepository extends JpaRepository<ServiceAddress, Long>{

}
