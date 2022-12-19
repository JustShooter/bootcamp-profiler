package by.itacademy.profiler.usecasses.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.io.Serializable;

public record AuthenticationRequestDto(
        @NotBlank(message = "Email is mandatory!")
        @Pattern(regexp = REGEXP_VALIDATE_EMAIL, message = "Invalid e-mail address")
        String email,

        @NotBlank(message = "Password is mandatory!")
        String password) implements Serializable {
    private static final String REGEXP_VALIDATE_EMAIL = "^[\\w ]+(?:\\w+[!#$%&'()*,\\-./:;<=>?\\[\\]^_{}]?)+\\w+@[a-zA-Z0-9-]+\\.+([a-zA-Z]{2,6}+[ +]*)$";
}
