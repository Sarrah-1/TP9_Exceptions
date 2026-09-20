# ⚠️ TP 9 : Gestion des Exceptions et Journalisation en Java

Ce dépôt contient la résolution du TP 9 axé sur la gestion des erreurs et la robustesse en Java via le mécanisme des exceptions, l'utilisation de `try-with-resources` et la journalisation.

##📝 Résumé des Exercices
# Exercice 1 : Calculatrice sécurisée

Concepts : Traitement des exceptions runtime (ArithmeticException), gestion via bloc try-catch-finally.

# Exercice 2 : Lecture d’un fichier de nombres

Concepts : Fermeture automatique des flux avec try-with-resources, capture multi-exceptions (IOException, NumberFormatException).

# Exercice 3 : Validation d’utilisateur

Concepts : Création d'une exception contrôlée (checked exception) personnalisée InvalidUserException et propagation (throws).

# Exercice 4 : Journalisation des erreurs

Concepts : Écriture des stack traces et messages d'erreur dans un fichier journal (error.log) en mode append sans stopper l'exécution du programme.
## 🛠️ Structure du Projet

```text
TP9_Exceptions/
├── src/
│   └── com.example.tp/
│       ├── Calculator.java           (Ex 1 : Calculatrice sécurisée)
│       ├── MainCalc.java
│       ├── FileUtil.java             (Ex 2 : Lecture de fichier & parsing)
│       ├── MainFile.java
│       ├── InvalidUserException.java (Ex 3 : Exception personnalisée)
│       ├── User.java
│       ├── LoggerUtil.java           (Ex 4 : Journalisation des erreurs)
│       └── MainUser.java
├── numbers.txt
├── error.log                         (Généré lors des erreurs)
└── README.md 
````

## 👩‍💻 Auteure
* **Sara OUADAY**
