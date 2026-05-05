package controller;

import com.invensale.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductoController {

    private List<Producto> lista = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("productos", lista);
        return "index";
    }



@PostMapping("/guardar")
public String guardar(@RequestParam String nombre,
                      @RequestParam double precio) {

    System.out.println("Entró al método guardar");

        lista.add(new Producto((long) lista.size() + 1, nombre, precio));
        return "redirect:/";
    }
}