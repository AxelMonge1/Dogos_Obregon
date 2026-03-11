/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

/**
 *
 * @author LABORATORIOS
 */
@Entity
public class HotDog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    private BigDecimal precio;
    
    private BigDecimal iva;
    
    @OneToMany(mappedBy = "hotdog")
    private Set<PedidoDetalle> detalles;

    public HotDog() {
    }

    public HotDog(Long id, String nombre, BigDecimal precio, BigDecimal iva, Set<PedidoDetalle> hotdogs) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.detalles = hotdogs;
    }

    public void setHotdogs(Set<PedidoDetalle> hotdogs) {
        this.detalles = hotdogs;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public Set<PedidoDetalle> getHotdogs() {
        return detalles;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public BigDecimal getIva() {
        return iva;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HotDog)) {
            return false;
        }
        HotDog other = (HotDog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.HotDog[ id=" + id + " ]";
    }
    
}
