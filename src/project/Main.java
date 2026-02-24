package project;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee("001", "Bạc sỉu", 5000, true);
        drinks[1] = new FruitJuice("002", "Nước cam", 40000, 10);
        drinks[2] = null;
        for (int i =0; i < drinks.length; i++){
            if(drinks[i] == null){
                continue;
            }
            drinks[i].displayInfo();
            System.out.println("Thành tiền: " + drinks[i].calculatePrice());
            if(drinks[i] instanceof IMixable){
                IMixable mixable = (IMixable) drinks[i];
                mixable.mix();
            }
        }

    }
}
