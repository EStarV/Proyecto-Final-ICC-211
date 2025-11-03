import java.util.UUID;

public class Ruta {
    //Arista
    private UUID id;
    private UUID id_origen;
    private UUID id_destino;
    private int tiempo; //En minutos
    private int costo; //En pesos
    private String medio;

    public Ruta(UUID id_origen, UUID id_destino, int tiempo, int costo, String medio) {
        this.id = UUID.randomUUID();
        this.id_origen = id_origen;
        this.id_destino = id_destino;
        this.tiempo = tiempo;
        this.costo = costo;
        this.medio = medio;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public UUID getId_destino() {
        return id_destino;
    }

    public void setId_destino(UUID id_destino) {
        this.id_destino = id_destino;
    }

    public UUID getId_origen() {
        return id_origen;
    }

    public void setId_origen(UUID id_origen) {
        this.id_origen = id_origen;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
