package fr.afpa.shapes;

// Ajouter ICI l'interface "Shape"
// pour apprendre à déclarer une interface -> https://gayerie.dev/epsi-b3-java/langage_java/interface.html

// Déclaration de l'interface Shape avec deux méthodes abstraites pour calculer le périmètre et l'aire
public interface Shape {
    double calculatePerimeter(); // Méthode pour calculer le périmètre de la forme
    double calculateArea(); // Méthode pour calculer l'aire de la forme
}