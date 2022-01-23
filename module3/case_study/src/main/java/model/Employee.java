package model;

public class Employee {
    private Integer id;
    private String name;
    private String dateOfBirth;
    private String cmnd;
    private double salary;
    private String phoneNum;
    private String email;
    private String address;
    private LevelEmployee levelEmployee;
    private PositionEmployee positionEmployee;
    private DepartmentEmployee departmentEmployee;

    public Employee(Integer id, String name, String dateOfBirth, String cmnd, double salary, String phoneNum, String email, String address, LevelEmployee levelEmployee, PositionEmployee positionEmployee, DepartmentEmployee departmentEmployee) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.cmnd = cmnd;
        this.salary = salary;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
        this.levelEmployee = levelEmployee;
        this.positionEmployee = positionEmployee;
        this.departmentEmployee = departmentEmployee;
    }

    public Employee() {
    }

    public Employee(Integer id, String name, String dateOfBirth, String cmnd, double salary, String phoneNum, String email, String address) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.cmnd = cmnd;
        this.salary = salary;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LevelEmployee getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(LevelEmployee levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public PositionEmployee getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(PositionEmployee positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public DepartmentEmployee getDepartmentEmployee() {
        return departmentEmployee;
    }

    public void setDepartmentEmployee(DepartmentEmployee departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }
}
