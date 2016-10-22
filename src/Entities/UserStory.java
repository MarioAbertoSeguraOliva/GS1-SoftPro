/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juancarlos
 */
@Entity
@Table(name = "USER_STORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserStory.findAll", query = "SELECT u FROM UserStory u"),
    @NamedQuery(name = "UserStory.findByUsIdA", query = "SELECT u FROM UserStory u WHERE u.usIdA = :usIdA"),
    @NamedQuery(name = "UserStory.findByUsId", query = "SELECT u FROM UserStory u WHERE u.usId = :usId"),
    @NamedQuery(name = "UserStory.findByUsName", query = "SELECT u FROM UserStory u WHERE u.usName = :usName"),
    @NamedQuery(name = "UserStory.findByUsBody", query = "SELECT u FROM UserStory u WHERE u.usBody = :usBody"),
    @NamedQuery(name = "UserStory.findByCost", query = "SELECT u FROM UserStory u WHERE u.cost = :cost"),
    @NamedQuery(name = "UserStory.findByDeadline", query = "SELECT u FROM UserStory u WHERE u.deadline = :deadline")})
public class UserStory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "US_ID_A")
    private Integer usIdA;
    @Basic(optional = false)
    @Column(name = "US_ID")
    private String usId;
    @Basic(optional = false)
    @Column(name = "US_NAME")
    private String usName;
    @Basic(optional = false)
    @Column(name = "US_BODY")
    private String usBody;
    @Basic(optional = false)
    @Column(name = "COST")
    private int cost;
    @Column(name = "DEADLINE")
    private String deadline;

    public UserStory() {
    }

    public UserStory(Integer usIdA) {
        this.usIdA = usIdA;
    }

    public UserStory(Integer usIdA, String usId, String usName, String usBody, int cost) {
        this.usIdA = usIdA;
        this.usId = usId;
        this.usName = usName;
        this.usBody = usBody;
        this.cost = cost;
    }

    public Integer getUsIdA() {
        return usIdA;
    }

    public void setUsIdA(Integer usIdA) {
        this.usIdA = usIdA;
    }

    public String getUsId() {
        return usId;
    }

    public void setUsId(String usId) {
        this.usId = usId;
    }

    public String getUsName() {
        return usName;
    }

    public void setUsName(String usName) {
        this.usName = usName;
    }

    public String getUsBody() {
        return usBody;
    }

    public void setUsBody(String usBody) {
        this.usBody = usBody;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usIdA != null ? usIdA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserStory)) {
            return false;
        }
        UserStory other = (UserStory) object;
        if ((this.usIdA == null && other.usIdA != null) || (this.usIdA != null && !this.usIdA.equals(other.usIdA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.UserStory[ usIdA=" + usIdA + " ]";
    }

}
