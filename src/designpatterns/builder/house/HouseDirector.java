package designpatterns.builder.house;

// Director class
public class HouseDirector {
    private IBuilder builder;

    public HouseDirector(IBuilder builder) {
        this.builder = builder;
    }

    public House buildHouse() {
        builder.buildBasement();
        builder.buildStructure();
        builder.buildRoof();
        builder.buildInterior();
        return builder.getHouse();
    }
}

