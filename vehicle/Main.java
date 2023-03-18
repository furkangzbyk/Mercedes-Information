package vehicle;

public class Main {
    public static void main(String[] args) {

      General general = new General("Mercedes", 2015, "E63 AMG", 6.3, "Gasoline",300);

      Outer outer = new Outer("Gray", "Michael", 255/35/19); //Front tire sizes!!!!

        vehicle vehicle = new vehicle(general, outer);


        vehicle.getgeneral().start_the_car();
        vehicle.getouter().drive_the_car();



    }
}