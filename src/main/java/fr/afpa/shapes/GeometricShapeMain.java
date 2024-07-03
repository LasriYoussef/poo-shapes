package fr.afpa.shapes;

import java.util.ArrayList;

/*
	Objectif : développer des classes représentant des formes géométriques (Rectangle, Cercle et Triangle)
	Pour chacune de ces classes il faudra implémenter deux méthodes :
	 - une qui renverra le périmètre -> double calculatePerimeter()
	 - une qui renverra l'aire -> double calculateArea()

	Pour apprendre à implémenter une interface vous pouvez vous référer au diaporama présenté en formation
	Vous pouvez également regarder la vidéo suivante : https://www.youtube.com/watch?v=OkEwPtRaqY4

	Implémentez une classe "Rectangle" comprenant les attributs présentés sur le diagramme UML contenu dans le sous-dossier "doc"
	Le diagramme UML est sous format "uxf". Pour pouvoir le lire il vous faudra le logiciel UMLET
	UMLET est disponible à l'adresse suivante : https://www.umlet.com/

	Implémentez une classe "Circle" comme présentée par le diagramme UML

	Créez une interface nommée "Shape" comprenant deux méthodes abstraites de calcul :
	 - double calculatePerimeter()
	 - double calculateArea()

	Faites en sorte que la classe "Rectangle" implémente l'interface "Shape" et implémentez les deux méthodes 
	Rappel de calcul :
	 - perimetre_rectangle = 2 * longueur + 2 * largeur
	 - aire_rectangle = longueur * largeur

	TODO faites en sorte que la classe "Circle" implémente l'interface "Shape" et implémentez les deux méthodes
	Rappel de calcul :
	 - périmètre du cercle = 2 * π * rayon
	 - aire_cercle = π * rayon^2

	 La valeur π peut être retrouvée en Java en utilisant "Math.PI" 
	 La puissance de 2 peut être effectuée en utilisant la méthode static "pow" de la classe "Math" 
	 -> plus d'informations par ici https://codegym.cc/fr/groups/posts/fr.575.math-pi-en-java

*/
class GeometricShapeMain {
	public static void main(String[] args) {
		// Instancier plusieurs objets des classes Rectangle et Circle (2 instances de
		// chaque)

		Circle circle1 = new Circle(18);
		Circle circle2 = new Circle(36);

		Rectangle rectangle1 = new Rectangle(50, 20);
		Rectangle rectangle2 = new Rectangle(5, 10);

		// Ajouter ces objets à une instance de la classe "ArrayList"
		// plus d'information sur la classe "ArrayList" ->
		// https://info.clg.qc.ca/java/structures/array-list
		// Créer une ArrayList de type Shape
		// Création de l'ArrayList : Une instance de ArrayList de type Shape est créée.
		// Ajout des objets : Les instances des objets Circle et Rectangle sont ajoutées
		// à l'ArrayList.
		ArrayList<Shape> listShapes = new ArrayList<>();

		// Ajouter les objets à l'ArrayList
		listShapes.add(circle1);
		listShapes.add(circle2);
		listShapes.add(rectangle1);
		listShapes.add(rectangle2);

		// Boucler sur les éléments de la liste afin d'afficher le périmètre et l'aire
		// de chaque objet
		// Parcourir l'ArrayList pour afficher les périmètres et les aires
		// Parcours de l'ArrayList : Utilisation d'une boucle for-each pour parcourir
		// chaque objet de l'ArrayList et afficher le périmètre et l'aire de chaque
		// forme.
		for (Shape shape : listShapes) {
			System.out.println(" Shape: " + shape.getClass().getSimpleName());
			System.out.println(" Perimeter: " + shape.calculatePerimeter());
			System.out.println(" Area: " + shape.calculateArea());
			System.out.println();
		}
	}
}
