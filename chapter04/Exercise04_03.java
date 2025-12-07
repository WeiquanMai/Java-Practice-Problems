/**
 * @Author Weiquan Mai
 * Problem 4.3
 * (Geometry: estimate areas)
 * Use the GPS locations for
 * Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina
 * in the figure in Section 4.1 to compute the estimated area enclosed by these four cities.
 *
 * Hint: Use the formula in Programming Exercise 4.2 to compute the distance between two cities.
 * Divide the polygon into two triangles and use the formula in Programming Exercise 2.19
 * to compute the area of a triangle.
 */
public class Exercise04_03 {
    public static void main(String[] args){
        // Coordinates for Atlanta, Orlando, Savannah, and Charlotte
        double atlantaRadianX = Math.toRadians(33.7489954);
        double atlantaRadianY = Math.toRadians(-84.3879824);

        double orlandoRadianX = Math.toRadians(28.5383355);
        double orlandoRadianY = Math.toRadians(-81.3792365);

        double savannahRadianX = Math.toRadians(32.0835407);
        double savannahRadianY = Math.toRadians(-81.0998342);

        double charlotteRadianX = Math.toRadians(35.2270869);
        double charlotteRadianY = Math.toRadians(-80.8431267);

        final double EARTH_RADIUS = 6371.01;

        // Calculate great circle distance between the cities
        double atlantaToOrlando = EARTH_RADIUS * Math.acos(Math.sin(atlantaRadianX) * Math.sin(orlandoRadianX)
                + Math.cos(atlantaRadianX) * Math.cos(orlandoRadianX) * Math.cos(atlantaRadianY - orlandoRadianY));
        double orlandoToSavannah = EARTH_RADIUS * Math.acos(Math.sin(orlandoRadianX) * Math.sin(savannahRadianX)
                + Math.cos(orlandoRadianX) * Math.cos(savannahRadianX) * Math.cos(orlandoRadianY - savannahRadianY));
        double savannahToCharlotte = EARTH_RADIUS * Math.acos(Math.sin(savannahRadianX) * Math.sin(charlotteRadianX)
                + Math.cos(savannahRadianX) * Math.cos(charlotteRadianX) * Math.cos(savannahRadianY - charlotteRadianY));
        double charlotteToAtlanta = EARTH_RADIUS * Math.acos(Math.sin(charlotteRadianX) * Math.sin(atlantaRadianX)
                + Math.cos(charlotteRadianX) * Math.cos(atlantaRadianX) * Math.cos(charlotteRadianY - atlantaRadianY));
        double atlantaToSavannah = EARTH_RADIUS * Math.acos(Math.sin(atlantaRadianX) * Math.sin(savannahRadianX)
                + Math.cos(atlantaRadianX) * Math.cos(savannahRadianX) * Math.cos(atlantaRadianY - savannahRadianY));

        // Calculate the area
        double s1 = (atlantaToOrlando + orlandoToSavannah + atlantaToSavannah) / 2;
        double area1 = Math.pow((s1 * (s1 - atlantaToOrlando) * (s1 - orlandoToSavannah) * (s1 - atlantaToSavannah)), 0.5);

        double s2 = (atlantaToSavannah + savannahToCharlotte + charlotteToAtlanta) / 2;
        double area2 = Math.pow((s2 * (s2 - atlantaToSavannah) * (s2 - savannahToCharlotte) * (s2 - charlotteToAtlanta)), 0.5);

        double totalArea = area1 + area2;

        // Display result
        System.out.println("Estimated total area enclosed by ");
        System.out.println("Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina");
        System.out.println("is " + totalArea + " km^2");
    }
}
