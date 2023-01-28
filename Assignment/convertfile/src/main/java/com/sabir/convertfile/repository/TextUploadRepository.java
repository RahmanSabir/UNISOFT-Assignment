package com.sabir.convertfile.repository;

import com.sabir.convertfile.model.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextUploadRepository extends JpaRepository<Text, Long> {

}
