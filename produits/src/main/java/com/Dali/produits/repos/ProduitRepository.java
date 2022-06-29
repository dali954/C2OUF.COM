package com.Dali.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dali.produits.entities.Produit;

public interface ProduitRepository<Produit> extends JpaRepository<Produit, Long> {

}
