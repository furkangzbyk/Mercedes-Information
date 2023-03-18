package vehicle;

public class vehicle {

    private General general;

    private Outer outer;





    public vehicle(General general, Outer outer){
        this.general = general;
        this.outer = outer;

    }



    public General getgeneral(){
        return general;
    }

    public Outer getouter(){
        return outer;
    }



    public void setgeneral(General general){
        this.general = general;
    }

    public void setouter(Outer outer){
        this.outer = outer;
    }


}
