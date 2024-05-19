package week2;

public class People {
    private String name;
    private int age;
    protected long SSN;
    private String address;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public long getSSN() { return SSN; }
    public void setSSN(long SSN) { this.SSN = SSN; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

}
