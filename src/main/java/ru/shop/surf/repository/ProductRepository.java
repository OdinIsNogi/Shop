package ru.shop.surf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shop.surf.entity.Product;
import ru.shop.surf.entity.ProductType;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    public List<Product> getProductsByProductType(ProductType type);
}
