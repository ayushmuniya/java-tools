
package com.example.lombok;

import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor

public class Trade 
{
    private String symbol;
    private int quantity;
    private LocalDate purchaseDate;

    public Trade(String string, int i, LocalDate now) {}

    public String getSymbol() 
    {
      return symbol;
    }

    public void setSymbol(String symbol)
    {
      this.symbol = symbol;
    }
  ////////////////////////////////////////////////////////////////
    public int getQuantity() 
    {
      return quantity;
    }

    public void setQuantity(int quantity)
    {
      this.quantity = quantity;
    }
  ///////////////////////////////////////////////////////////////
    public LocalDate getPurchaseDate() 
    {
      return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate)
    {
      this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() 
    {
        return "MyClass [purchaseDate=" + purchaseDate + ", quantity=" + quantity + ",  symbol=" + symbol + "]";
    }

}
