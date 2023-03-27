package Coordinate_extension;

public class LabelePoint extends Point{
    private String label;

    public LabelePoint(String x_coordinate, String y_coordinate, String label) {
        super(x_coordinate, y_coordinate);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    public void info(){
        System.out.println(label + getX_coordinate() + ',' + getY_coordinate());
    }
}
