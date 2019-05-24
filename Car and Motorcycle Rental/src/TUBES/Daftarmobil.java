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
@Table(name = "daftarmobil", catalog = "tubesalpro", schema = "")
@NamedQueries({
    @NamedQuery(name = "Daftarmobil.findAll", query = "SELECT d FROM Daftarmobil d")
    , @NamedQuery(name = "Daftarmobil.findByIdMobil", query = "SELECT d FROM Daftarmobil d WHERE d.idMobil = :idMobil")
    , @NamedQuery(name = "Daftarmobil.findByNMobil", query = "SELECT d FROM Daftarmobil d WHERE d.nMobil = :nMobil")
    , @NamedQuery(name = "Daftarmobil.findByTahun", query = "SELECT d FROM Daftarmobil d WHERE d.tahun = :tahun")
    , @NamedQuery(name = "Daftarmobil.findByJumlahMobil", query = "SELECT d FROM Daftarmobil d WHERE d.jumlahMobil = :jumlahMobil")})
public class Daftarmobil implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_mobil")
    private Integer idMobil;
    @Column(name = "n_mobil")
    private String nMobil;
    @Column(name = "tahun")
    private Integer tahun;
    @Column(name = "jumlah_mobil")
    private Integer jumlahMobil;

    public Daftarmobil() {
    }

    public Daftarmobil(Integer idMobil) {
        this.idMobil = idMobil;
    }

    public Integer getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(Integer idMobil) {
        Integer oldIdMobil = this.idMobil;
        this.idMobil = idMobil;
        changeSupport.firePropertyChange("idMobil", oldIdMobil, idMobil);
    }

    public String getNMobil() {
        return nMobil;
    }

    public void setNMobil(String nMobil) {
        String oldNMobil = this.nMobil;
        this.nMobil = nMobil;
        changeSupport.firePropertyChange("NMobil", oldNMobil, nMobil);
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        Integer oldTahun = this.tahun;
        this.tahun = tahun;
        changeSupport.firePropertyChange("tahun", oldTahun, tahun);
    }

    public Integer getJumlahMobil() {
        return jumlahMobil;
    }

    public void setJumlahMobil(Integer jumlahMobil) {
        Integer oldJumlahMobil = this.jumlahMobil;
        this.jumlahMobil = jumlahMobil;
        changeSupport.firePropertyChange("jumlahMobil", oldJumlahMobil, jumlahMobil);
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
        if (!(object instanceof Daftarmobil)) {
            return false;
        }
        Daftarmobil other = (Daftarmobil) object;
        if ((this.idMobil == null && other.idMobil != null) || (this.idMobil != null && !this.idMobil.equals(other.idMobil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TUBES.Daftarmobil[ idMobil=" + idMobil + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
