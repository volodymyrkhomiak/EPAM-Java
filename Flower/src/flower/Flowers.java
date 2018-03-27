package flower;



public class Flowers {

    private String Name, Color;
    private int price, freshness;


    public Flowers(String Name, String Color, int price, int freshness){
        this.Name = Name;
        this.Color = Color;
        this.price = price;
        this.freshness = freshness;
    }

    public String getName(){return this.Name;}
    public String getColor(){return this.Color;}
    public int getPrice(){return this.price;}
    public int getFreshness(){return this.freshness;}






}