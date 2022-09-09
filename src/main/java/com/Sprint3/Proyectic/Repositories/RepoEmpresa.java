package com.Sprint3.Proyectic.Repositories;

import com.Sprint3.Proyectic.Entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoEmpresa extends JpaRepository <Empresa, Long> {


}
