package fin.coopsi.p8.application.services;

import java.util.List;

import fin.coopsi.p8.domain.model.Producto;

public interface ProductoService {

    Producto getProductoById(final int id);
    List<Producto> getAllProductos();
}
