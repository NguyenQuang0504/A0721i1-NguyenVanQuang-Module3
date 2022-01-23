package model;

public class RentalType {
    private Integer idRentalType;
    private String nameRentalType;

    public RentalType(Integer idRentalType, String nameRentalType) {
        this.idRentalType = idRentalType;
        this.nameRentalType = nameRentalType;
    }

    public RentalType() {
    }

    public Integer getIdRentalType() {
        return idRentalType;
    }

    public void setIdRentalType(Integer idRentalType) {
        this.idRentalType = idRentalType;
    }

    public String getNameRentalType() {
        return nameRentalType;
    }

    public void setNameRentalType(String nameRentalType) {
        this.nameRentalType = nameRentalType;
    }
}
