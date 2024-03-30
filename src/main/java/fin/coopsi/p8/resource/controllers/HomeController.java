package fin.coopsi.p8.resource.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fin.coopsi.p8.application.services.ProductoService;
import fin.coopsi.p8.domain.model.Producto;

@Controller
public class HomeController {

    @Autowired
    ProductoService productoService; 

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/productos")
    public String productos(Model model) {
        model.addAttribute("productos", this.productoService.getAllProductos());
        return "listaProductos";
    }
    
    @GetMapping("/producto/{id}")
    public String productos(@PathVariable int id, Model model) {
        Producto producto = this.productoService.getProductoById(id);
        model.addAttribute("producto", producto);
        return "detalleProducto";
    }

    // @GetMapping("/producto/{id}")
    // public String producto(@PathVariable int id, Model model) {
    //     Producto producto = this.productoService.getProductoById(id);
    //     model.addAttribute("producto", producto);
    //     return "layouts/general";
    // }
}
