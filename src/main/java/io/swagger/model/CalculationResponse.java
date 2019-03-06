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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-06T15:09:42.678Z")

public class CalculationResponse   {
  @JsonProperty("instanmonth")
  private Long instanmonth = null;

  @JsonProperty("totalcost")
  private Long totalcost = null;

  public CalculationResponse instanmonth(Long instanmonth) {
    this.instanmonth = instanmonth;
    return this;
  }

  /**
   * Get instanmonth
   * @return instanmonth
  **/
  @ApiModelProperty(value = "")


  public Long getInstanmonth() {
    return instanmonth;
  }

  public void setInstanmonth(Long instanmonth) {
    this.instanmonth = instanmonth;
  }

  public CalculationResponse totalcost(Long totalcost) {
    this.totalcost = totalcost;
    return this;
  }

  /**
   * Get totalcost
   * @return totalcost
  **/
  @ApiModelProperty(value = "")


  public Long getTotalcost() {
    return totalcost;
  }

  public void setTotalcost(Long totalcost) {
    this.totalcost = totalcost;
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
    return Objects.equals(this.instanmonth, calculationResponse.instanmonth) &&
        Objects.equals(this.totalcost, calculationResponse.totalcost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanmonth, totalcost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationResponse {\n");
    
    sb.append("    instanmonth: ").append(toIndentedString(instanmonth)).append("\n");
    sb.append("    totalcost: ").append(toIndentedString(totalcost)).append("\n");
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

