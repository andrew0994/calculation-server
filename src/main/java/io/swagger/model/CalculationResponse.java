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
 * CalculationResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-06T11:29:55.924Z")

public class CalculationResponse   {
  @JsonProperty("resultat")
  private Long resultat = null;

  public CalculationResponse resultat(Long resultat) {
    this.resultat = resultat;
    return this;
  }

  /**
   * Get resultat
   * @return resultat
  **/
  @ApiModelProperty(value = "")


  public Long getResultat() {
    return resultat;
  }

  public void setResultat(Long resultat) {
    this.resultat = resultat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculationResponse calculationResponse = (CalculationResponse) o;
    return Objects.equals(this.resultat, calculationResponse.resultat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationResponse {\n");
    
    sb.append("    resultat: ").append(toIndentedString(resultat)).append("\n");
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

