package sakila.entity;
// Generated Mar 9, 2014 11:55:22 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Actor generated by hbm2java
 */
public class Actor  implements java.io.Serializable {


     private Short actorId;
     private String firstName;
     private String lastName;
     private Date lastUpdate;

    public Actor() {
    }

    public Actor(String firstName, String lastName, Date lastUpdate) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.lastUpdate = lastUpdate;
    }
   
    public Short getActorId() {
        return this.actorId;
    }
    
    public void setActorId(Short actorId) {
        this.actorId = actorId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }




}


