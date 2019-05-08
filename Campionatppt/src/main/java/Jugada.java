import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "jugada", schema = "pedramysql", catalog = "")
public class Jugada {
    private int id;
    private Integer numJugada;
    private String tiraJugador1;
    private String tiraJugador2;
    private Partida partidaByIdPartida;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "num_jugada")
    public Integer getNumJugada() {
        return numJugada;
    }

    public void setNumJugada(Integer numJugada) {
        this.numJugada = numJugada;
    }

    @Basic
    @Column(name = "tira_jugador1")
    public String getTiraJugador1() {
        return tiraJugador1;
    }

    public void setTiraJugador1(String tiraJugador1) {
        this.tiraJugador1 = tiraJugador1;
    }

    @Basic
    @Column(name = "tira_jugador2")
    public String getTiraJugador2() {
        return tiraJugador2;
    }

    public void setTiraJugador2(String tiraJugador2) {
        this.tiraJugador2 = tiraJugador2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugada that = (Jugada) o;
        return id == that.id &&
                Objects.equals(numJugada, that.numJugada) &&
                Objects.equals(tiraJugador1, that.tiraJugador1) &&
                Objects.equals(tiraJugador2, that.tiraJugador2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numJugada, tiraJugador1, tiraJugador2);
    }

    @ManyToOne
    @JoinColumn(name = "id_partida", referencedColumnName = "id_partida")
    public Partida getPartidaByIdPartida() {
        return partidaByIdPartida;
    }

    public void setPartidaByIdPartida(Partida partidaByIdPartida) {
        this.partidaByIdPartida = partidaByIdPartida;
    }
}
