/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shop.user.administrator;

/**
 *
 * @author Egor
 */
public class Administrator  implements IUser {

    private String login;
    private String password;
    private String name;
    private int id;
    private int age;

    private static int numberOfAdmins = 0;

    public Administrator(String login, String password, String name, int age) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.age = age;

        id = ++numberOfAdmins;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }




}
