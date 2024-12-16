package javamodules.accessmodifier.classmodifiers;

/*
 * Tablo: Java'da Class (Sınıf) Erişim Belirleyicileri
 * -----------------------------------------------------------------------------
 * |   Erişim Belirleyici   | Outer Class (Dış Sınıf) | Inner Class (İç Sınıf)   |
 * |------------------------|-------------------------|--------------------------|
 * | private                | Geçerli Değil           | Geçerli                 |
 * | protected              | Geçerli Değil           | Geçerli                 |
 * | default (package-level)| Geçerli                 | Geçerli                 |
 * | public                 | Geçerli                 | Geçerli                 |
 * -----------------------------------------------------------------------------
 */

public class CanClassBePrivate { // Outer class can't be private

    private class InnerClass { } // Inner class can be private
}

class CanClassBeProtected { // Outer class can't be protected

    protected class InnerClass { } // Inner class can be protected
}

class CanClassBeDefault { // Outer class can be default (package-level)

    class InnerClass { } // Inner class can be default
}

class CanClassBePublic { // Outer class can be public

    public class InnerClass { } // Inner class can be public
}
