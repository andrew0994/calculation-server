package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CalculationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-06T14:41:51.503Z")

public class CalculationRequest   {
  @JsonProperty("montant")
  private Long montant = null;

  @JsonProperty("duree")
  private Long duree = null;

  @JsonProperty("taux")
  private Long taux = null;

  public CalculationRequest montant(Long montant) {
    this.montant = montant;
    return this;
  }

  /**
   * Get montant
   * @return montant
  **/
  @ApiModelProperty(value = "")


  public Long getMontant() {
    return montant;
  }

  public void setMontant(Long montant) {
    this.montant = montant;
  }

  public CalculationRequest duree(Long duree) {
    this.duree = duree;
    return this;
  }

  /**
   * Get duree
   * @return duree
  **/
  @ApiModelProperty(value = "")


  public Long getDuree() {
    return duree;
  }

  public void setDuree(Long duree) {
    this.duree = duree;
  }

  public CalculationRequest taux(Long taux) {
    this.taux = taux;
    return this;
  }

  /**
   * Get taux
   * @return taux
  **/
  @ApiModelProperty(value = "")


  public Long getTaux() {
    return taux;
  }

  public void setTaux(Long taux) {
    this.taux = taux;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculationRequest calculationRequest = (CalculationRequest) o;
    return Objects.equals(this.montant, calculationRequest.montant) &&
        Objects.equals(this.duree, calculationRequest.duree) &&
        Objects.equals(this.taux, calculationRequest.taux);
  }

  @Override
  public int hashCode() {
    return Objects.hash(montant, duree, taux);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationRequest {\n");
    
    sb.append("    montant: ").append(toIndentedString(montant)).append("\n");
    sb.append("    duree: ").append(toIndentedString(duree)).append("\n");
    sb.append("    taux: ").append(toIndentedString(taux)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

