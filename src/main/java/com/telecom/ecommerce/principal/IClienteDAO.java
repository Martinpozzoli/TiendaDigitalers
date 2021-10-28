package com.telecom.ecommerce.principal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

public interface IClienteDAO extends CrudRepository<Cliente,Integer> {

}
