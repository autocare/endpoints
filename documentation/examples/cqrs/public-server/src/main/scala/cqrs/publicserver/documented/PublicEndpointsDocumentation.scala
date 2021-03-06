package cqrs.publicserver.documented

//#documentation
import endpoints.documented.openapi
import endpoints.documented.openapi.{Info, OpenApi}

object PublicEndpointsDocumentation
  extends PublicEndpoints
    with openapi.Endpoints
    with openapi.CirceEntities
    with openapi.OptionalResponses {

  val documentation: OpenApi =
    openApi(Info(title = "API to manipulate meters", version = "1.0.0"))(
      listMeters, getMeter, createMeter, addRecord
    )

  def uuidSegment: Unit = ()

}
//#documentation