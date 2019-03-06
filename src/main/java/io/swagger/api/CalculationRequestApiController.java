package io.swagger.api;

import io.swagger.model.CalculationRequest;
import io.swagger.model.CalculationResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-06T15:09:42.678Z")

@Controller
public class CalculationRequestApiController implements CalculationRequestApi {

    private static final Logger log = LoggerFactory.getLogger(CalculationRequestApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CalculationRequestApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CalculationResponse> findCalculationsByStatus(@ApiParam(value = "Status values that need to be considered for filter" ,required=true )  @Valid @RequestBody CalculationRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            CalculationResponse response = new CalculationResponse();
			
			Long instanmonth;
			Long totalcost;
			  
			totalcost = body.getMontant() + body.getDuree()*body.getTaux() ;
			instanmonth = totalcost / body.getDuree()*12;
					
			response.setInstanmonth(instanmonth);
			
			response.setTotalcost(totalcost);
			
			
			return new ResponseEntity<CalculationResponse>(response, HttpStatus.NOT_IMPLEMENTED);
        }

        return new ResponseEntity<CalculationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
