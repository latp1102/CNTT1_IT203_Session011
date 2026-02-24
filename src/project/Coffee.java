package project;

public class Coffee extends Drink {
    private boolean hasMilk;

    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    @Override
    public double calculatePrice() {
        if(hasMilk){
            return getPrice() + 5000;
        }else {
            return getPrice();
        }

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if(hasMilk){
            System.out.println("Có sữa");
        }else {
            System.out.println("Đen đá");
        }
    }
}
