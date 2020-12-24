package People;

import enums.AccountStatus;

public class Admin extends Account{
    public Admin(int id, String password, AccountStatus status) {
        super(id, password, status);
    }

    public boolean blockUser(){
        setStatus(AccountStatus.Blacklisted);
        return true;
    }
}
