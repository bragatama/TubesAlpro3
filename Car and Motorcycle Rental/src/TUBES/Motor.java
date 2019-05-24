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
@Table(name = "motor", catalog = "tubesalpro", schema = "")
@NamedQueries({
    @NamedQuery(name = "Motor.findAll", query = "SELECT m FROM Motor m")
    , @NamedQuery(name = "Motor.findByIdMotor", query = "SELECT m FROM Motor m WHERE m.idMotor = :idMotor")
    , @NamedQuery(name = "Motor.findByNamaMotor", query = "SELECT m FROM Motor m WHERE m.namaMotor = :namaMotor")
    , @NamedQuery(name = "Motor.findByTahunMotor", query = "SELECT m FROM Motor m WHERE m.tahunMotor = :tahunMotor")
    , @NamedQuery(name = "Motor.findByHargaMotor", query = "SELECT m FROM Motor m WHERE m.hargaMotor = :hargaMotor")})
public class Motor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_motor")
    private Integer idMotor;
    @Basic(optional = false)
    @Column(name = "nama_motor")
    private String namaMotor;
    @Basic(optional = false)
    @Column(name = "tahun_motor")
    private int tahunMotor;
    @Basic(optional = false)
    @Column(name = "harga_motor")
    private int hargaMotor;

    public Motor() {
    }

    public Motor(Integer idMotor) {
        this.idMotor = idMotor;
    }

    public Motor(Integer idMotor, String namaMotor, int tahunMotor, int hargaMotor) {
        this.idMotor = idMotor;
        this.namaMotor = namaMotor;
        this.tahunMotor = tahunMotor;
        this.hargaMotor = hargaMotor;
    }

    public Integer getIdMotor() {
        return idMotor;
    }

    public void setIdMotor(Integer idMotor) {
        Integer oldIdMotor = this.idMotor;
        this.idMotor = idMotor;
        changeSupport.firePropertyChange("idMotor", oldIdMotor, idMotor);
    }

    public String getNamaMotor() {
        return namaMotor;
    }

    public void setNamaMotor(String namaMotor) {
        String oldNamaMotor = this.namaMotor;
        this.namaMotor = namaMotor;
        changeSupport.firePropertyChange("namaMotor", oldNamaMotor, namaMotor);
    }

    public int getTahunMotor() {
        return tahunMotor;
    }

    public void setTahunMotor(int tahunMotor) {
        int oldTahunMotor = this.tahunMotor;
        this.tahunMotor = tahunMotor;
        changeSupport.firePropertyChange("tahunMotor", oldTahunMotor, tahunMotor);
    }

    public int getHargaMotor() {
        return hargaMotor;
    }

    public void setHargaMotor(int hargaMotor) {
        int oldHargaMotor = this.hargaMotor;
        this.hargaMotor = hargaMotor;
        changeSupport.firePropertyChange("hargaMotor", oldHargaMotor, hargaMotor);
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
        if (!(object instanceof Motor)) {
            return false;
        }
        Motor other = (Motor) object;
        if ((this.idMotor == null && other.idMotor != null) || (this.idMotor != null && !this.idMotor.equals(other.idMotor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TUBES.Motor[ idMotor=" + idMotor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
