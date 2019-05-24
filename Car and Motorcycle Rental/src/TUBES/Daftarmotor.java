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
@Table(name = "daftarmotor", catalog = "tubesalpro", schema = "")
@NamedQueries({
    @NamedQuery(name = "Daftarmotor.findAll", query = "SELECT d FROM Daftarmotor d")
    , @NamedQuery(name = "Daftarmotor.findByIdMotor", query = "SELECT d FROM Daftarmotor d WHERE d.idMotor = :idMotor")
    , @NamedQuery(name = "Daftarmotor.findByNMotor", query = "SELECT d FROM Daftarmotor d WHERE d.nMotor = :nMotor")
    , @NamedQuery(name = "Daftarmotor.findByTahunMotor", query = "SELECT d FROM Daftarmotor d WHERE d.tahunMotor = :tahunMotor")
    , @NamedQuery(name = "Daftarmotor.findByJumlahMotor", query = "SELECT d FROM Daftarmotor d WHERE d.jumlahMotor = :jumlahMotor")})
public class Daftarmotor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_motor")
    private Integer idMotor;
    @Column(name = "n_motor")
    private String nMotor;
    @Column(name = "tahun_motor")
    private Integer tahunMotor;
    @Column(name = "jumlah_motor")
    private Integer jumlahMotor;

    public Daftarmotor() {
    }

    public Daftarmotor(Integer idMotor) {
        this.idMotor = idMotor;
    }

    public Integer getIdMotor() {
        return idMotor;
    }

    public void setIdMotor(Integer idMotor) {
        Integer oldIdMotor = this.idMotor;
        this.idMotor = idMotor;
        changeSupport.firePropertyChange("idMotor", oldIdMotor, idMotor);
    }

    public String getNMotor() {
        return nMotor;
    }

    public void setNMotor(String nMotor) {
        String oldNMotor = this.nMotor;
        this.nMotor = nMotor;
        changeSupport.firePropertyChange("NMotor", oldNMotor, nMotor);
    }

    public Integer getTahunMotor() {
        return tahunMotor;
    }

    public void setTahunMotor(Integer tahunMotor) {
        Integer oldTahunMotor = this.tahunMotor;
        this.tahunMotor = tahunMotor;
        changeSupport.firePropertyChange("tahunMotor", oldTahunMotor, tahunMotor);
    }

    public Integer getJumlahMotor() {
        return jumlahMotor;
    }

    public void setJumlahMotor(Integer jumlahMotor) {
        Integer oldJumlahMotor = this.jumlahMotor;
        this.jumlahMotor = jumlahMotor;
        changeSupport.firePropertyChange("jumlahMotor", oldJumlahMotor, jumlahMotor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMotor != null ? idMotor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Daftarmotor)) {
            return false;
        }
        Daftarmotor other = (Daftarmotor) object;
        if ((this.idMotor == null && other.idMotor != null) || (this.idMotor != null && !this.idMotor.equals(other.idMotor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TUBES.Daftarmotor[ idMotor=" + idMotor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
