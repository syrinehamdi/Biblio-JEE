-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2023 at 01:50 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `biblio`
--

-- --------------------------------------------------------

--
-- Table structure for table `emprunt`
--

CREATE TABLE `emprunt` (
  `IDEMP` int(11) NOT NULL,
  `DATEEMP` datetime DEFAULT NULL,
  `DATERETOUR` datetime DEFAULT NULL,
  `IDRES` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emprunt`
--

INSERT INTO `emprunt` (`IDEMP`, `DATEEMP`, `DATERETOUR`, `IDRES`) VALUES
(6, '2023-01-07 00:20:44', '2023-01-14 00:20:44', 2),
(7, '2023-01-08 02:23:44', '2023-01-15 02:23:44', 10),
(12, '2023-01-08 03:01:55', '2023-01-15 03:01:55', 17),
(14, '2023-01-08 03:14:17', '2023-01-15 03:14:17', 11),
(15, '2023-01-08 03:16:54', '2023-01-15 03:16:54', 19);

-- --------------------------------------------------------

--
-- Table structure for table `enseignant`
--

CREATE TABLE `enseignant` (
  `IDENS` int(11) NOT NULL,
  `GRADE` varchar(30) DEFAULT NULL,
  `DEPARTEMENT` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `enseignant`
--

INSERT INTO `enseignant` (`IDENS`, `GRADE`, `DEPARTEMENT`) VALUES
(2, 'Enseignant ', 'TSI'),
(4, 'Enseignant ', 'TSI'),
(10, 'Enseignant', 'Développement');

-- --------------------------------------------------------

--
-- Table structure for table `etudiant`
--

CREATE TABLE `etudiant` (
  `IDETUD` int(11) NOT NULL,
  `CLASSE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `etudiant`
--

INSERT INTO `etudiant` (`IDETUD`, `CLASSE`) VALUES
(1, 'M1-DSSD'),
(3, 'M2-EBusiness'),
(5, 'M2-DSSD');

-- --------------------------------------------------------

--
-- Table structure for table `livre`
--

CREATE TABLE `livre` (
  `ISBN` varchar(20) NOT NULL,
  `TITRE` varchar(100) DEFAULT NULL,
  `AUTEURS` varchar(100) DEFAULT NULL,
  `IMG` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `livre`
--

INSERT INTO `livre` (`ISBN`, `TITRE`, `AUTEURS`, `IMG`) VALUES
('L-1', 'NEUROCOMIX ', 'Matteo Farinella', '9782100810642-001-X.jpeg'),
('L-10', '10 Modèles pour comprendre l\'univers', 'Brian Clegg', '9782100835669-001-X.jpeg'),
('L-11', 'Les fils tressés de nos sentiments', 'Karl Deisseroth', '9782100835751-001-X.jpeg'),
('L-12', 'Anomalies cosmiques', 'Aurélien Barrau', '9782100836208-001-X.jpeg'),
('L-13', 'Le carnet du régleur', 'Jean-Marie Valence et Bernard Poussery', '9782100836857-001-X.jpeg'),
('L-14', 'Installations photovoltaïques - 6e édition', 'Anne Labouret, Michel Villoz, Adrien Villoz', '9782100836871-001-X.jpeg'),
('L-15', 'Magique Atome', 'Tim James', '9782100839216-001-X.jpeg'),
('L-16', 'Biochimie', 'Xavier Coumoul, Caroline Chauvet, Etienne Blanc', '9782100840502-001-X.jpeg'),
('L-17', 'Modélisation par éléments finis - 4e édition', 'JJean-Charles Craveur', '9782100840885-001-X.jpeg'),
('L-18', 'Cybersécurité - 7e édition', 'Solange Ghernaouti', '9782100841493-001-X.jpeg'),
('L-19', 'Lean UX - 2e édition', 'Jeff Gothelf, Josh Seiden', '9782100841509-001-X.jpeg'),
('L-2', 'Intelligence artificielle', 'Melanie Mitchell', '9782100813728-001-X.jpeg'),
('L-20', 'Relativité générale. L\'essentiel', 'Carlo Rovelli', '9782100842032-001-X.jpeg'),
('L-21', 'L\'univers comme vous ne l\'avez jamais vu', 'Charles LIU', '9782100842698-001-X (1).jpeg'),
('L-22', 'Les relations avec les fournisseurs IT en 40 questions', 'Philippe Rosé', '9782100842711-001-X.jpeg'),
('L-23', 'Mémo visuel de géologie - 3e édition', 'Yves Lagabrielle, René Maury, Maurice Renard', '9782100842797-001-X.jpeg'),
('L-24', 'Biostatistique - 2e édition', 'Xavier Nogues, André Garenne, Xavier Bouteiller, Virgil Fiévet', '9782100842865-001-X.jpeg'),
('L-25', 'Le Beau Livre de l\'Astronomie', 'Jim Bell', '9782100844791-001.jpeg'),
('L-26', 'Aide-mémoire - Ouvrages en béton armé - 6e édition', 'Arnaud Bury', '9782100845972-001-X.jpeg'),
('L-27', 'Calcul des probabilités - 3e édition', 'Dominique Foata, Jacques Franchi, Sinnou David', '9782100848393-001-X.jpeg'),
('L-28', 'Le cours de physique de Feynman - Mécanique 1', 'Richard Feynman, Robert Leighton, Matthew Sands', '9782100848966-001-X.jpeg'),
('L-29', 'Design graphique et stratégie de marque', 'A. George Sinclair', '9782100849253-001-X.jpeg'),
('L-3', 'CONNECTIVITE WIRELESS', 'Martine Villegas, Fabien Robert, Lucas Letailleur', '9782100817870-001-X.jpeg'),
('L-30', 'Biologie moléculaire - Licence 1 / 2 / PASS', 'Philippe Luchetta', '9782100849970-001-X.jpeg'),
('L-31', 'Les cours de Paul Arnaud - Exercices résolus de chimie organique - 5e édition', 'Paul Arnaud, Jacques Bodiguel, Nicolas Brosse, Brigitte Jamart', '9782100851249-001-X.jpeg'),
('L-32', 'Électronique. Fondements et applications - 2e édition', 'José-Philippe Pérez, Christophe Lagoute, Jean-Yves Fourniols, Stéphane Bouhours', '9782100851263-001-X.jpeg'),
('L-33', 'Optimisation des structures mécaniques', 'Pierre Gourmelen, Michael Bruyneel, Jean-Charles Craveur', '9782100851607-001-X.jpeg'),
('L-34', 'Menuiseries du bâtiment', 'David Mugniery, Cédric Pruvost', '9782100851645-001-X.jpeg'),
('L-35', 'Tout JavaScript - 3e Ã©dition', 'Olivier Hondermarck', '9782100846276-001-X.jpeg'),
('L-4', 'Exercices et méthodes de Mécanique Quantique', 'Michel Chrysos', '9782100819447-001-X.jpeg'),
('L-5', 'Cosmologie Moderne', 'P.J.E. PEEBLES', '9782100829941-001-X.jpeg'),
('L-6', 'Menuiserie, Agencement et Ebénisterie', 'Olivier Hamon, Vincent Roullat', '9782100830862-001-X.jpeg'),
('L-7', 'La data science pour modéliser les systèmes complexes', 'Alain Chautard', '9782100830879-001-X.jpeg'),
('L-8', '15 Enigmes ludiques pour s\'initier à la programmation PYTHON', 'Pascal Lafourcade et Malika Mare', '9782100834303-001-X.jpeg'),
('L-9', 'Au-delà du Bitcoin', 'Jean-Paul Delahaye', '9782100834983-001-X.jpeg');

-- --------------------------------------------------------

--
-- Table structure for table `personne`
--

CREATE TABLE `personne` (
  `IDPERS` int(11) NOT NULL,
  `NOM` varchar(25) DEFAULT NULL,
  `PRENOM` varchar(25) DEFAULT NULL,
  `EMAIL` varchar(80) DEFAULT NULL,
  `ADRESSE` varchar(100) DEFAULT NULL,
  `TELEPHONE` decimal(8,0) DEFAULT NULL,
  `LOGIN` varchar(20) DEFAULT NULL,
  `PASS` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `personne`
--

INSERT INTO `personne` (`IDPERS`, `NOM`, `PRENOM`, `EMAIL`, `ADRESSE`, `TELEPHONE`, `LOGIN`, `PASS`) VALUES
(1, 'Hamdi', 'Syrine', 'sirine.hamdi@esen.tn', 'Sidi hssine, Tunis', '55816163', 'syrinehamdi', '123456'),
(2, 'Ben Jrad', 'Eya', 'eya.benjrad@esen.tn', 'Bardo, Tunis', '22456789', 'eyabjrad', '123456'),
(3, 'Mhamdi', 'Sarah', 'sarra.mhamdi@esen.tn', 'La Marsa, Tunis', '97412569', 'sarahm', '123456'),
(4, 'Chabbeh', 'Mouna', 'mouna.chabbe@esen.tn', 'Ben Arous, Tunisie', '87654321', 'mounachabbeh', '123456'),
(5, 'G\'laa', 'Omar', 'omar.glaa@esen.tn', 'Djerba, Medenin', '21345678', 'omarglaa', '123456'),
(7, 'Arfaoui', 'Mahdi', 'mahdiarfaoui010@gmail.com', 'Zahrouni, Tunis 1095', '29587463', 'mahdiarfaoui', '123456'),
(8, 'Hamdi', 'Ahmed', 'ahmedhamdi22242142@gmail.com', 'Sidi hssine, Tunis', '22242142', 'ahmedhamdi', '123456'),
(10, 'Bousslimi', 'Riadh', 'riadh.bousslimi@esen.tn', 'Tunis, Tunisie', '12345678', 'riadhbousslimi', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `IDRES` int(11) NOT NULL,
  `DATERES` datetime DEFAULT NULL,
  `ISBN` varchar(20) NOT NULL,
  `IDPERS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`IDRES`, `DATERES`, `ISBN`, `IDPERS`) VALUES
(2, '2022-12-28 05:15:51', 'L-5', 1),
(3, '2022-12-20 05:16:59', 'L-18', 4),
(8, '2023-01-06 22:19:20', 'L-28', 4),
(10, '2023-01-07 22:57:14', 'L-28', 5),
(11, '2023-01-07 23:05:46', 'L-1', 5),
(12, '2023-01-07 23:09:03', 'L-20', 5),
(13, '2023-01-07 23:56:40', 'L-10', 5),
(14, '2023-01-08 02:12:41', 'L-16', 3),
(17, '2023-01-08 02:50:31', 'L-6', 3),
(19, '2023-01-08 03:15:35', 'L-8', 10);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `emprunt`
--
ALTER TABLE `emprunt`
  ADD PRIMARY KEY (`IDEMP`),
  ADD KEY `fk_EMPRUNT_RESERVATION1` (`IDRES`);

--
-- Indexes for table `enseignant`
--
ALTER TABLE `enseignant`
  ADD PRIMARY KEY (`IDENS`);

--
-- Indexes for table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`IDETUD`);

--
-- Indexes for table `livre`
--
ALTER TABLE `livre`
  ADD PRIMARY KEY (`ISBN`);

--
-- Indexes for table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`IDPERS`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`IDRES`),
  ADD KEY `fk_RESERVATION_Livre1` (`ISBN`),
  ADD KEY `fk_RESERVATION_Personne1` (`IDPERS`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `emprunt`
--
ALTER TABLE `emprunt`
  MODIFY `IDEMP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `IDRES` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `emprunt`
--
ALTER TABLE `emprunt`
  ADD CONSTRAINT `fk_EMPRUNT_RESERVATION1` FOREIGN KEY (`IDRES`) REFERENCES `reservation` (`IDRES`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `enseignant`
--
ALTER TABLE `enseignant`
  ADD CONSTRAINT `fk_ENSEIGNANT_Personne1` FOREIGN KEY (`IDENS`) REFERENCES `personne` (`IDPERS`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `etudiant`
--
ALTER TABLE `etudiant`
  ADD CONSTRAINT `fk_ETUDIANT_Personne` FOREIGN KEY (`IDETUD`) REFERENCES `personne` (`IDPERS`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `fk_RESERVATION_Livre1` FOREIGN KEY (`ISBN`) REFERENCES `livre` (`ISBN`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_RESERVATION_Personne1` FOREIGN KEY (`IDPERS`) REFERENCES `personne` (`IDPERS`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
