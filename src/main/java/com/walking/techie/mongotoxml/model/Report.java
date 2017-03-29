package com.walking.techie.mongotoxml.model;


import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "report")
public class Report {

  private int id;
  private Date date;
  private long impression;
  private int clicks;
  private BigDecimal earning;
}
