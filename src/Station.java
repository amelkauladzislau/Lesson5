public class Station {

    private String text = "Пожалуйста проезжайте ";
    private String Electric = "Прямо";
    private String Diesel = "Налево";
    private String Gas = "Направо";

    public String getDirection(String type) {
        if (type.equalsIgnoreCase("Electric")) {
            return(text+Electric);
        } else if (type.equalsIgnoreCase("Diesel")) {
            return(text+Diesel);
        } else if (type.equalsIgnoreCase("Gas")) {
            return(text+Gas);
        } else {
            return("Не понял");
        }
    }
}
