package objetoReserva;

/**
 * La clase Reserva representa los detalles de una reserva.
 * Contiene información sobre el nombre, apellidos, teléfono, fecha, tipo de evento,
 * número de asistentes, tipo de cocina, número de jornadas y si se necesitan habitaciones.
 * 
 * @author julio
 */
public class Reserva {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String fecha;
    private String tipoEvento;
    private String numeroAsistentes;
    private String tipoCocina;
    private String numeroJornadas;
    private String necesitaHabitaciones;
    
    /**
     * Constructor de la clase Reserva.
     * Crea una instancia de Reserva con valores predeterminados.
     */
    public Reserva() {
        
    }

    /**
     * Obtiene el número de teléfono de la reserva.
     *
     * @return El número de teléfono de la reserva.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono de la reserva.
     *
     * @param telefono El número de teléfono a establecer.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la fecha de la reserva.
     *
     * @return La fecha de la reserva en formato de cadena.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la reserva.
     *
     * @param fecha La fecha de la reserva en formato de cadena.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el tipo de evento de la reserva.
     *
     * @return El tipo de evento de la reserva.
     */
    public String getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Establece el tipo de evento de la reserva.
     *
     * @param tipoEvento El tipo de evento a establecer.
     */
    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    /**
     * Obtiene el número de asistentes de la reserva.
     *
     * @return El número de asistentes de la reserva.
     */
    public String getNumeroAsistentes() {
        return numeroAsistentes;
    }

    /**
     * Establece el número de asistentes de la reserva.
     *
     * @param numeroAsistentes El número de asistentes a establecer.
     */
    public void setNumeroAsistentes(String numeroAsistentes) {
        this.numeroAsistentes = numeroAsistentes;
    }

    /**
     * Obtiene el tipo de cocina de la reserva.
     *
     * @return El tipo de cocina de la reserva.
     */
    public String getTipoCocina() {
        return tipoCocina;
    }

    /**
     * Establece el tipo de cocina de la reserva.
     *
     * @param tipoCocina El tipo de cocina a establecer.
     */
    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    /**
     * Obtiene el número de jornadas de la reserva.
     *
     * @return El número de jornadas de la reserva.
     */
    public String getNumeroJornadas() {
        return numeroJornadas;
    }

    /**
     * Establece el número de jornadas de la reserva.
     *
     * @param numeroJornadas El número de jornadas a establecer.
     */
    public void setNumeroJornadas(String numeroJornadas) {
        this.numeroJornadas = numeroJornadas;
    }

    /**
     * Obtiene si se necesitan habitaciones en la reserva.
     *
     * @return "Sí" o "No" dependiendo de si se necesitan habitaciones.
     */
    public String getNecesitaHabitaciones() {
        return necesitaHabitaciones;
    }

    /**
     * Establece si se necesitan habitaciones en la reserva.
     *
     * @param necesitaHabitaciones "Sí" o "No" dependiendo de si se necesitan habitaciones.
     */
    public void setNecesitaHabitaciones(String necesitaHabitaciones) {
        this.necesitaHabitaciones = necesitaHabitaciones;
    }
    
    /**
     * Obtiene los apellidos del titular de la reserva.
     *
     * @return Los apellidos del titular de la reserva.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del titular de la reserva.
     *
     * @param apellidos Los apellidos del titular de la reserva.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene el nombre del titular de la reserva.
     *
     * @return El nombre del titular de la reserva.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la reserva.
     *
     * @param nombre El nombre del titular de la reserva.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}