
package com.example.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

public class TradeData 
{
  // public TradeData(String string, int i, LocalDate now) {}

  private String symbol;
  private int quantity;
  private LocalDate purchaseDate;
} 
