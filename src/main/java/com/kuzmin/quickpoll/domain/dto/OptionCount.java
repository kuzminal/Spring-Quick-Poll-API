package com.kuzmin.quickpoll.domain.dto;

import lombok.Data;

@Data
public class OptionCount {
    private Long optionId;
    private int count;
}
