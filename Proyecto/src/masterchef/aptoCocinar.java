package masterchef;

import receta.Plato;

public interface aptoCocinar {
    public abstract void cocinar(Plato plato)throws itemProhibidoEncontrado,itemNoEncontradoEnHash,NullPointerException;
}
