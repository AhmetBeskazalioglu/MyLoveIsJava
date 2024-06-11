package designpatterns.builder.house;

// Client
public class Client {
    public static void main(String[] args) {
        IBuilder builder = new IglooHouseBuilder();
        HouseDirector director = new HouseDirector(builder);
        House house = director.buildHouse();
        System.out.println(house);
        System.out.println("********************************************");
        House house2 = new House();
        house2.setBasement("Ice Bars");
        house2.setStructure("Ice Walls");
        house2.setRoof("Ice Dome");
        house2.setInterior("Ice Decorations");
        System.out.println(house2);
    }
}