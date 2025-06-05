Cette application web a été développée dans le cadre d’un projet pédagogique. Elle permet de gérer une liste de produits à travers une interface web, en utilisant les technologies Spring Boot, Spring Data JPA, Hibernate, Spring Security, Thymeleaf et Bootstrap.

L’objectif principal était de mettre en œuvre une application CRUD complète avec une interface utilisateur responsive, la validation des données et un système d’authentification sécurisé.

*Technologies utilisées
Java 21
Spring Boot
Spring Data JPA
Hibernate
Spring Web
Spring Security
Spring Validation
H2 Database (pour les tests)
MySQL (pour la base de données principale)
Thymeleaf (moteur de templates HTML)
Bootstrap 5 (pour le design)
Lombok
![image](https://github.com/user-attachments/assets/9b4e69dd-21b8-4a85-b02f-28bf4138efef)

*Fonctionnalités implémentées
1. CRUD Produit
Afficher la liste des produits
![image](https://github.com/user-attachments/assets/950110f2-55c1-4ef2-ad04-a6e1f96a762a)

Ajouter un produit avec validation (nom, prix, quantité, etc.)
![image](https://github.com/user-attachments/assets/f290c2b4-f237-4844-816a-07e0d850ec3f)

Supprimer un produit
Éditer / mettre à jour un produit

3. Interface utilisateur
Pages Thymeleaf avec layouts et Bootstrap

![image](https://github.com/user-attachments/assets/21af1613-aafd-4ac7-809d-884b3ecc1b30)

Système de formulaire avec validation
![image](https://github.com/user-attachments/assets/7d0dd8ba-1226-4c36-acd7-8329aed1ce9d)


4. Sécurité
Intégration de Spring Security
Système de login sécurisé
![image](https://github.com/user-attachments/assets/1e21065d-7556-4939-8de8-31f60de2a85e)

Accès restreint aux pages CRUD
![image](https://github.com/user-attachments/assets/573f2acc-23bb-4478-8e7c-c1059063d688)

*Fonctionnalités supplémentaires
Recherche des produits par mot-clé
Édition d’un produit existant
Tests
Test de la couche DAO avec H2 Database
Vérification du fonctionnement des opérations CRUD

*Configuration
Application configurée pour fonctionner avec MySQL
Un profil H2 est également disponible pour les tests rapides
