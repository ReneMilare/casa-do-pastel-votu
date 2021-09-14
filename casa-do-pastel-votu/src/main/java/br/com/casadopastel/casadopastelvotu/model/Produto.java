package br.com.casadopastel.casadopastelvotu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import java.math.BigDecimal;

import lombok.Data;


@Entity
@Table(name = "produtos")
@Data
public class Produto {

  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String nomeProduto;

  @NotBlank
  private String descricaoProduto;
  
  @NotBlank
  private BigDecimal preco;
  
}
