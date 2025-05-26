import java.util.ArrayList;
import java.time.LocalDate;
public class Hotel {
    private String nombre;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Reserva> reservas;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public boolean hayDisponibilidad(int numeroHabitacion) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numeroHabitacion) {
                return h.isDisponible();
            }
        }
        return false;
    }

    public void crearReserva(String cliente, int numeroHabitacion, LocalDate entrada, LocalDate salida) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numeroHabitacion && h.isDisponible()) {
                Reserva r = new Reserva(cliente, h, entrada, salida);
                reservas.add(r);
                break;
            }
        }
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}

