package dev.tailer.example.app.api.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RequiredArgsConstructor
@Slf4j
@RestController
public class ExampleController {
    @GetMapping(path = "/test")
    public ResponseEntity<String> findOrganizationUserList() {
        return ResponseEntity.ok(String.valueOf(new Random().nextInt()));
    }
}
