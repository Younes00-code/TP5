package ma.younes.bdcc_younes_spring_mvc.repository;

import ma.younes.bdcc_younes_spring_mvc.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
