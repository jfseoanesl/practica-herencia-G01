
package test;

import modelo.*;

public class Test {
    public static void main(String[] args) {
        
        Person p = new Person(123, "Jairo", "Seoanes", 25);
        System.out.println(p.retornarDatos());
        
        Doctor d = new Doctor(234, "Elkin", "Patarroyo", 60, "Patologo","HEAD");
        System.out.println(d.retornarDatos());
        
        Teacher t = new Teacher(456, "Braulio", "Barrios", 40, "Sistemas", "Unicesar");
        System.out.println(t.retornarDatos());
    }
}
