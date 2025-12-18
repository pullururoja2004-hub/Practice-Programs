import java.util.*;
class Car{
    private String name;
    private String color;
    private int mileage;
    public void setData(String x,String y,int a){
        name=x;
        color=y;
        mileage=a;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getMileage(){
        return mileage;
    }
}
public class ExmapleOfCars{
    public static void main(String[] args){
        Car s=new Car();
        s.setData("bmw","white",40);
        System.out.println("The car name:"+s.getName());
        System.out.println("The car color:"+s.getColor());
        System.out.println("The car mileage:"+s.getMileage());
    }
}