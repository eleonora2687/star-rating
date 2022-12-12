package api;

public class User {
    private String name,surname,nickName,password;

    public User(String name, String surname, String nickName, String password) {
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


}