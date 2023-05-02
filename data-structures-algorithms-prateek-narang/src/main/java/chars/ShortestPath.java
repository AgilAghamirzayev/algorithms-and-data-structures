package chars;

public class ShortestPath {

    public static void main(String[] args) {
        System.out.println(shortestPath("SNNNEWE"));
    }

    public static String shortestPath(String paths) {

        int x = 0;
        int y = 0;

        for (char path: paths.toCharArray()) {
            switch (path){
                case 'N': y++; break;
                case 'S': y--; break;
                case 'E': x++; break;
                case 'W': x--; break;
            }
        }

        return checkAndAppend(x, "E", "W")
                .append(checkAndAppend(y, "N", "S"))
                .toString();
    }

    private static StringBuilder checkAndAppend(int numberOfPath, String pathA, String pathB) {
        StringBuilder result = new StringBuilder();

        if (numberOfPath >= 0) {
            while (numberOfPath-- > 0) {
                result.append(pathA);
            }
        } else {
            while (numberOfPath++ < 0) {
                result.append(pathB);
            }
        }

        return result;
    }
}
