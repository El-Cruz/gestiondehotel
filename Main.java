import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Estrella");

        hotel.agregarHabitacion(new Habitacion(101, "Simple", 50.0));
        hotel.agregarHabitacion(new Habitacion(102, "Doble", 80.0));
        hotel.agregarHabitacion(new Habitacion(103, "Suite", 120.0));

        int numero = 102;
        System.out.println("¿Habitación " + numero + " disponible?: " + hotel.hayDisponibilidad(numero));

        hotel.crearReserva("Pepe Grillo", numero, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 5));

        System.out.println("¿Habitación " + numero + " disponible?: " + hotel.hayDisponibilidad(numero));

        for (Reserva reserva : hotel.getReservas()) {
            System.out.println("\nReserva:");
            System.out.println("Cliente: " + reserva.getNombreCliente());
            System.out.println("Habitación: " + reserva.getHabitacion().getNumero());
            System.out.println("Entrada: " + reserva.getFechaEntrada());
            System.out.println("Salida: " + reserva.getFechaSalida());
        }
    }
}
