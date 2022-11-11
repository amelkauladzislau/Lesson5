import java.util.Scanner;

public class SalesMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Машина заехала на заправку
        Car newClient = new Car();
        Station Station = new Station();

        //Узнаем имя водителя
        System.out.println("Представтесь пожалуйста!");
        newClient.setName(sc.nextLine());

        //Предлагаем услугу
        System.out.println("Приветствую " + newClient.getName() + ". Вам нужно заправится?\n1-ДА\n2-НЕТ");

            newClient.setNeedFuel(sc.nextLine());

            //Заправляемся
            if (newClient.getNeedFuel().equalsIgnoreCase("1")) {
                System.out.println("Чем нужно заправиться?");
                //Узнаем тип топлива
                newClient.setfuelType(sc.nextLine());
                    //Направляем клиента
                    System.out.println(Station.getDirection(newClient.getfuelType()));
            //Не заправляемся
            } else if (newClient.getNeedFuel().equalsIgnoreCase("2")) {
                System.out.println("Давайте просто поболтаем");
            }




    }
}
