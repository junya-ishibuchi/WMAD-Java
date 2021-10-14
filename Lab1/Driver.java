package Lab1;

public class Driver {
    public static void main(String[] args) {

        Model jhonDoe = new Model();
        jhonDoe.printDetails();

        Model susan = new Model("Susan", "Smith", 70, 120, false, true);
        susan.printDetails();

        Model tiger = new Model("Tiger", "Woods", 72, 190);
        tiger.printDetails();

        Model jhon = new Model("Jhon", "Connor", 40, 120, true, false);
        jhon.displayModelDetails();
        jhon.setHeight(4, 3);
        jhon.displayModelDetails();

        Model sarah = new Model("Sarah", "Connor", 72, 80.5, false, true);
        sarah.displayModelDetails();
        System.out.println(sarah.getWeightKg());
        sarah.setWeight((long)38.0);
        System.out.println(sarah.getWeightKg());

        // Error cases:
        Model t800 = new Model("T", "800", 72, 80);
        Model arnoldT800 = new Model("Arnold", "T", 72, 80);
        Model t1000 = new Model("Crazy", "Guy", 23, 80);
        Model tx = new Model("Crazy", "Guy", 23, 10);
    }
}