package com.pap.bucketclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pap.bucketclass.entity.ServiceCategory;

@Repository
public interface TestCategoryRepository extends JpaRepository<ServiceCategory, Long>{

}
