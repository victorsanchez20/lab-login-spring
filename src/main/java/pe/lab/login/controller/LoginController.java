
package pe.lab.login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login() {

        return ResponseEntity.ok(
            Map.of(
                "mensaje", "Laboratorio de autenticación activo.",
                "estado", "SIMULACION"
            )
        );
    }
}
