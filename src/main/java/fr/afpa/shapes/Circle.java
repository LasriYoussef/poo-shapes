package fr.afpa.shapes;

// Implémenter la classe Circle

// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs

// Déclaration de la classe Circle qui implémente l'interface Shape
public class Circle implements Shape {
    // Attribut pour le rayon du cercle
    private double radius;

    // Constructeur pour initialiser l'attribut rayon
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getters et setters pour l'attribut rayon
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Méthode toString : Cette méthode renvoie une chaîne de caractères
    // représentant l'objet Circle. Elle inclut les informations sur le rayon, le
    // périmètre et l'aire du cercle
    // La méthode toString permet de représenter l'objet sous une forme lisible par
    // l'humain, ce qui facilite le débogage et la compréhension du contenu de
    // l'objet
    // Implémentation de la méthode toString pour fournir une représentation
    // textuelle de l'objet
    @Override
    public String toString() {
        return " Circle { " 
                + " radius = " + radius 
                + ", perimeter = " + calculatePerimeter() 
                + ", area = " + calculateArea() +
                '}';
    }

    // Implémentation de la méthode calculatePerimeter pour calculer le périmètre du
    // cercle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Formule : 2 * π * rayon
    }

    // Implémentation de la méthode calculateArea pour calculer l'aire du cercle
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2); // Formule : π * rayon^2
    }

}
