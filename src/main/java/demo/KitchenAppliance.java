package demo;

public class KitchenAppliance extends MajorAppliance{

    //Set keyword
    public String[] getKeyword(){
        String[] keyword = {"KitchenAppliance"};
        return keyword;
    }

    //Set de hierarchy
    public int getHierarchy(){
        return 2;
    }
}
