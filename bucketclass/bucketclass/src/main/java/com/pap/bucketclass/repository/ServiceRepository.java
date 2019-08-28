package com.pap.bucketclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pap.bucketclass.entity.Services;
@Repository
public interface ServiceRepository extends JpaRepository<Services, Long> {

}
