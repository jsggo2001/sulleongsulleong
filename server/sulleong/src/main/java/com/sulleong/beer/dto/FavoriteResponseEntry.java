package com.sulleong.beer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteResponseEntry {

    private Long id;

    private String image;

    private String name;

    private String largeCategory;

}