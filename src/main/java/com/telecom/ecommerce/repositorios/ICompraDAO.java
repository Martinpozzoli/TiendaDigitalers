package com.telecom.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.telecom.ecommerce.entidades.Compra;

@Repository
public interface ICompraDAO extends JpaRepository<Compra,Integer> {

}
