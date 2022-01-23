package model;

public class Service {
    private Integer id;
    private String name;
    private Integer area;
    private Double cost;
    private Integer numPeople;
    private String standard;
    private String convinient;
    private Integer numFloor;
    private TypeService typeService;
    private RentalType rentalType;


    public Service(Integer id, String name, Integer area, Double cost, Integer numPeople, String standard, String convinient) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.numPeople = numPeople;
        this.standard = standard;
        this.convinient = convinient;
    }

    public Service(Integer id, String name, Integer area, Double cost, String standard, String convinient) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.standard = standard;
        this.convinient = convinient;
    }

    public Service(Integer id, String name, Integer area, Double cost, Integer numPeople, String standard, String convinient, TypeService typeService, RentalType rentalType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.numPeople = numPeople;
        this.standard = standard;
        this.convinient = convinient;
        this.typeService = typeService;
        this.rentalType = rentalType;
    }

    public Service() {
    }

    public Integer getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(Integer numFloor) {
        this.numFloor = numFloor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(Integer numPeople) {
        this.numPeople = numPeople;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getConvinient() {
        return convinient;
    }

    public void setConvinient(String convinient) {
        this.convinient = convinient;
    }

    public TypeService getTypeService() {
        return typeService;
    }

    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }
}
