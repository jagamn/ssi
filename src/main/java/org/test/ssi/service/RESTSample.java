package org.test.ssi.service;

import org.test.ssi.entity.MapBean;
import org.test.ssi.entity.User;
import org.test.ssi.entity.Users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * @author jianghm
 * @date 2015/3/20
 */
@Path(value = "/sample")
public interface RESTSample {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String doGet();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/request/{param}")
    public String doRequest(@PathParam("param") String param,
                            @Context HttpServletRequest servletRequest, @Context HttpServletResponse servletResponse);

    @GET
    @Path("/bean/{id}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public User getBean(@PathParam("id") int id);

    @GET
    @Path("/list")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Users getList();

    @GET
    @Path("/map")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public MapBean getMap();

    /*
        @Consumes：声明该方法使用 HTML FORM。
        @FormParam：注入该方法的 HTML 属性确定的表单输入。
        @Response.created(uri).build()： 构建新的 URI 用于新创建的联系人（/contacts/{id}）并设置响应代码（201/created）。
        您可以使用 http://localhost:8080/Jersey/rest/contacts/<id> 访问新联系人
     */
    @POST
    @Path("/postData")
    public User postData(User user) throws IOException;

    @PUT
    @Path("/putData/{id}")
    @Consumes(MediaType.APPLICATION_XML)
    public User putData(@PathParam("id") int id, User user);

    @DELETE
    @Path("/removeData/{id}")
    public void deleteData(@PathParam("id") int id);
}