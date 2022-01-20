package model;

public class TypeService {
    private Integer idTypeService;
    private String typeService;

    public TypeService(Integer idTypeService, String typeService) {
        this.idTypeService = idTypeService;
        this.typeService = typeService;
    }

    public TypeService() {
    }

    public Integer getIdTypeService() {
        return idTypeService;
    }

    public void setIdTypeService(Integer idTypeService) {
        this.idTypeService = idTypeService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
}
