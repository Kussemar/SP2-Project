public class Main {

    public static void main(String[] args) {

        System.out.println();

        Car bil1 = new GasolineCar("DA24243","Ford","Fiesta 2003",5,10);
        System.out.println(bil1);

        Car bil2 = new DieselCar("KA86863","Volvo","V70 2010",5,21,true);
        System.out.println(bil2);

        Car bil3 = new ElectricCar("YN82828","Tesla","Model 3 Long Rage",5,82,437,155);
        System.out.println(bil3);

        System.out.println();

        FleetOfCars f = new FleetOfCars();
        f.addCar(bil1);
        f.addCar(bil2);
        f.addCar(bil3);

        System.out.println(f);


        }



}