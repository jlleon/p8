package fin.coopsi.p8.infrastructure.services.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fin.coopsi.p8.application.services.ProductoService;
import fin.coopsi.p8.domain.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

    private List<Producto> listaProductos;

    public ProductoServiceImpl() {
        listaProductos = new ArrayList<>();
        listaProductos.add(new Producto(1, "Mouse", 5, BigDecimal.valueOf(12.00)));
        listaProductos.add(new Producto(2, "Padmouse", 3, BigDecimal.valueOf(5.00)));
        listaProductos.add(new Producto(3, "Teclado", 2, BigDecimal.valueOf(10.00)));
        listaProductos.add(new Producto(4, "Parlantes", 1, BigDecimal.valueOf(30.00)));
        listaProductos.add(new Producto(5, "Discos", 8, BigDecimal.valueOf(120.00)));
    }

    @Override
    public Producto getProductoById(final int id) {
        return listaProductos.stream().filter(d -> d.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Producto> getAllProductos() {
        return listaProductos;
    }
}
