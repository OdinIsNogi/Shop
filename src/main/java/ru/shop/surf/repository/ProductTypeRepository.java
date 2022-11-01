package ru.shop.surf.repository;

import org.springframework.data.repository.CrudRepository;
import ru.shop.surf.entity.ProductType;

public interface ProductTypeRepository extends CrudRepository<ProductType, Long> {
}
