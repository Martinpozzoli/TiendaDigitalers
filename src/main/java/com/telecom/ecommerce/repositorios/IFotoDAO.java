package com.telecom.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.ecommerce.entidades.Foto;

@Repository
public interface IFotoDAO extends JpaRepository<Foto, Integer>{

}
