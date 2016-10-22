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
@Table(name = "USE_CASE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UseCase.findAll", query = "SELECT u FROM UseCase u"),
    @NamedQuery(name = "UseCase.findByUcIdA", query = "SELECT u FROM UseCase u WHERE u.ucIdA = :ucIdA"),
    @NamedQuery(name = "UseCase.findByUcId", query = "SELECT u FROM UseCase u WHERE u.ucId = :ucId"),
    @NamedQuery(name = "UseCase.findByUcName", query = "SELECT u FROM UseCase u WHERE u.ucName = :ucName"),
    @NamedQuery(name = "UseCase.findByCost", query = "SELECT u FROM UseCase u WHERE u.cost = :cost")})
public class UseCase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UC_ID_A")
    private Integer ucIdA;
    @Basic(optional = false)
    @Column(name = "UC_ID")
    private String ucId;
    @Basic(optional = false)
    @Column(name = "UC_NAME")
    private String ucName;
    @Basic(optional = false)
    @Column(name = "COST")
    private int cost;

    public UseCase() {
    }

    public UseCase(Integer ucIdA) {
        this.ucIdA = ucIdA;
    }

    public UseCase(Integer ucIdA, String ucId, String ucName, int cost) {
        this.ucIdA = ucIdA;
        this.ucId = ucId;
        this.ucName = ucName;
        this.cost = cost;
    }

    public Integer getUcIdA() {
        return ucIdA;
    }

    public void setUcIdA(Integer ucIdA) {
        this.ucIdA = ucIdA;
    }

    public String getUcId() {
        return ucId;
    }

    public void setUcId(String ucId) {
        this.ucId = ucId;
    }

    public String getUcName() {
        return ucName;
    }

    public void setUcName(String ucName) {
        this.ucName = ucName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ucIdA != null ? ucIdA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UseCase)) {
            return false;
        }
        UseCase other = (UseCase) object;
        if ((this.ucIdA == null && other.ucIdA != null) || (this.ucIdA != null && !this.ucIdA.equals(other.ucIdA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.UseCase[ ucIdA=" + ucIdA + " ]";
    }

}
