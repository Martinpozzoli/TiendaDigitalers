package com.telecom.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.telecom.ecommerce.entidades.Cliente;

@Repository
public interface IClienteDAO extends JpaRepository<Cliente,Integer> {

}
