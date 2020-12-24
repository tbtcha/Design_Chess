package People;

import enums.AccountStatus;

public class Account {
    private int id;
    private String password;
    private AccountStatus status;

    public Account(int id, String password, AccountStatus status) {
        this.id = id;
        this.password = password;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    boolean resetPassword(){
        return true;
    }

}
