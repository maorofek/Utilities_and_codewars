import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class DirectionsReduction {

    public static void main(String[] args) {
        String[] directions = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"
                , "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH",
                "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "NORTH"
                , "EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST",
                "NORTH", "EAST", "NORTH", "EAST", "WEST", "WEST", "EAST", "EAST", "WEST", "SOUTH",
                "NORTH", "WEST", "SOUTH", "EAST"
        };
        String[] directions2 = {"SOUTH", "SOUTH", "NORTH", "EAST", "SOUTH", "NORTH", "EAST", "SOUTH", "NORTH", "NORTH"};

        System.out.println(Arrays.toString(dirReduc(directions2)));

    }

    //TODO
    public static String[] dirReduc(String[] arr) {
        //create set and save directions in it
        System.out.println(Arrays.toString(arr));

        int i = 0;
        boolean bool = true;
        ArrayList<String> result = Arrays.stream(arr).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        while (bool) {

            if (result.contains("NORTH") && result.contains("SOUTH")) {
                result.remove("NORTH");
                result.remove("SOUTH");
            } else if (result.contains("EAST") && result.contains("WEST")) {
                result.remove("EAST");
                result.remove("WEST");
            }
            if (!(result.contains("NORTH") && result.contains("SOUTH")) && !(result.contains("EAST") && result.contains("WEST"))) {
                bool = false;
            }
        }
        return result.toArray(new String[0]);
    }
}