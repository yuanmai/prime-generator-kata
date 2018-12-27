package distance;

public class PointUtil {

    /*
        distance = point1.distanceFrom(point2)
     */
    public static double distanceBetween(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

}
