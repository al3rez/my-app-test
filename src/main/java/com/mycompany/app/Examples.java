package com.mycompany.app;

import java.nio.ByteBuffer;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import io.swagger.annotations.*;
import io.sinistral.proteus.server.*;
import java.util.*;
import com.google.inject.Singleton;
import com.jsoniter.output.JsonStream;
import io.undertow.server.HttpServerExchange;
import static io.sinistral.proteus.server.ServerResponse.response;

@Api(tags="examples")
@Path("/examples")
@Produces((MediaType.APPLICATION_JSON))
@Consumes((MediaType.WILDCARD))
@Singleton
public class Examples
{
	@GET
	@Path("/echo")
	@Produces((MediaType.TEXT_PLAIN))
	@ApiOperation(value = "Echo a message", httpMethod = "GET", response=String.class)
	public ServerResponse<ByteBuffer> echo(String message)
	{
		return response("Hello, World!").contentType(MediaType.TEXT_PLAIN);
	}
}
