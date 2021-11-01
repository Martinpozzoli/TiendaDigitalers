package com.telecom.ecommerce.principal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

@Repository
public interface ICompraDAO extends CrudRepository<Compra,Integer> {

}
