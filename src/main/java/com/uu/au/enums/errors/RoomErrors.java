package com.uu.au.enums.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class RoomErrors {
    public static ResponseStatusException roomAlreadyDefined() {
        return new ResponseStatusException(HttpStatus.BAD_REQUEST,
                                           "ROOM_ALREADY_DEFINED");
    }
    public static ResponseStatusException roomNotDefined() {
        return new ResponseStatusException(HttpStatus.BAD_REQUEST,
                                           "ROOM_NOT_DEFINED");
    }
}
