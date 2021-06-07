public class Vehicle {
    public int vid;
    public String vehicleName;

    //calculate no of wheels
    public int NoOfWheels()
    {
        int wheels=0;
        if (vehicleName =="Car" )
        {
            wheels = 4;
        }
        else if (vehicleName =="Bike")
            {
                wheels =2;
            }
        else
            {
                System.out.println("It is not a vehicle");
            }

        return wheels;

        }

            }




