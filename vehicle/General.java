package vehicle;

public class General {

    private String brand;

    private int year_of_production;

    private String model;

    private double engine_capacity;

    private String fuel_type;

    private int full_speed;





    public General(String brand, int year_of_production, String model, double engine_capacity, String fuel_type, int full_speed){
        this.brand = brand;
        this.year_of_production = year_of_production;
        this.model = model;
        this.engine_capacity = engine_capacity;
        this.fuel_type = fuel_type;
        this.full_speed =full_speed;

    }



    public void start_the_car(){

        System.out.println("Start the Car...");

    }





    public String getbrand(){
        return brand;
    }

    public int getyear_of_production(){
        return year_of_production;
    }

    public String getmodel(){
        return model;
    }

    public double getengine_capacity(){
        return engine_capacity;
    }

    public String getfuel_type(){
        return fuel_type;
    }

    public int getfull_speed(){
        return full_speed;
    }



    public void setbrand(String brand){
        this.brand = brand;
    }

    public void setyear_of_production(int year_of_production){
        this.year_of_production = year_of_production;
    }

    public void setmodel(String model){
        this.model = model;
    }

    public void setengine_capacity(int engine_capacity){
        this.engine_capacity = engine_capacity;
    }

    public void setfuel_type(String fuel_type){
        this.fuel_type = fuel_type;
    }

    public void setfull_speed(int full_speed){
        this.full_speed = full_speed;
    }
}
