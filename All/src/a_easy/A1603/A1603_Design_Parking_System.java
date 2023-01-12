package a_easy.A1603;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A1603_Design_Parking_System {
    @Test
    public void unitTest() {

        ParkingSystem obj = new ParkingSystem(2, 1, 4);
        Assertions.assertEquals(true,obj.addCar(1));
        Assertions.assertEquals(true,obj.addCar(2));
        Assertions.assertEquals(true,obj.addCar(3));
        Assertions.assertEquals(true,obj.addCar(3));
        Assertions.assertEquals(true,obj.addCar(3));
        Assertions.assertEquals(true,obj.addCar(3));
        Assertions.assertEquals(false,obj.addCar(4));
        Assertions.assertEquals(true,obj.addCar(1));


    }
}