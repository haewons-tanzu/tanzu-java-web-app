package com.example.springboot;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@OpenAPIDefinition(
        info = @Info(
                title = "Tanzu Java Web App API",
                version = "1.0"),
        tags = @Tag(
                name = "Tanzu Java Web App API"))
@CrossOrigin
@RestController
@RequestMapping("/api/customer-profiles")
public class ApiController {

    @Operation(summary = "Get customer profile.", method = "GET", tags = "Customer Profile CRUD")
    @ApiResponses({
        @ApiResponse(
                responseCode = "200",
                description = "Customer profile retrieved successfully."
        ),
        @ApiResponse(
                responseCode = "404",
                description = "Customer profile not found."
        )
    })
    @GetMapping("/{id}")
    public String get(@PathVariable("id") String id) {
        return "Customer profiles retrieved successfully.";
    }

    @Operation(summary = "Get all customer profiles.", method = "GET", tags = "Customer Profile CRUD")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Customer profiles retrieved successfully."
            )
    })
       
    @GetMapping("/")
    public String getAll() {
        return "Customer profiles retrieved successfully.";
    }
}
