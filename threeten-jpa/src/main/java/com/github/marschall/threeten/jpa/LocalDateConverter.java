package com.github.marschall.threeten.jpa;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Converts {@link Date} to {@link LocalDate} and back.
 */
@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {
  // mapping with java.util.Calendar breaks EclipseLink

  @Override
  public Date convertToDatabaseColumn(LocalDate attribute) {
    if (attribute == null) {
      return null;
    }
    return Date.valueOf(attribute);
  }

  @Override
  public LocalDate convertToEntityAttribute(Date dbData) {
    if (dbData == null) {
      return null;
    }
    return dbData.toLocalDate();
  }

}
