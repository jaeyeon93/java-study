public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand(){
        return brand;
    }

    void setBrand(String aBrand){
        brand = aBrand;
    }

    int getNumOfPickups(){
        return numOfPickups;
    }

    void setNumOfPickups(int num){
        numOfPickups = num;
    }

    boolean getRockStartUsesIt(){
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo){
        rockStarUsesIt = yesOrNo;
    }
}
