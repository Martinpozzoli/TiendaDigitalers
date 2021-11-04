package com.telecom.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.telecom.ecommerce.entidades.Producto;

@Repository
public interface IProductoDAO extends JpaRepository<Producto,Integer> {

}
