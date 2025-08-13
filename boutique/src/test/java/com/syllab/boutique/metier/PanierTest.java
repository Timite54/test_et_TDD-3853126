package com.syllab.boutique.metier;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PanierTest {
  @Test
  void ajout_1Produit() {
    // Arranger le test c'est à dire le preparer
    Produit p1 = new Produit("AT11", "Cahier", 8);
    Produit p2 = new Produit("AT12", "Ciment", 7);
    Panier panier = new Panier();

 
    // Action qu'on veut tester 
    panier.ajouter(p1, 3);
    panier.ajouter(p2, 4);

    // Assertion pour verifier si les actions 
    // ont bien eu les consequences qu'on attendait
    assertEquals(52, panier.getPrixTotal());
    // assertEquals(28, panier.getPrixTotal());
  }
}
