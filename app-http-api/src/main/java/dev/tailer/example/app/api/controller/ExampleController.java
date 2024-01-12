package dev.tailer.example.app.api.controller;

import io.swagger.v3.oas.annotations.Operation;
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

    @Operation(summary = "테스트", description = "demo 조회 메서드입니다.")
    @GetMapping(path = "/test")
    public ResponseEntity<String> findOrganizationUserList() {
        return ResponseEntity.ok(String.valueOf(new Random().nextInt()));
    }
}
