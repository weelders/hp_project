-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 24 juin 2022 à 16:39
-- Version du serveur :  8.0.21
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `hp_project`
--

-- --------------------------------------------------------

--
-- Structure de la table `agir`
--

DROP TABLE IF EXISTS `agir`;
CREATE TABLE IF NOT EXISTS `agir` (
  `id_personnage_agir` int NOT NULL,
  `id_moral_agir` int NOT NULL,
  PRIMARY KEY (`id_personnage_agir`,`id_moral_agir`),
  KEY `id_moral_agir` (`id_moral_agir`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `attaque`
--

DROP TABLE IF EXISTS `attaque`;
CREATE TABLE IF NOT EXISTS `attaque` (
  `id_attaque` int NOT NULL AUTO_INCREMENT,
  `nom_attaque` varchar(50) NOT NULL,
  PRIMARY KEY (`id_attaque`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `attitude`
--

DROP TABLE IF EXISTS `attitude`;
CREATE TABLE IF NOT EXISTS `attitude` (
  `id_attitude` int NOT NULL AUTO_INCREMENT,
  `type_attitude` varchar(30) NOT NULL,
  PRIMARY KEY (`id_attitude`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `avoir`
--

DROP TABLE IF EXISTS `avoir`;
CREATE TABLE IF NOT EXISTS `avoir` (
  `id_personnage_avoir` int NOT NULL,
  `id_competence_avoir` int NOT NULL,
  `valeur_avoir` int DEFAULT NULL,
  PRIMARY KEY (`id_personnage_avoir`,`id_competence_avoir`),
  KEY `id_competence_avoir` (`id_competence_avoir`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `baguette`
--

DROP TABLE IF EXISTS `baguette`;
CREATE TABLE IF NOT EXISTS `baguette` (
  `id_baguette` int NOT NULL AUTO_INCREMENT,
  `taille_baguette` int NOT NULL,
  `id_flexibilite_baguette` int NOT NULL,
  `id_coeur_baguette` int NOT NULL,
  `id_bois_baguette` int NOT NULL,
  PRIMARY KEY (`id_baguette`),
  KEY `fk_baguette_bois` (`id_bois_baguette`),
  KEY `fk_baguette_coeur` (`id_coeur_baguette`),
  KEY `fk_baguette_flexibilite` (`id_flexibilite_baguette`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `bois`
--

DROP TABLE IF EXISTS `bois`;
CREATE TABLE IF NOT EXISTS `bois` (
  `id_bois` int NOT NULL AUTO_INCREMENT,
  `nom_bois` varchar(30) NOT NULL,
  PRIMARY KEY (`id_bois`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `bouche`
--

DROP TABLE IF EXISTS `bouche`;
CREATE TABLE IF NOT EXISTS `bouche` (
  `id_bouche` int NOT NULL AUTO_INCREMENT,
  `type_bouche` varchar(30) NOT NULL,
  PRIMARY KEY (`id_bouche`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `caracteristique`
--

DROP TABLE IF EXISTS `caracteristique`;
CREATE TABLE IF NOT EXISTS `caracteristique` (
  `id_caracteristique` int NOT NULL AUTO_INCREMENT,
  `nom_caracteristique` varchar(50) NOT NULL,
  PRIMARY KEY (`id_caracteristique`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `cheveux`
--

DROP TABLE IF EXISTS `cheveux`;
CREATE TABLE IF NOT EXISTS `cheveux` (
  `id_cheveux` int NOT NULL AUTO_INCREMENT,
  `coupe_cheveux` varchar(50) NOT NULL,
  `id_couleur_cheveux` int NOT NULL,
  PRIMARY KEY (`id_cheveux`),
  KEY `fk_cheveux_couleur_cheveux` (`id_couleur_cheveux`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

DROP TABLE IF EXISTS `classe`;
CREATE TABLE IF NOT EXISTS `classe` (
  `id_classe` int NOT NULL AUTO_INCREMENT,
  `nbr_classe` varchar(10) NOT NULL,
  PRIMARY KEY (`id_classe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `coeur`
--

DROP TABLE IF EXISTS `coeur`;
CREATE TABLE IF NOT EXISTS `coeur` (
  `id_coeur` int NOT NULL AUTO_INCREMENT,
  `nom_coeur` varchar(30) NOT NULL,
  PRIMARY KEY (`id_coeur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `competence`
--

DROP TABLE IF EXISTS `competence`;
CREATE TABLE IF NOT EXISTS `competence` (
  `id_competence` int NOT NULL AUTO_INCREMENT,
  `nom_competence` varchar(30) NOT NULL,
  PRIMARY KEY (`id_competence`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `corpulence`
--

DROP TABLE IF EXISTS `corpulence`;
CREATE TABLE IF NOT EXISTS `corpulence` (
  `id_corpulence` int NOT NULL AUTO_INCREMENT,
  `type_corpulence` varchar(30) NOT NULL,
  PRIMARY KEY (`id_corpulence`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `couleur_cheveux`
--

DROP TABLE IF EXISTS `couleur_cheveux`;
CREATE TABLE IF NOT EXISTS `couleur_cheveux` (
  `id_couleur_cheveux` int NOT NULL AUTO_INCREMENT,
  `nom_couleur_cheveux` varchar(30) NOT NULL,
  PRIMARY KEY (`id_couleur_cheveux`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `couleur_yeux`
--

DROP TABLE IF EXISTS `couleur_yeux`;
CREATE TABLE IF NOT EXISTS `couleur_yeux` (
  `id_couleur_yeux` int NOT NULL AUTO_INCREMENT,
  `nom_couleur_yeux` varchar(30) NOT NULL,
  PRIMARY KEY (`id_couleur_yeux`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `flexibilite`
--

DROP TABLE IF EXISTS `flexibilite`;
CREATE TABLE IF NOT EXISTS `flexibilite` (
  `id_flexibilite` int NOT NULL AUTO_INCREMENT,
  `type_flexibilite` varchar(20) NOT NULL,
  PRIMARY KEY (`id_flexibilite`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `maison`
--

DROP TABLE IF EXISTS `maison`;
CREATE TABLE IF NOT EXISTS `maison` (
  `id_maison` int NOT NULL AUTO_INCREMENT,
  `nom_maison` varchar(30) NOT NULL,
  PRIMARY KEY (`id_maison`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `moral`
--

DROP TABLE IF EXISTS `moral`;
CREATE TABLE IF NOT EXISTS `moral` (
  `id_moral` int NOT NULL AUTO_INCREMENT,
  `nom_moral` varchar(30) NOT NULL,
  PRIMARY KEY (`id_moral`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `nationnalite`
--

DROP TABLE IF EXISTS `nationnalite`;
CREATE TABLE IF NOT EXISTS `nationnalite` (
  `id_nationnalite` int NOT NULL AUTO_INCREMENT,
  `nom_nationnalite` varchar(30) NOT NULL,
  PRIMARY KEY (`id_nationnalite`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `nez`
--

DROP TABLE IF EXISTS `nez`;
CREATE TABLE IF NOT EXISTS `nez` (
  `id_nez` int NOT NULL AUTO_INCREMENT,
  `type_nez` varchar(30) NOT NULL,
  PRIMARY KEY (`id_nez`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `niveau_soc`
--

DROP TABLE IF EXISTS `niveau_soc`;
CREATE TABLE IF NOT EXISTS `niveau_soc` (
  `id_niveau_soc` int NOT NULL AUTO_INCREMENT,
  `nom_niveau_soc` varchar(30) NOT NULL,
  PRIMARY KEY (`id_niveau_soc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `parler`
--

DROP TABLE IF EXISTS `parler`;
CREATE TABLE IF NOT EXISTS `parler` (
  `id_parler` int NOT NULL AUTO_INCREMENT,
  `facon_parler` varchar(30) NOT NULL,
  PRIMARY KEY (`id_parler`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personnage`
--

DROP TABLE IF EXISTS `personnage`;
CREATE TABLE IF NOT EXISTS `personnage` (
  `id_perso` int NOT NULL AUTO_INCREMENT,
  `is_pj` tinyint(1) NOT NULL,
  `nom_perso` varchar(50) NOT NULL,
  `prenom_perso` varchar(50) NOT NULL,
  `img_perso` varchar(255) DEFAULT NULL,
  `age_perso` tinyint DEFAULT NULL,
  `etat_perso` tinyint(1) DEFAULT NULL,
  `desc_perso` text,
  `id_niveau_soc_perso` int DEFAULT NULL,
  `id_nationnalite_perso` int DEFAULT NULL,
  `id_corpulence_perso` int DEFAULT NULL,
  `id_baguette_perso` int DEFAULT NULL,
  `id_bouche_perso` int DEFAULT NULL,
  `id_nez_perso` int DEFAULT NULL,
  `id_voix_perso` int DEFAULT NULL,
  `id_parler_perso` int DEFAULT NULL,
  `id_attitude_perso` int DEFAULT NULL,
  `id_yeux_perso` int DEFAULT NULL,
  `id_cheveux_perso` int DEFAULT NULL,
  `id_regard_perso` int DEFAULT NULL,
  `id_visage_perso` int DEFAULT NULL,
  `id_classe_perso` int DEFAULT NULL,
  `id_taille_perso` int DEFAULT NULL,
  `id_sexe_perso` int DEFAULT NULL,
  `id_maison_perso` int DEFAULT NULL,
  `id_sang_perso` int DEFAULT NULL,
  PRIMARY KEY (`id_perso`),
  KEY `fk_personnage_maison` (`id_maison_perso`),
  KEY `fk_personnage_classe` (`id_classe_perso`),
  KEY `fk_personnage_corpulence` (`id_corpulence_perso`),
  KEY `fk_personnage_sang` (`id_sang_perso`),
  KEY `fk_personnage_sexe` (`id_sexe_perso`),
  KEY `fk_personnage_taille` (`id_taille_perso`),
  KEY `fk_personnage_nationnalite` (`id_nationnalite_perso`),
  KEY `fk_personnage_niveau_soc` (`id_niveau_soc_perso`),
  KEY `fk_personnage_visage` (`id_visage_perso`),
  KEY `fk_personnage_baguette` (`id_baguette_perso`),
  KEY `fk_personnage_regard` (`id_regard_perso`),
  KEY `fk_personnage_bouche` (`id_bouche_perso`),
  KEY `fk_personnage_nez` (`id_nez_perso`),
  KEY `fk_personnage_attitude` (`id_attitude_perso`),
  KEY `fk_personnage_parler` (`id_parler_perso`),
  KEY `fk_personnage_voix` (`id_voix_perso`),
  KEY `fk_personnage_yeux` (`id_yeux_perso`),
  KEY `fk_personnage_cheveux` (`id_cheveux_perso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `posseder`
--

DROP TABLE IF EXISTS `posseder`;
CREATE TABLE IF NOT EXISTS `posseder` (
  `id_personnage_posseder` int NOT NULL,
  `id_caracteristique_posseder` int NOT NULL,
  `valeur_posseder` int DEFAULT NULL,
  PRIMARY KEY (`id_personnage_posseder`,`id_caracteristique_posseder`),
  KEY `id_caracteristique_posseder` (`id_caracteristique_posseder`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `pouvoir`
--

DROP TABLE IF EXISTS `pouvoir`;
CREATE TABLE IF NOT EXISTS `pouvoir` (
  `id_personnage_pouvoir` int NOT NULL,
  `id_attaque_pouvoir` int NOT NULL,
  PRIMARY KEY (`id_personnage_pouvoir`,`id_attaque_pouvoir`),
  KEY `id_attaque_pouvoir` (`id_attaque_pouvoir`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `regard`
--

DROP TABLE IF EXISTS `regard`;
CREATE TABLE IF NOT EXISTS `regard` (
  `id_regard` int NOT NULL AUTO_INCREMENT,
  `type_regard` varchar(30) NOT NULL,
  PRIMARY KEY (`id_regard`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `rencontre`
--

DROP TABLE IF EXISTS `rencontre`;
CREATE TABLE IF NOT EXISTS `rencontre` (
  `id_personnage_rencontre` int NOT NULL,
  `id_personnage2_rencontre` int NOT NULL,
  PRIMARY KEY (`id_personnage_rencontre`,`id_personnage2_rencontre`),
  KEY `id_personnage2_rencontre` (`id_personnage2_rencontre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `sang`
--

DROP TABLE IF EXISTS `sang`;
CREATE TABLE IF NOT EXISTS `sang` (
  `id_sang` int NOT NULL AUTO_INCREMENT,
  `nom_sang` varchar(30) NOT NULL,
  PRIMARY KEY (`id_sang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `sexe`
--

DROP TABLE IF EXISTS `sexe`;
CREATE TABLE IF NOT EXISTS `sexe` (
  `id_sexe` int NOT NULL AUTO_INCREMENT,
  `type_sexe` int NOT NULL,
  PRIMARY KEY (`id_sexe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `taille`
--

DROP TABLE IF EXISTS `taille`;
CREATE TABLE IF NOT EXISTS `taille` (
  `id_taille` int NOT NULL AUTO_INCREMENT,
  `mesure_taille` int NOT NULL,
  PRIMARY KEY (`id_taille`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `visage`
--

DROP TABLE IF EXISTS `visage`;
CREATE TABLE IF NOT EXISTS `visage` (
  `id_visage` int NOT NULL AUTO_INCREMENT,
  `forme_visage` varchar(30) NOT NULL,
  PRIMARY KEY (`id_visage`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `voix`
--

DROP TABLE IF EXISTS `voix`;
CREATE TABLE IF NOT EXISTS `voix` (
  `id_voix` int NOT NULL AUTO_INCREMENT,
  `type_voix` varchar(30) NOT NULL,
  PRIMARY KEY (`id_voix`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `yeux`
--

DROP TABLE IF EXISTS `yeux`;
CREATE TABLE IF NOT EXISTS `yeux` (
  `id_yeux` int NOT NULL AUTO_INCREMENT,
  `forme_yeux` varchar(30) NOT NULL,
  `id_couleur_yeux` int NOT NULL,
  PRIMARY KEY (`id_yeux`),
  KEY `fk_yeux_couleur_yeux` (`id_couleur_yeux`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `agir`
--
ALTER TABLE `agir`
  ADD CONSTRAINT `agir_ibfk_1` FOREIGN KEY (`id_personnage_agir`) REFERENCES `personnage` (`id_perso`),
  ADD CONSTRAINT `agir_ibfk_2` FOREIGN KEY (`id_moral_agir`) REFERENCES `moral` (`id_moral`);

--
-- Contraintes pour la table `avoir`
--
ALTER TABLE `avoir`
  ADD CONSTRAINT `avoir_ibfk_1` FOREIGN KEY (`id_personnage_avoir`) REFERENCES `personnage` (`id_perso`),
  ADD CONSTRAINT `avoir_ibfk_2` FOREIGN KEY (`id_competence_avoir`) REFERENCES `competence` (`id_competence`);

--
-- Contraintes pour la table `baguette`
--
ALTER TABLE `baguette`
  ADD CONSTRAINT `fk_baguette_bois` FOREIGN KEY (`id_bois_baguette`) REFERENCES `bois` (`id_bois`),
  ADD CONSTRAINT `fk_baguette_coeur` FOREIGN KEY (`id_coeur_baguette`) REFERENCES `coeur` (`id_coeur`),
  ADD CONSTRAINT `fk_baguette_flexibilite` FOREIGN KEY (`id_flexibilite_baguette`) REFERENCES `flexibilite` (`id_flexibilite`);

--
-- Contraintes pour la table `cheveux`
--
ALTER TABLE `cheveux`
  ADD CONSTRAINT `fk_cheveux_couleur_cheveux` FOREIGN KEY (`id_couleur_cheveux`) REFERENCES `couleur_cheveux` (`id_couleur_cheveux`);

--
-- Contraintes pour la table `personnage`
--
ALTER TABLE `personnage`
  ADD CONSTRAINT `fk_personnage_attitude` FOREIGN KEY (`id_attitude_perso`) REFERENCES `attitude` (`id_attitude`),
  ADD CONSTRAINT `fk_personnage_baguette` FOREIGN KEY (`id_baguette_perso`) REFERENCES `baguette` (`id_baguette`),
  ADD CONSTRAINT `fk_personnage_bouche` FOREIGN KEY (`id_bouche_perso`) REFERENCES `bouche` (`id_bouche`),
  ADD CONSTRAINT `fk_personnage_cheveux` FOREIGN KEY (`id_cheveux_perso`) REFERENCES `cheveux` (`id_cheveux`),
  ADD CONSTRAINT `fk_personnage_classe` FOREIGN KEY (`id_classe_perso`) REFERENCES `classe` (`id_classe`),
  ADD CONSTRAINT `fk_personnage_corpulence` FOREIGN KEY (`id_corpulence_perso`) REFERENCES `corpulence` (`id_corpulence`),
  ADD CONSTRAINT `fk_personnage_maison` FOREIGN KEY (`id_maison_perso`) REFERENCES `maison` (`id_maison`),
  ADD CONSTRAINT `fk_personnage_nationnalite` FOREIGN KEY (`id_nationnalite_perso`) REFERENCES `nationnalite` (`id_nationnalite`),
  ADD CONSTRAINT `fk_personnage_nez` FOREIGN KEY (`id_nez_perso`) REFERENCES `nez` (`id_nez`),
  ADD CONSTRAINT `fk_personnage_niveau_soc` FOREIGN KEY (`id_niveau_soc_perso`) REFERENCES `niveau_soc` (`id_niveau_soc`),
  ADD CONSTRAINT `fk_personnage_parler` FOREIGN KEY (`id_parler_perso`) REFERENCES `parler` (`id_parler`),
  ADD CONSTRAINT `fk_personnage_regard` FOREIGN KEY (`id_regard_perso`) REFERENCES `regard` (`id_regard`),
  ADD CONSTRAINT `fk_personnage_sang` FOREIGN KEY (`id_sang_perso`) REFERENCES `sang` (`id_sang`),
  ADD CONSTRAINT `fk_personnage_sexe` FOREIGN KEY (`id_sexe_perso`) REFERENCES `sexe` (`id_sexe`),
  ADD CONSTRAINT `fk_personnage_taille` FOREIGN KEY (`id_taille_perso`) REFERENCES `taille` (`id_taille`),
  ADD CONSTRAINT `fk_personnage_visage` FOREIGN KEY (`id_visage_perso`) REFERENCES `visage` (`id_visage`),
  ADD CONSTRAINT `fk_personnage_voix` FOREIGN KEY (`id_voix_perso`) REFERENCES `voix` (`id_voix`),
  ADD CONSTRAINT `fk_personnage_yeux` FOREIGN KEY (`id_yeux_perso`) REFERENCES `yeux` (`id_yeux`);

--
-- Contraintes pour la table `posseder`
--
ALTER TABLE `posseder`
  ADD CONSTRAINT `posseder_ibfk_1` FOREIGN KEY (`id_personnage_posseder`) REFERENCES `personnage` (`id_perso`),
  ADD CONSTRAINT `posseder_ibfk_2` FOREIGN KEY (`id_caracteristique_posseder`) REFERENCES `caracteristique` (`id_caracteristique`);

--
-- Contraintes pour la table `pouvoir`
--
ALTER TABLE `pouvoir`
  ADD CONSTRAINT `pouvoir_ibfk_1` FOREIGN KEY (`id_personnage_pouvoir`) REFERENCES `personnage` (`id_perso`),
  ADD CONSTRAINT `pouvoir_ibfk_2` FOREIGN KEY (`id_attaque_pouvoir`) REFERENCES `attaque` (`id_attaque`);

--
-- Contraintes pour la table `rencontre`
--
ALTER TABLE `rencontre`
  ADD CONSTRAINT `rencontre_ibfk_1` FOREIGN KEY (`id_personnage_rencontre`) REFERENCES `personnage` (`id_perso`),
  ADD CONSTRAINT `rencontre_ibfk_2` FOREIGN KEY (`id_personnage2_rencontre`) REFERENCES `personnage` (`id_perso`);

--
-- Contraintes pour la table `yeux`
--
ALTER TABLE `yeux`
  ADD CONSTRAINT `fk_yeux_couleur_yeux` FOREIGN KEY (`id_couleur_yeux`) REFERENCES `couleur_yeux` (`id_couleur_yeux`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
