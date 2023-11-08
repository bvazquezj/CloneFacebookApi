package com.upiicsos.clonefacebookapi.repository;

import com.upiicsos.clonefacebookapi.entity.Credenciales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Credenciales,Long> {
}
