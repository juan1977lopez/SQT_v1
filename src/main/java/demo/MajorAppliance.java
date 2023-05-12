package demo;

public class MajorAppliance extends HomeAppliance{

    //Set keyword
    public String[] getKeyword(){
        String[] keyword = {"MajorAppliance"};
        return keyword;
    }

    //Set de hierarchy
    public int getHierarchy(){
        return 1;
    }
}
