/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUBES;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Braga
 */
@Entity
@Table(name = "logindata", catalog = "tubesalpro", schema = "")
@NamedQueries({
    @NamedQuery(name = "Logindata.findAll", query = "SELECT l FROM Logindata l")
    , @NamedQuery(name = "Logindata.findByUFname", query = "SELECT l FROM Logindata l WHERE l.uFname = :uFname")
    , @NamedQuery(name = "Logindata.findByULname", query = "SELECT l FROM Logindata l WHERE l.uLname = :uLname")
    , @NamedQuery(name = "Logindata.findByUUname", query = "SELECT l FROM Logindata l WHERE l.uUname = :uUname")
    , @NamedQuery(name = "Logindata.findByUPass", query = "SELECT l FROM Logindata l WHERE l.uPass = :uPass")})
public class Logindata implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "u_fname")
    private String uFname;
    @Column(name = "u_lname")
    private String uLname;
    @Id
    @Basic(optional = false)
    @Column(name = "u_uname")
    private String uUname;
    @Column(name = "u_pass")
    private String uPass;

    public Logindata() {
    }

    public Logindata(String uUname) {
        this.uUname = uUname;
    }

    public String getUFname() {
        return uFname;
    }

    public void setUFname(String uFname) {
        String oldUFname = this.uFname;
        this.uFname = uFname;
        changeSupport.firePropertyChange("UFname", oldUFname, uFname);
    }

    public String getULname() {
        return uLname;
    }

    public void setULname(String uLname) {
        String oldULname = this.uLname;
        this.uLname = uLname;
        changeSupport.firePropertyChange("ULname", oldULname, uLname);
    }

    public String getUUname() {
        return uUname;
    }

    public void setUUname(String uUname) {
        String oldUUname = this.uUname;
        this.uUname = uUname;
        changeSupport.firePropertyChange("UUname", oldUUname, uUname);
    }

    public String getUPass() {
        return uPass;
    }

    public void setUPass(String uPass) {
        String oldUPass = this.uPass;
        this.uPass = uPass;
        changeSupport.firePropertyChange("UPass", oldUPass, uPass);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uUname != null ? uUname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logindata)) {
            return false;
        }
        Logindata other = (Logindata) object;
        if ((this.uUname == null && other.uUname != null) || (this.uUname != null && !this.uUname.equals(other.uUname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TUBES.Logindata[ uUname=" + uUname + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
