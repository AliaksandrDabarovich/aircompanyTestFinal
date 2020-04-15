package Planes;
import models.MilitaryType;
import java.util.Objects;

public class MilitaryPlane extends Plane {

    private MilitaryType militaryType;

    public MilitaryPlane(String planeModel, int maximumSpeed, int maximumFlightDistance, int maximumLoadCapacity, MilitaryType militaryType) {
        super(planeModel, maximumSpeed, maximumFlightDistance, maximumLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getType() {

        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + militaryType +
                        '}');
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof MilitaryPlane)) return false;
        if (!super.equals(object)) return false;
        MilitaryPlane that = (MilitaryPlane) object;
        return militaryType == that.militaryType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), militaryType);
    }
}
