
public class VceQ8 {

    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars"};
        System.out.println(planets.length);
        System.out.println(planets[1].length());
        System.out.println(planets[1].charAt(0));
        System.out.println("Venus".concat("Faraway"));

        int x= 5;

        Integer y = 5;


        String planet = new String ("Dunya ");

        System.out.println(planet.endsWith("a")); // returns true
        System.out.println(planet.trim().toLowerCase().concat("ekleme"));

        StringBuilder stringBuilder = new StringBuilder("Initial");

        stringBuilder.append("+Secondary");
        stringBuilder.append(true);
        stringBuilder.append('G');
        stringBuilder.append(777);
        System.out.println(stringBuilder);

    }

}
