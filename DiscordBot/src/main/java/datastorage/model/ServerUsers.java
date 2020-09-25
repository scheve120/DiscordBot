package datastorage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServerUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Setting database ids

    private Integer userid;   // Store userids
    private String username;  // Store username

    public ServerUsers () {    }

    public void setServerUserData(ServerUsers user) {
        setUserid(user.userid);
        setUsername(user.username);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
