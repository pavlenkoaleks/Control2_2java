public class Toy {
    private int toy_id;
    private String name;
    public int quantity;


    public Toy(int toy_id,String name,int quantity) {
        this.toy_id = toy_id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getid(){
        return toy_id;
    }

    public String getname(){
        return name;
    
    }

    public int getquantity(){
        return quantity;
    }

}
