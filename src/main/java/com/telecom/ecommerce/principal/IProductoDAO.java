package com.telecom.ecommerce.principal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

@Repository
public interface IProductoDAO extends CrudRepository<Producto,Integer> {

}
