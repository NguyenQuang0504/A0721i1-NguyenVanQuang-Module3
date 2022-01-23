package model;

public class LevelEmployee {
    private Integer idLevel;
    private String nameLevel;

    public LevelEmployee(Integer idLevel, String nameLevel) {
        this.idLevel = idLevel;
        this.nameLevel = nameLevel;
    }

    public LevelEmployee() {
    }

    public Integer getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(Integer idLevel) {
        this.idLevel = idLevel;
    }

    public String getNameLevel() {
        return nameLevel;
    }

    public void setNameLevel(String nameLevel) {
        this.nameLevel = nameLevel;
    }
}
