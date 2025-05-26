import java.time.LocalDate;
    public class Reserva {
        private String nombreCliente;
        private Habitacion habitacion;
        private LocalDate fechaEntrada;
        private LocalDate fechaSalida;

        public Reserva(String nombreCliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
            this.nombreCliente = nombreCliente;
            this.habitacion = habitacion;
            this.fechaEntrada = fechaEntrada;
            this.fechaSalida = fechaSalida;
            this.habitacion.setDisponible(false);
        }

        public String getNombreCliente() {
            return nombreCliente;
        }

        public Habitacion getHabitacion() {
            return habitacion;
        }

        public LocalDate getFechaEntrada() {
            return fechaEntrada;
        }

        public LocalDate getFechaSalida() {
            return fechaSalida;
        }
    }
}
