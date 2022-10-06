package com.example.democqrs.repository.product;

import com.example.democqrs.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductQueryRepository extends JpaRepository<Product, Long> {
    List<Product> findByOrderByNameDesc();

    @Query("select p from Product p where upper(p.name) like upper(?1) order by p.id")
    List<Product> findByNameLikeIgnoreCaseOrderByIdAsc(String name);


}
