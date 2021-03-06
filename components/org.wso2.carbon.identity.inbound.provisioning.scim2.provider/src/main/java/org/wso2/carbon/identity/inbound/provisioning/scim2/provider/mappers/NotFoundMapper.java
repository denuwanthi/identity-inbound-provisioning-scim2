package org.wso2.carbon.identity.inbound.provisioning.scim2.provider.mappers;

import org.osgi.service.component.annotations.Component;
import org.wso2.charon.core.v2.exceptions.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Exception mapper for NotFound Exception.
 */

@Component(
        name = "org.wso2.carbon.identity.inbound.provisioning.scim2.provider.mappers.NotFoundMapper",
        service = ExceptionMapper.class,
        immediate = true
)

public class NotFoundMapper implements ExceptionMapper<NotFoundException> {

    @Override
    public Response toResponse(NotFoundException e) {
        return Response.status(e.getStatus()).
                entity(e.getDetail()).
                type("text/plain").
                build();
    }
}
