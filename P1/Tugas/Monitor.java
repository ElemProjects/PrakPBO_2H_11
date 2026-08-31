package Tugas;

public class Monitor extends Elektronik{
    private int pixel;
    private String brand;

    public int setPixel(int inputPixel){
        pixel = inputPixel;
        return pixel;
    }

    public String setBrand(String inputBrand){
        brand = inputBrand;
        return brand;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        
        System.out.println("Pixel monitor : " + pixel);
        System.out.println("Brand " + brand);
    }
}
