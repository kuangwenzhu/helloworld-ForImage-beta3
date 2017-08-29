package com.service.jaxrs.csedemo;

import com.service.jaxrs.csedemo.model.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.servicecomb.provider.rest.common.RestSchema;
import com.service.jaxrs.csedemo.CsedemoAgent;

import java.util.List;
import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerCodegen", date = "2017-08-29T07:20:58.009Z")


@RestSchema(schemaId = "csedemo")
@Path("/hellotest")

@Produces({ "application/json" })
public class CsedemoImpl  {
    private CsedemoAgent csedemoAgent = new CsedemoAgent();

    @Path("/add")
    @GET
    
    @Produces({ "application/json" })
    public Integer add(@QueryParam("a") @NotNull Integer a,@QueryParam("b") @NotNull Integer b) {

    	return csedemoAgent.add(a, b);
    }

    @Path("/sayhei")
    @GET
    
    @Produces({ "application/json" })
    public String sayHei(@HeaderParam("name") String name) {

    	return csedemoAgent.sayHei(name);
    }

    @Path("/sayhello/{name}")
    @POST
    
    @Produces({ "application/json" })
    public String sayHello(@PathParam("name") String name) {

    	return csedemoAgent.sayHello(name);
    }

    @Path("/sayhi")
    @GET
    
    @Produces({ "application/json" })
    public String sayHi(@QueryParam("name") @NotNull String name) {

    	return csedemoAgent.sayHi(name);
    }

    @Path("/saysomething")
    @POST
    
    @Produces({ "application/json" })
    public String saySomething(@QueryParam("prefix") @NotNull String prefix,Person user) {

    	return csedemoAgent.saySomething(prefix, user);
    }
}

