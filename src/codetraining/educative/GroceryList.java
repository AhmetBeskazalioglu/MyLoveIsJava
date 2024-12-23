package codetraining.educative;

public class GroceryList {
    //Declare member variables here
    int numberOfItems;
    String[] items;

    public GroceryList() {
        //Add necessary initializations here
        numberOfItems=0;
        items=new String[20];
    }

    public void insertItem(String item){
        //Add function logic
        items[numberOfItems]=item;
        numberOfItems++;
    }

    public void printList(){
        //Add function logic
        for(String str:items) {
            if (str != null)System.out.println(str);
        }
    }

    public static void main(String[] args) {
        GroceryList myList = new GroceryList();
        myList.insertItem("Apple");
        myList.insertItem("Banana");
        myList.insertItem("Carrot");
        myList.printList();
    }
}
