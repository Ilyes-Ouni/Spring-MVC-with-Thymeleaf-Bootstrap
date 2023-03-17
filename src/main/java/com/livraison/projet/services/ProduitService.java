package com.livraison.projet.services;

import com.livraison.projet.Entities.Produit;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProduitService {
    Page<Produit> getAllProduitsParPage(int page, int size);

    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();

}
