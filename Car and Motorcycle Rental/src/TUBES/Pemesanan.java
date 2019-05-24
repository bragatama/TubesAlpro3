/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUBES;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Braga
 */
@Entity
@Table(name = "pemesanan", catalog = "tubesalpro", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pemesanan.findAll", query = "SELECT p FROM Pemesanan p")
    , @NamedQuery(name = "Pemesanan.findByIdPemesanan", query = "SELECT p FROM Pemesanan p WHERE p.idPemesanan = :idPemesanan")
    , @NamedQuery(name = "Pemesanan.findByNamaPemesan", query = "SELECT p FROM Pemesanan p WHERE p.namaPemesan = :namaPemesan")
    , @NamedQuery(name = "Pemesanan.findByNoHp", query = "SELECT p FROM Pemesanan p WHERE p.noHp = :noHp")
    , @NamedQuery(name = "Pemesanan.findByAlamat", query = "SELECT p FROM Pemesanan p WHERE p.alamat = :alamat")
    , @NamedQuery(name = "Pemesanan.findByJenisKendaraan", query = "SELECT p FROM Pemesanan p WHERE p.jenisKendaraan = :jenisKendaraan")
    , @NamedQuery(name = "Pemesanan.findByNamaKendaraan", query = "SELECT p FROM Pemesanan p WHERE p.namaKendaraan = :namaKendaraan")
    , @NamedQuery(name = "Pemesanan.findByTglPinjam", query = "SELECT p FROM Pemesanan p WHERE p.tglPinjam = :tglPinjam")
    , @NamedQuery(name = "Pemesanan.findByTglKembali", query = "SELECT p FROM Pemesanan p WHERE p.tglKembali = :tglKembali")
    , @NamedQuery(name = "Pemesanan.findByDurasiPemesanan", query = "SELECT p FROM Pemesanan p WHERE p.durasiPemesanan = :durasiPemesanan")})
public class Pemesanan implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pemesanan")
    private Integer idPemesanan;
    @Column(name = "nama_pemesan")
    private String namaPemesan;
    @Column(name = "no_hp")
    private Integer noHp;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "jenis_kendaraan")
    private String jenisKendaraan;
    @Column(name = "nama_kendaraan")
    private String namaKendaraan;
    @Column(name = "tgl_pinjam")
    @Temporal(TemporalType.DATE)
    private Date tglPinjam;
    @Column(name = "tgl_kembali")
    @Temporal(TemporalType.DATE)
    private Date tglKembali;
    @Column(name = "durasi_pemesanan")
    private Integer durasiPemesanan;

    public Pemesanan() {
    }

    public Pemesanan(Integer idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public Integer getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(Integer idPemesanan) {
        Integer oldIdPemesanan = this.idPemesanan;
        this.idPemesanan = idPemesanan;
        changeSupport.firePropertyChange("idPemesanan", oldIdPemesanan, idPemesanan);
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        String oldNamaPemesan = this.namaPemesan;
        this.namaPemesan = namaPemesan;
        changeSupport.firePropertyChange("namaPemesan", oldNamaPemesan, namaPemesan);
    }

    public Integer getNoHp() {
        return noHp;
    }

    public void setNoHp(Integer noHp) {
        Integer oldNoHp = this.noHp;
        this.noHp = noHp;
        changeSupport.firePropertyChange("noHp", oldNoHp, noHp);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        String oldJenisKendaraan = this.jenisKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        changeSupport.firePropertyChange("jenisKendaraan", oldJenisKendaraan, jenisKendaraan);
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        String oldNamaKendaraan = this.namaKendaraan;
        this.namaKendaraan = namaKendaraan;
        changeSupport.firePropertyChange("namaKendaraan", oldNamaKendaraan, namaKendaraan);
    }

    public Date getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(Date tglPinjam) {
        Date oldTglPinjam = this.tglPinjam;
        this.tglPinjam = tglPinjam;
        changeSupport.firePropertyChange("tglPinjam", oldTglPinjam, tglPinjam);
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        Date oldTglKembali = this.tglKembali;
        this.tglKembali = tglKembali;
        changeSupport.firePropertyChange("tglKembali", oldTglKembali, tglKembali);
    }

    public Integer getDurasiPemesanan() {
        return durasiPemesanan;
    }

    public void setDurasiPemesanan(Integer durasiPemesanan) {
        Integer oldDurasiPemesanan = this.durasiPemesanan;
        this.durasiPemesanan = durasiPemesanan;
        changeSupport.firePropertyChange("durasiPemesanan", oldDurasiPemesanan, durasiPemesanan);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPemesanan != null ? idPemesanan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pemesanan)) {
            return false;
        }
        Pemesanan other = (Pemesanan) object;
        if ((this.idPemesanan == null && other.idPemesanan != null) || (this.idPemesanan != null && !this.idPemesanan.equals(other.idPemesanan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TUBES.Pemesanan[ idPemesanan=" + idPemesanan + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
