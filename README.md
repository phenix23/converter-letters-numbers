# README - Convertisseur Chiffres/Lettres

# Énoncé : 
Les chèques ou certains contrats par exemple, nécessitent d'écrire les montants en toute lettre.Cet exercice propose d'écrire un programme permettant d'automatiser une telle conversion.

Ce programme, écrit en Java, doit convertir un nombre entier en mots (en anglais).

Voici quelques exemples :

"245" est converti en "two hundred forty-five"
"75" est converti en "seventy-five"

**Bonus optionnel** : implémenter une API REST permettant d’effectuer la conversion.

# API - Convertisseur Chiffres/Lettres

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1%2B-brightgreen)](https://spring.io/projects/spring-boot)

## 📝 Description

Ce dépôt contient une api spring boot qui transforme:
- **Les chiffres en lettres** (ex: 123 → "one hundred twenty-three")

L'application prend en charge:
- Les nombres de 0 à 999 999 999 999
- La langue Anglais
- Ignore les valeurs négatifs et nombres avec vergule

  ![image](https://github.com/user-attachments/assets/6b3a4a1a-615e-4147-9be1-d6ecdac8de73)

## 🛠️ Technologies

- **Backend**:
  - Java 17+
  - Spring Boot 3.1+
  - Maven

- **Frontend**:
  - HTML5/CSS3
  - JavaScript 

## 🚀 Fonctionnalités

- Conversion des chiffres en lettres :
- Validation des entrées

## 🚀 Installation

### Prérequis
- JDK 17+
- Maven 3.8+
- Navigateur web moderne

1. Cloner le dépôt:
```bash
git clone https://github.com/phenix23/converter-letters-numbers.git
```

2. Lancer l'application :
```bash
mvn spring-boot:run
```

3. Accéder à l'interface :
   Ouvrir http://localhost:8080 dans votre navigateur préféré

## 📝Utilisation

### Interface web
- Saisir le nombre dans le champs dédié 
- clicker le button convert : lance la conversion du nombre en une chaine de caractère en Anglais

### API REST

-Endpoint disponible :
| Méthode | Endpoint  | Description |
|----------|----------|----------|
| POST  | /api/converter  | 	Récupère la chaine de caractère |


## 📜 License

Ce projet est sous licence MIT - voir le fichier [LICENSE](LICENSE) pour plus de détails.

## ✉️ Contact

Pour toute question: [hedahdia.faycel@gmail.com](mailto:hedahdia.faycel@gmail.com)
