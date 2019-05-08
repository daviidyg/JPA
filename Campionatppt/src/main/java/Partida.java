import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "partida", schema = "pedramysql", catalog = "")
public class Partida {
    private int idPartida;
    private Date data;
    private Collection<Jugada> jugadasByIdPartida;
    private Jugador jugadorByIdJugador1;
    private Jugador jugadorByIdJugador2;

    @Id
    @Column(name = "id_partida")
    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    @Basic
    @Column(name = "data")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partida that = (Partida) o;
        return idPartida == that.idPartida &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPartida, data);
    }

    @OneToMany(mappedBy = "partidaByIdPartida")
    public Collection<Jugada> getJugadasByIdPartida() {
        return jugadasByIdPartida;
    }

    public void setJugadasByIdPartida(Collection<Jugada> jugadasByIdPartida) {
        this.jugadasByIdPartida = jugadasByIdPartida;
    }

    @ManyToOne
    @JoinColumn(name = "id_jugador1", referencedColumnName = "id_jugador")
    public Jugador getJugadorByIdJugador1() {
        return jugadorByIdJugador1;
    }

    public void setJugadorByIdJugador1(Jugador jugadorByIdJugador1) {
        this.jugadorByIdJugador1 = jugadorByIdJugador1;
    }

    @ManyToOne
    @JoinColumn(name = "id_jugador2", referencedColumnName = "id_jugador")
    public Jugador getJugadorByIdJugador2() {
        return jugadorByIdJugador2;
    }

    public void setJugadorByIdJugador2(Jugador jugadorByIdJugador2) {
        this.jugadorByIdJugador2 = jugadorByIdJugador2;
    }

}
