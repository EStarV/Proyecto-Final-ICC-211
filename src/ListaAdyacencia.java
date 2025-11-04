import java.util.*;

public class ListaAdyacencia {
    private Map<UUID, List<Ruta>> grafo = new HashMap<>();
    private Map<UUID, Parada> paradas = new HashMap<>();

    public ListaAdyacencia(List<Parada> grafo) {}

    public void addParada(Parada parada){
        if(parada == null || parada.getId() == null) return;
        paradas.put(parada.getId(), parada);
        grafo.put(parada.getId(), new LinkedList<Ruta>());
        grafo.put(parada.getId(), grafo.get(parada.getId()));
    }

    public boolean addRuta(Ruta ruta){
        if(ruta == null || ruta.getId() == null || ruta.getId_origen() == null || ruta.getId_destino() == null) return false;
        if(grafo.containsKey(ruta.getId_origen())){
            grafo.get(ruta.getId_origen()).add(ruta);
            return true;
        }
        return false;
    }

    public boolean deleteParada(Parada parada){
        if(parada == null || parada.getId() == null) return false;
        return deleteParadaById(parada.getId());
    }

    public boolean deleteParadaById(UUID id){
        if(paradas.containsKey(id)){
            grafo.remove(id);
            for(List<Ruta> rutas : grafo.values()){
                rutas.removeIf(r -> r.getId_destino().equals(id));
            }
            paradas.remove(id);
            return true;
        }
        return false;
    }

    public boolean deleteRuta(Ruta ruta) {
        if(ruta == null || ruta.getId() == null || ruta.getId_origen() == null || ruta.getId_destino() == null) return false;

        UUID id_Origen = ruta.getId_origen();
        List<Ruta> rutas = grafo.get(id_Origen);
        if(rutas == null) return false;
        return rutas.removeIf(r -> r.getId().equals(ruta.getId()));
    }

}
