package Planes;

import java.util.Objects;

public class PassengerPlane extends Plane{

    private int passengersCapacity;

    public PassengerPlane(String planeModel, int maximumSpeed, int maximumFlightDistance, int maximumLoadCapacity, int passengersCapacity) {
        super(planeModel, maximumSpeed, maximumFlightDistance, maximumLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {

        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                        '}');
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof PassengerPlane)) return false;
        if (!super.equals(object)) return false;
        PassengerPlane plane = (PassengerPlane) object;
        return passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}
