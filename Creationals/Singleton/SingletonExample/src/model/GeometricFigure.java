package model;

public class GeometricFigure {

    public Double height = 5.0;
    public Double width = 3.5;

    private static GeometricFigure instance;

    private GeometricFigure(){

    }

    public static GeometricFigure getInstance(){
        if(instance == null)
            instance = new GeometricFigure();
        return instance;
    };

}
