import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "jugador", schema = "pedramysql", catalog = "")
public class Jugador {
    private String idJugador;
    private String nom;
    private String alies;
    private Integer ranquing;
    private Collection<Partida> partidasByIdJugador;
    private Collection<Partida> partidasByIdJugador_0;

    @Id
    @Column(name = "id_jugador")
    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "alies")
    public String getAlies() {
        return alies;
    }

    public void setAlies(String alies) {
        this.alies = alies;
    }

    @Basic
    @Column(name = "ranquing")
    public Integer getRanquing() {
        return ranquing;
    }

    public void setRanquing(Integer ranquing) {
        this.ranquing = ranquing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador that = (Jugador) o;
        return Objects.equals(idJugador, that.idJugador) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(alies, that.alies) &&
                Objects.equals(ranquing, that.ranquing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJugador, nom, alies, ranquing);
    }

    @OneToMany(mappedBy = "jugadorByIdJugador1")
    public Collection<Partida> getPartidasByIdJugador() {
        return partidasByIdJugador;
    }

    public void setPartidasByIdJugador(Collection<Partida> partidasByIdJugador) {
        this.partidasByIdJugador = partidasByIdJugador;
    }

    @OneToMany(mappedBy = "jugadorByIdJugador2")
    public Collection<Partida> getPartidasByIdJugador_0() {
        return partidasByIdJugador_0;
    }

    public void setPartidasByIdJugador_0(Collection<Partida> partidasByIdJugador_0) {
        this.partidasByIdJugador_0 = partidasByIdJugador_0;
    }
}
