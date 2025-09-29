package masterchef;

import receta.Plato;

public interface aptoCocinar {
    public abstract String cocinar(Plato plato)throws itemProhibidoEncontrado,itemNoEncontradoEnHash,NullPointerException;
}
