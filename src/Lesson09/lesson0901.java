package Lesson09;

/**
 * Created by intelisoft on 06.06.2016.
 */
public class lesson0901 {
    public static void main(String[] args)
    {
        DriverWorker driver1=new DriverWorker("Иванов Сергей Иванович");
        LightCar car1=new LightCar("Opel","74-76AD",driver1,256000,5);
        DriverWorker driver2=new DriverWorker("Санько Петр Николаевич");
        LightCar car2=new LightCar("Ford","12-25DE",driver2,25000,9);
        DriverWorker driver5=new DriverWorker("Самайлович Петр Михайлович");
        LightCar car3=new LightCar("Renault","15-89DE",driver5,165000,4);
        DriverWorker driver6=new DriverWorker("Михайлов Михаил Петрович");
        LightCar car4=new LightCar("Pegout","58-56IA",driver6,465000,12);
        DriverWorker driver7=new DriverWorker("Меньшиков Александр Викторович");
        LightCar car5=new LightCar("Fiat","88-76AL",driver7,45000,5);


        LightCar []lightCars={car1,car2,car3,car4,car5};
        Dispatcher dispatcher1=new Dispatcher(lightCars);
        dispatcher1.getListLightCars();
        //dispatcher1.getList_LC_onRun(100000);

        DriverWorker driver3=new DriverWorker("Минико Иван Васильевич");
        Truck truck1=new Truck("Man","85-63FG",driver3,125650,20);
        DriverWorker driver4=new DriverWorker("Васильев Максим Иванович");
        Truck truck2=new Truck("Iveco","11-56AA",driver4,268650,10);
        DriverWorker driver8=new DriverWorker("Дударевич Валерий Петрович");
        Truck truck3=new Truck("МАЗ 5555","14-96BA",driver8,598650,25);
        DriverWorker driver9=new DriverWorker("Максимов Иван Викторович");
        Truck truck4=new Truck("ГАЗ","14-98IA",driver9,498650,5);
        DriverWorker driver10=new DriverWorker("Миклаш Павел Викторович");
        Truck truck5=new Truck("САЗ","77-59KA",driver10,198650,10);

        Truck []trucks={truck1,truck2,truck3,truck4,truck5};
        Dispatcher dispatcher2=new Dispatcher(trucks);
        //dispatcher2.getListTrucks();
        //dispatcher2.choiceOnLoadingCaparity(10);
        //dispatcher2.getList_Truck_onRun(150000);



    }
}
