package com.Dali.produits.service;

import java.util.List;

import com.Dali.produits.entities.Produit;

public interface ProduitService {
	<Produit> Produit saveProduit(Produit p);
	<Produit> Produit updateProduit(Produit p);
	<Produit> void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	<Produit> Produit getProduit(Long id);
	<Produit> List<Produit> getAllProduits();

}
