package flower;

import java.util.ArrayList;
import java.util.List;
public class Bucket {
    List<Flowers> allFlowers = new ArrayList<>();
    List<Flowers> bucketFlowers = new ArrayList<>();


    public void addFlower(Flowers flowers){ allFlowers.add(flowers); }



    public void SortBucket(String flowerName, String flowerColor) {
        for (int i = 0; i < allFlowers.size(); i++) {
            if (allFlowers.get(i).getName().compareTo(flowerName) == 0) {
                if (allFlowers.get(i).getColor().compareTo(flowerColor) == 0) {
                    bucketFlowers.add(allFlowers.get(i));
                } } }
        }


        public void ShowBucket(){
        for(int i = 0; i!=bucketFlowers.size(); i++){
            System.out.println(bucketFlowers.get(i).getColor() + " " + bucketFlowers.get(i).getName() + " " + "with price " + bucketFlowers.get(i).getPrice() + "grn");
           System.out.println(bucketFlowers.get(i).getName() + " " + bucketFlowers.get(i).getColor() + " " + bucketFlowers.get(i).getPrice());
        } }


    public int Price(){
        int priceOfBucket = 0;
        for (int i = 0; i< bucketFlowers.size(); i++) {
            priceOfBucket += bucketFlowers.get(i).getPrice(); }
        return priceOfBucket; }

    public void Freshness(){
        for(int i = 0; i!=bucketFlowers.size(); i++){
            System.out.println("Freshness of " + (i+1) + " flower is: " + bucketFlowers.get(i).getFreshness() + " days");
        }

    }

}
