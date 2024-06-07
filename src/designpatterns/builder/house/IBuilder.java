package designpatterns.builder.house;

// Builder interface
public interface IBuilder {
    void buildBasement();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    House getHouse();
}

