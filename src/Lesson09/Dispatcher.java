package Lesson09;

/**
 * Created by intelisoft on 06.06.2016.
 */
public class Dispatcher implements Machine{
    private LightCar []lightCars;
    private Truck[]trucks;

    public Dispatcher(LightCar[] lightCars)
    {
        this.lightCars = lightCars;
    }

    public Dispatcher(Truck[] trucks)
    {
        this.trucks = trucks;
    }

    @Override
    public String getListLightCars()
    {
        int i=1;
        for (LightCar lightCar:lightCars){
            System.out.println(i+". Марка автомобиля: "+lightCar.getMarkName()+"; Гос номер: "+lightCar.getGovNumber()+"; Водитель: "+lightCar.getDriverWorker()+"; Пробег: "+lightCar.getRun()+"; Количество мест: "+lightCar.getNumbersOfPlaces());
            i++;
        }
        return null;
    }

    @Override
    public String getListTrucks()
    {
        int i=1;
        for(Truck truck:trucks){
            System.out.println(i+". Марка автомобиля: "+truck.getMarkName()+"; Гос номер: "+truck.getGovNumber()+"; Водитель: "+truck.getDriverWorker()+"; Пробег: "+truck.getRun()+"; Грузоподъемность: "+truck.getLoadingCapacity());
            i++;
        }
        return null;
    }

    @Override
    public int choiceOnLoadingCaparity(int c)
    {
        int i=1;
        for(Truck truck:trucks){
            if (truck.getLoadingCapacity()==c)
            {
                System.out.println(i + ". Марка автомобиля: " + truck.getMarkName() + "; Гос номер: " + truck.getGovNumber() + "; Водитель: " + truck.getDriverWorker() + "; Пробег: " + truck.getRun() + "; Грузоподъемность: " + truck.getLoadingCapacity());
                i++;
            }

        }
        return 0;
    }

    @Override
    public String getList_LC_onRun(int a)
    {
        int i=1;
        for (LightCar lightCar:lightCars){
            if (lightCar.getRun()>a)
            {
                System.out.println(i + ". Марка автомобиля: " + lightCar.getMarkName() + "; Гос номер: " + lightCar.getGovNumber() + "; Водитель: " + lightCar.getDriverWorker() + "; Пробег: " + lightCar.getRun() + "; Количество мест: " + lightCar.getNumbersOfPlaces());
                i++;
            }
        }

        return null;
    }

    @Override
    public String getList_Truck_onRun(int b)
    {
        int i=1;
        for(Truck truck:trucks){
            if (truck.getRun()>b)
            {
                System.out.println(i + ". Марка автомобиля: " + truck.getMarkName() + "; Гос номер: " + truck.getGovNumber() + "; Водитель: " + truck.getDriverWorker() + "; Пробег: " + truck.getRun() + "; Грузоподъемность: " + truck.getLoadingCapacity());
                i++;
            }

        }
        return null;
    }
}
