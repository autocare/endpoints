package endpoints.algebra

import scala.language.higherKinds

trait Responses {

  /** Information carried by a response */
  type Response[A]

  /**
    * Empty response.
    */
  def emptyResponse: Response[Unit]

  /**
    * Text response.
    */
  def textResponse: Response[String]

}
