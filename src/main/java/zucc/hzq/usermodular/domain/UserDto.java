package zucc.hzq.usermodular.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

/**
 * @Auther: 何圳青
 * @Date: Created in 21:43 2019/1/28
 * @Description:
 * @Modified By:
 */
@Entity
public class UserDto implements Serializable {

    @Id
    @GeneratedValue
    private int userId;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "user_email", nullable = false)
    private String userEmail;
    @Column(name = "user_password", nullable = false)
    private String userPassword;
    @Column(name = "user_sex", nullable = false)
    private String userSex;
    @Column(name = "user_city", nullable = false)
    private String userCity;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }
}
