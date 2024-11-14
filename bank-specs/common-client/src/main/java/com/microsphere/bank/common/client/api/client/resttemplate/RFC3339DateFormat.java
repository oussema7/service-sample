package com.microsphere.bank.common.client.api.client.resttemplate;

import com.fasterxml.jackson.databind.util.StdDateFormat;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class RFC3339DateFormat extends StdDateFormat {

  private static final String ISO_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
  private static final String TIME_ZONE = "UTC";
  private DateFormat dateFormat;

  public RFC3339DateFormat() {
    dateFormat = new SimpleDateFormat(ISO_DATE_FORMAT);
    dateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
  }

  @Override
  public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
    String value = dateFormat.format(date);
    toAppendTo.append(value);
    return toAppendTo;
  }
}