package com.Dali.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nadhem.produits.entities.Produit;
import com.nadhem.produits.repos.ProduitRepository;

public class ProduitServiceImpl<ProduitRepository> implements ProduitService{

	@Autowired
	ProduitRepository produitRepository;
	
	@Override
	public Produit saveProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);
		
	}

	@Override
	public Produit getProduit(Long id) {
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		
		return produitRepository.findAll();
	}

	@Override
	public <Produit> Produit saveProduit(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <Produit> Produit updateProduit(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <Produit> void deleteProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}
	
	

}
