package com.sena.controllabs.dto;

public record RoomCreateRequest(
        String code,
        String name,
        Integer totalPcs,
        String locationBlock
) {

}
