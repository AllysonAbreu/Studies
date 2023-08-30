package com.example.auth.utils;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import static java.util.Objects.isNull;

public class DateUtils {
    public static LocalDateTime stringToLocalDate(Timestamp data){
        return isNull(data) ?  null : data.toLocalDateTime();
    }

}
