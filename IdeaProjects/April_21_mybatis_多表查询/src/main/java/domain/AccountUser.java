package domain;

public class AccountUser extends Account{
    private String username;
    private Integer id;

    @Override
    public String toString() {
        return super.toString()+ "AccountUser{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    private   String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
