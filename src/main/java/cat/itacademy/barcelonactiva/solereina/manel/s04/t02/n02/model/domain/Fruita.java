package cat.itacademy.barcelonactiva.solereina.manel.s04.t02.n02.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Fruita")
public class Fruita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Quantitat")
    private int quantitatQuilos;

    public Fruita() {
        nom = "";
    }

    public Fruita (String nom, int quantitatQuilos) {
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }
    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }
    @Override
    public String toString() {
        return "Fruita: id = " + id + ", nom = " + nom + ", quantitat = " + quantitatQuilos + ".";
    }
}

