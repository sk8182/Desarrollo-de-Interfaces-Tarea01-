package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase proporciona una conexión a una base de datos MySQL y métodos para insertar reservas en la base de datos.
 * 
 * @author julio
 */
public class ConexionMySQL {

    // Información de la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/reserva_hotelera";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";
    private Connection conexion;

    /**
     * Constructor de la clase que establece la conexión a la base de datos.
     */
    public ConexionMySQL() {

        try {
            // Cargar el controlador JDBC de Oracle
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión a la base de datos
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);

            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            } else {
                System.out.println("No se pudo establecer la conexión a la base de datos.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión a la base de datos: " + e.getMessage());
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    /**
     * Inserta una nueva reserva en la base de datos.
     *
     * @param nombre             El nombre del cliente que realiza la reserva.
     * @param apellidos          Los apellidos del cliente.
     * @param telefono           El número de teléfono de contacto.
     * @param fecha              La fecha del evento.
     * @param tipoEvento         El tipo de evento.
     * @param numeroAsistentes   El número de asistentes al evento.
     * @param tipoCocina         El tipo de cocina requerido para el evento.
     * @param numeroJornadas     El número de jornadas del evento.
     * @param necesitaHabitaciones Indica si se necesitan habitaciones para el evento.
     */
    public void insertarReserva(String nombre, String apellidos, String telefono, String fecha, String tipoEvento, String numeroAsistentes, String tipoCocina, String numeroJornadas, String necesitaHabitaciones) {
        
        try {
            // Abre una nueva conexión
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);

            PreparedStatement statement = conexion.prepareStatement("INSERT INTO RESERVA (NOMBRE, APELLIDOS, TELEFONO, FECHAEVENTO, TIPOEVENTO, NUMEROASISTENTES, TIPOCOCINA, NUMEROJORNADAS, NECESITAHABITACIONES) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, nombre);
            statement.setString(2, apellidos);
            statement.setString(3, telefono);
            statement.setString(4, fecha);
            statement.setString(5, tipoEvento);
            statement.setString(6, numeroAsistentes);
            statement.setString(7, tipoCocina);
            statement.setString(8, numeroJornadas);
            statement.setString(9, necesitaHabitaciones);
            
            statement.executeUpdate();
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conexion != null) {
                    conexion.close(); // Cierra la conexión
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
