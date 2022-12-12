package api;

import java.util.Objects;

public class Owner {
    private String name,surname,nickName,password;

    public Owner(String name, String surname, String nickName, String password) {
        this.name = name;
        this.surname = surname;
        this.nickName = nickName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickName() {
        return nickName;
    }

    public boolean isName(String name) {
        return name.equals(this.name);
    }

    public boolean isPassword(String password) {
        return password.equals(this.password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(name, owner.name) && Objects.equals(surname, owner.surname) && Objects.equals(nickName, owner.nickName);
    }

}