import model.GeometricFigure;

public class Main {

    public static void main(String[] args) {

        GeometricFigure objet = GeometricFigure.getInstance();

        System.out.println(objet.height);
        System.out.println(objet.width);

        objet.height += 4.6;

        System.out.println(objet.height);
        System.out.println(objet.width);


        GeometricFigure objet2 = GeometricFigure.getInstance();

        System.out.println(objet2.height);
        System.out.println(objet2.width);


        objet2.height += 0.4;

        System.out.println(objet.height);
        System.out.println(objet.width);


    }

}
