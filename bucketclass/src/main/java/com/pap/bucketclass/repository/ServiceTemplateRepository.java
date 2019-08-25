package com.pap.bucketclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pap.bucketclass.entity.ServiceTemplate;
@Repository
public interface ServiceTemplateRepository extends JpaRepository<ServiceTemplate, String> {

}
