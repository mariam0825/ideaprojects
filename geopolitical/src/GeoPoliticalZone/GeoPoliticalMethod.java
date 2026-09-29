package GeoPoliticalZone;

public class GeoPoliticalMethod {

    public static GeoPolitical findZone(String state) {

         for (GeoPolitical zone : GeoPolitical.values()) {
             for (String states : zone.getState()) {
                 if (states.equalsIgnoreCase(state)) {
                     return zone;
                 }
             }
         }
        return null;
    }
}
