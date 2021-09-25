package com.example.Dalisa.repository;

import com.example.Dalisa.modelo.UsuarioDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioDTO,String>{
 
  
  @Query(value = "EXECUTE SP_INGRESAR :use ,:pass",nativeQuery = true)
  public String logear(@Param("use") String use, @Param("pass") String pass);

}
