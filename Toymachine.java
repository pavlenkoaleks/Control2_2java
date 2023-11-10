import java.util.ArrayList;
import java.util.Random;

public class Toymachine implements Toyraffle {

    public ArrayList <Toy> raffle (ArrayList <Toy> toylist){
        int sum = 0;

        for (int index = 0; index < toylist.size(); index++) {
            sum+=(toylist.get(index)).getquantity(); //получаем количество всех игрушек
        }
        if (sum!=0){
        Random r = new Random();
        int x = r.nextInt(sum)+1; // получаем номер случайной игрушки, которую достаем 
       // System.out.println("sum = "+sum+", x ="+x); проверка количества игрушек
       

        int count = (toylist.get(0)).getquantity();
        int index=0;
        if(x<count) { System.out.println("Вы выиграли игрушку:"+toylist.get(index).getname());}
        else{
            while(count<x)
               {index++;
                count +=toylist.get(index).getquantity();} // поиск игрушки с данным номером 
            System.out.println("Вы выиграли игрушку:"+toylist.get(index).getname());}

        if(toylist.get(index).getquantity()==1){ toylist.remove(index);} // удаление выигранной игрушки из массива
        else{toylist.get(index).quantity--;}

        return toylist;}
        else{System.out.println("Автомат с игрушками пустой! Обратитесь к администратору!");return toylist;}

    }
}