package vehicle;

public class Outer {

    private String colour;

    private String tire_brand;

    private int tire_sizes;



    public Outer(String colour, String tire_brand, int tire_sizes){
        this.colour = colour;
        this.tire_brand = tire_brand;
        this.tire_sizes = tire_sizes;
    }


    public void drive_the_car(){
        System.out.println("Gear to D and hit the gas...");
    }

    public String getcolour(){
        return colour;
    }

    public String gettire_brand(){
        return tire_brand;
    }

    public int gettire_sizes(){
        return tire_sizes;
    }


    public void setcolour(String colour){
        this.colour = colour;
    }

    public void settire_brand(String tire_brand){
        this.tire_brand = tire_brand;
    }

    public void settire_sizes(int tire_sizes){
        this.tire_sizes = tire_sizes;
    }



}
