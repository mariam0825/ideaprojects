package GeoPoliticalZone;

import java.util.List;

public enum GeoPolitical {
    NORTHCENTRAL(List.of("Benue", "FCT","Kogi","Kwara","Nasarawa","Niger","Plateau")),
    NORTHEAST(List.of("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe")),
    NORTHWEST(List.of("Kaduna","Katsina","Kano","kebbi","Sokoto","jigawa","Zamfara")),
    SOUTHEAST(List.of("Abia","Anambra","Ebonyi","Enugu","Imo")),
    SOUTHSOUTH(List.of("Akwa-ibom","Bayelsa","Cross-River","Delta","Edo","Rivers")),
    SOUTHWEST(List.of("EKITI","Lagos","Osun","Ondo","Ogun","Oyo"));

    private List<String> states;

    public List<String> getState(){
        return states;
    }

    GeoPolitical(List<String> states){
        this.states = states;

    }
}

