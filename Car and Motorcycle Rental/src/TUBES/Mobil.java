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
@Table(name = "mobil", catalog = "tubesalpro", schema = "")
@NamedQueries({
    @NamedQuery(name = "Mobil.findAll", query = "SELECT m FROM Mobil m")
    , @NamedQuery(name = "Mobil.findByIdMobil", query = "SELECT m FROM Mobil m WHERE m.idMobil = :idMobil")
    , @NamedQuery(name = "Mobil.findByNamaMobil", query = "SELECT m FROM Mobil m WHERE m.namaMobil = :namaMobil")
    , @NamedQuery(name = "Mobil.findByTahunMobil", query = "SELECT m FROM Mobil m WHERE m.tahunMobil = :tahunMobil")
    , @NamedQuery(name = "Mobil.findByHargaMobil", query = "SELECT m FROM Mobil m WHERE m.hargaMobil = :hargaMobil")})
public class Mobil implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_mobil")
    private Integer idMobil;
    @Basic(optional = false)
    @Column(name = "nama_mobil")
    private String namaMobil;
    @Basic(optional = false)
    @Column(name = "tahun_mobil")
    private int tahunMobil;
    @Basic(optional = false)
    @Column(name = "harga_mobil")
    private int hargaMobil;

    public Mobil() {
    }

    public Mobil(Integer idMobil) {
        this.idMobil = idMobil;
    }

    public Mobil(Integer idMobil, String namaMobil, int tahunMobil, int hargaMobil) {
        this.idMobil = idMobil;
        this.namaMobil = namaMobil;
        this.tahunMobil = tahunMobil;
        this.hargaMobil = hargaMobil;
    }

    public Integer getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(Integer idMobil) {
        Integer oldIdMobil = this.idMobil;
        this.idMobil = idMobil;
        changeSupport.firePropertyChange("idMobil", oldIdMobil, idMobil);
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        String oldNamaMobil = this.namaMobil;
        this.namaMobil = namaMobil;
        changeSupport.firePropertyChange("namaMobil", oldNamaMobil, namaMobil);
    }

    public int getTahunMobil() {
        return tahunMobil;
    }

    public void setTahunMobil(int tahunMobil) {
        int oldTahunMobil = this.tahunMobil;
        this.tahunMobil = tahunMobil;
        changeSupport.firePropertyChange("tahunMobil", oldTahunMobil, tahunMobil);
    }

    public int getHargaMobil() {
        return hargaMobil;
    }

    public void setHargaMobil(int hargaMobil) {
        int oldHargaMobil = this.hargaMobil;
        this.hargaMobil = hargaMobil;
        changeSupport.firePropertyChange("hargaMobil", oldHargaMobil, hargaMobil);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMobil != null ? idMobil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mobil)) {
            return false;
        }
        Mobil other = (Mobil) object;
        if ((this.idMobil == null && other.idMobil != null) || (this.idMobil != null && !this.idMobil.equals(other.idMobil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TUBES.Mobil[ idMobil=" + idMobil + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
