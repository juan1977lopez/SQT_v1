package demo;

public class LawnAndGarden extends HomeAppliance{

    //Set keyword
    public String[] getKeyword(){
        String[] keyword = {"Lawn", "Garden", "GardeningTools"};
        return keyword;
    }

    //Set de hierarchy
    public int getHierarchy(){
        return 1;
    }
}
