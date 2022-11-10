package com.HiO.Backend.server.common;

import java.time.LocalDateTime;

public interface CommonResponse {
    String getPath();

    String getMethod();

    Object getData();

    String getMessage();

    int getStatusCode();

    LocalDateTime getTimestamp();
}
