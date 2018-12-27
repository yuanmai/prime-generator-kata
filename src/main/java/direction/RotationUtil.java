package direction;

public class RotationUtil {

    /*
    Direction east = Direction.North.rotateClockWise();
    Direction west = Direction.North.rotateCounterClockWise();
     */
    public static String rotate(String direction, boolean clockWise) {
        if (clockWise) {
            switch (direction) {
                case "N":
                    return "E";
                case "E":
                    return "S";
                case "S":
                    return "W";
                case "W":
                    return "N";
            }
        } else {
            switch (direction) {
                case "N":
                    return "W";
                case "W":
                    return "S";
                case "S":
                    return "E";
                case "E":
                    return "N";
            }
        }
        return null;
    }
}
