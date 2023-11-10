
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Toymachine toymachine = new Toymachine();
    public Controller(){};
    public void start(){
    Toy toy1 = new Toy(1,"мишка", 5);
    Toy toy2 = new Toy(2,"машинка",3);
    Toy toy3 = new Toy(3,"матрешка" ,2);
    Toy toy4 = new Toy(4,"пистолет" ,1);
    Toy toy5 = new Toy(5,"самолет" ,1);
    ArrayList <Toy> toys = new ArrayList<>(List.of(toy1,toy2,toy3,toy4,toy5));
    Scanner scan = new Scanner(System.in);
    System.out.println("Автомат с игрушками! Играем? Введите 1, для игры или другое число чтобы выйти.");
    int a = scan.nextInt();
    while(a==1){
        toys = toymachine.raffle(toys);
        System.out.println("Автомат с игрушками! Играем? Введите 1, для игры или другое число чтобы выйти.");
        a = scan.nextInt();
        
    }



    }
}
