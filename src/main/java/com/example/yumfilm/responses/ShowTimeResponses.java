package com.example.yumfilm.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowTimeResponses {
    int showTimeId;
    int showTimeListId;
    String showTimeFrame;
    int filmId;
}
