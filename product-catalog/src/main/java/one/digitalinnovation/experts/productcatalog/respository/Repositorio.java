package one.digitalinnovation.experts.productcatalog.respository;

import one.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface Repositorio extends CrudRepository<Product, Integer> {



    //List<Product> findByName(String name);
}
