package javamodules.accessmodifier.a.suba;

import javamodules.accessmodifier.a.Access_Modifier;

public class Example_Package_Class {
    void test(){
        Access_Modifier obj= new Access_Modifier();
        // obj.show();  // 'show()' is not public in 'javamodules.accessmodifier.a.Access_Modifier'. Cannot be accessed from outside package
    }
}
