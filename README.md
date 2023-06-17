# Mon Projet

## Description
Ce projet est une application de gestion de comptes bancaires réalisée avec Spring Boot et Angular. Elle permet aux utilisateurs de gérer leurs comptes, d'effectuer des transactions et de suivre l'historique de leurs opérations bancaires. L'application est conçue pour offrir une expérience utilisateur conviviale et sécurisée.

## Fonctionnalités

L'application de gestion de comptes bancaires offre les fonctionnalités suivantes :

1. Gestion des utilisateurs :
   - Création de nouveaux utilisateurs avec des informations telles que le nom, l'adresse e-mail et le mot de passe.
   - Authentification et autorisation des utilisateurs pour garantir l'accès sécurisé aux fonctionnalités de l'application.
   - Gestion des profils utilisateur et des rôles.

2. Gestion des comptes :
   - Création de comptes courants et d'épargne pour les utilisateurs.
   - Consultation des informations de compte, y compris le solde actuel et les détails du titulaire.
   - Possibilité de mettre à jour les informations du compte, telles que le nom du titulaire, l'adresse et les coordonnées.
   - Visualisation de l'historique des transactions du compte.

3. Transactions bancaires :
   - Réalisation de dépôts et de retraits sur les comptes.
   - Virements entre comptes.
   - Gestion des bénéficiaires pour faciliter les transferts d'argent réguliers.

4. Sécurité :
   - Authentification basée sur des identifiants uniques pour chaque utilisateur.
   - Protection contre les attaques de force brute et les vulnérabilités connues.
   - Autorisation basée sur les rôles pour contrôler l'accès aux fonctionnalités sensibles.

5. Interface utilisateur conviviale :
   - Interface moderne et intuitive pour une navigation facile.
   - Présentation claire des informations de compte et des opérations bancaires.
   - Réactivité pour une expérience utilisateur cohérente sur différents appareils.

## Installation

Suivez les étapes ci-dessous pour installer et exécuter le projet de gestion de comptes bancaires :

1. Clonez le dépôt du projet sur votre machine locale :

   ```
   git clone https://github.com/MarshelD/E_Bank
   ```

2. Accédez au dossier backend :

   ```
   cd backend
   ```

3. Importez le projet backend dans votre IDE préféré, tel que Eclipse ou IntelliJ.

4. Exécutez le projet backend en cliquant sur le bouton "Run" de votre IDE.
   Note : Assurez-vous d'avoir correctement configuré votre environnement Java et Maven pour exécuter un projet Spring Boot.

5. Accédez au dossier frontend :

   ```
   cd ../frontend
   ```

6. Installez les dépendances nécessaires :

   ```
   npm install
   ```

7. Lancez l'application frontend :

   ```
   npm start
   ```

   Note : Assurez-vous d'avoir Node.js et Angular CLI installés sur votre machine pour exécuter l'application frontend.

## Structure du Projet

Le projet est organisé de la manière suivante :

- **backend** : contient le code source et les fichiers de configuration du backend développé avec Spring Boot
