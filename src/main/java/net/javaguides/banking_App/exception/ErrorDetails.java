package net.javaguides.banking_App.exception;

import java.time.LocalDateTime;

public record ErrorDetails(LocalDateTime timestamp,
                           String message,
                           String Details,
                           String errorCode) {
}
