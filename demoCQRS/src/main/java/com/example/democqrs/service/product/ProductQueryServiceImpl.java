package com.example.democqrs.service.product;

import com.example.democqrs.entity.Product;
import com.example.democqrs.repository.product.ProductQueryRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductQueryServiceImpl implements ProductQueryService {
    private final ProductQueryRepository productQueryRepository;

    @Override
    public List<Product> findByOrderByNameDesc() {
        return findByOrderByNameDesc();
    }
}
