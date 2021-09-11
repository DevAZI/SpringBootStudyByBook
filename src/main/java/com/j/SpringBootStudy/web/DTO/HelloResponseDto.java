package com.j.SpringBootStudy.web.DTO;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    public final String name;
    public final int amount;

}
