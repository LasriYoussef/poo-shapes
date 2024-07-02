package fr.afpa.shapes;

// Implémenter la classe Rectangle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs


// Déclaration de la classe Rectangle qui implémente l'interface Shape
public class Rectangle implements Shape {
    // Attributs pour la longueur et la largeur du rectangle
    private double lenght;
    private double widht;

    // Constructeur pour initialiser les attributs longueur et largeur
    public Rectangle(double lenght, double widht) {
        this.lenght = lenght;
        this.widht = widht;
    }
    
    // Getters et setters pour les attributs longueur et largeur
    public double getLenght() {
        return lenght;
    }
    
    public void setLenght(double lenght) {
        this.lenght = widht;
    }
    
    public double getWidht() {
        return widht;
    }
    
    public void setWidht(double widht) {
        this.widht = widht;
}
// Implémentation de la méthode toString pour fournir une représentation textuelle de l'objet
// Méthode toString : Cette méthode renvoie une chaîne de caractères représentant l'objet Rectangle. Elle inclut les informations sur la longueur, la largeur, le périmètre et l'aire du rectangle
@Override
public String toString() {
    return " Rectangle { " 
            + " lenght = " + lenght 
            + ", widht = " + widht 
           +  ", perimeter = " + calculatePerimeter() 
           +  ", area = " + calculateArea() +
            '}';
}


    // Implémentation de la méthode calculatePerimeter pour calculer le périmètre du rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * lenght + 2 * widht; // Formule : 2 * (longueur + largeur)
    }
    
    // Implémentation de la méthode calculateArea pour calculer l'aire du rectangle
    @Override
    public double calculateArea() {
        return lenght * widht; // Formule : longueur * largeur
    }
    
}
