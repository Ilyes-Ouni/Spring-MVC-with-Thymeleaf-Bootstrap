package com.livraison.projet.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProduitDto {


    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String numtel;
    private String mdp;

    private boolean isLivreur;
}
