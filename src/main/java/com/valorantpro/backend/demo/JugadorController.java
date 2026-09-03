package com.valorantpro.backend.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
@CrossOrigin(origins = {
    "http://localhost:4200",
    "https://valorant-frontend-ruby.vercel.app"
})
public class JugadorController {

    private final JugadorRepository jugadorRepository;

    public JugadorController(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    @PostMapping
    public Jugador registrarJugador(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @GetMapping
    public List<Jugador> obtenerJugadores() {
        return jugadorRepository.findAll();
    }
}