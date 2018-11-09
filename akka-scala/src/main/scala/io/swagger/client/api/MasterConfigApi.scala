/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.AccountNameModel
import io.swagger.client.model.ApiErrorResponse
import io.swagger.client.model.CostDriverModel
import io.swagger.client.model.MasterConfigModel
import io.swagger.client.model.ParentUnitIdModel
import io.swagger.client.model.TransportCapacitiesModel
import io.swagger.client.model.UnitAvalibilitiesModel
import io.swagger.client.model.UnitHierachyModel
import io.swagger.client.model.UnitsOfMeasureModel
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object MasterConfigApi {

  /**
   * Returns a list of account names
   * 
   * Expected answers:
   *   code 200 : AccountNameModel (successful operation)
   *   code 401 : ApiErrorResponse (Unauthorised)
   *   code 500 : ApiErrorResponse (Internal server error)
   * 
   * @param siteRef Site reference for the required site. The use of @all will return UOM for all sites.
   * @param accountName Associated account names. The use of @all will return all of the account names avaliable
   */
  def getAccountName(siteRef: String, accountName: String): ApiRequest[AccountNameModel] =
    ApiRequest[AccountNameModel](ApiMethods.GET, "https://virtserver.swaggerhub.com/ewanpeters/production-planning/1.0.0", "/sites/{siteRef}/productionplanning/accountname/{accountName}", "application/json")
      .withPathParam("siteRef", siteRef)
      .withPathParam("accountName", accountName)
      .withSuccessResponse[AccountNameModel](200)
      .withErrorResponse[ApiErrorResponse](401)
      .withErrorResponse[ApiErrorResponse](500)
        /**
   * Returns a list of cost drivers
   * 
   * Expected answers:
   *   code 200 : CostDriverModel (successful operation)
   *   code 401 : ApiErrorResponse (Unauthorised)
   *   code 500 : ApiErrorResponse (Internal server error)
   * 
   * @param siteRef Site reference for the required site. The use of @all will return UOM for all sites.
   */
  def getCostDriver(siteRef: String): ApiRequest[CostDriverModel] =
    ApiRequest[CostDriverModel](ApiMethods.GET, "https://virtserver.swaggerhub.com/ewanpeters/production-planning/1.0.0", "/sites/{siteRef}/productionplanning/costdriver", "application/json")
      .withPathParam("siteRef", siteRef)
      .withSuccessResponse[CostDriverModel](200)
      .withErrorResponse[ApiErrorResponse](401)
      .withErrorResponse[ApiErrorResponse](500)
        /**
   * Returns a list of the master config for a site or a product ID
   * 
   * Expected answers:
   *   code 200 : MasterConfigModel (successful operation)
   *   code 401 : ApiErrorResponse (Unauthorised)
   *   code 500 : ApiErrorResponse (Internal server error)
   * 
   * @param siteRef Site reference for the required site. The use of @all will return UOM for all sites.
   * @param productID Product code for the required site. The use of @all will return product codes for all sites.
   * @param stockingPointId Stocking point for the required site. The use of @all will return the stocking points for all sites
   * @param unitID Unit ID for the required site. The use of @all will return the unit IDs for all sites
   * @param destinationStockingPoint Destination stocking point for the required site. The use of @all will return the stocking points for all sites
   */
  def getMasterConfig(siteRef: String, productID: String, stockingPointId: String, unitID: String, destinationStockingPoint: String): ApiRequest[MasterConfigModel] =
    ApiRequest[MasterConfigModel](ApiMethods.GET, "https://virtserver.swaggerhub.com/ewanpeters/production-planning/1.0.0", "/sites/{siteRef}/productionplanning/masterconfig/{ProductID}", "application/json")
      .withPathParam("siteRef", siteRef)
      .withPathParam("ProductID", productID)
      .withPathParam("stockingPointId", stockingPointId)
      .withPathParam("unitID", unitID)
      .withPathParam("destinationStockingPoint", destinationStockingPoint)
      .withSuccessResponse[MasterConfigModel](200)
      .withErrorResponse[ApiErrorResponse](401)
      .withErrorResponse[ApiErrorResponse](500)
        /**
   * Returns a list of unit hierachs for a site or a parent unit ID
   * 
   * Expected answers:
   *   code 200 : UnitHierachyModel (successful operation)
   *   code 401 : ApiErrorResponse (Unauthorised)
   *   code 500 : ApiErrorResponse (Internal server error)
   * 
   * @param siteRef Site reference for the required site. The use of @all will return UOM for all sites.
   * @param parentUnitId Parent unit id for the site. The use of @all will retuen parent unit id for all sites.
   */
  def getParentUnitId(siteRef: String, parentUnitId: String): ApiRequest[UnitHierachyModel] =
    ApiRequest[UnitHierachyModel](ApiMethods.GET, "https://virtserver.swaggerhub.com/ewanpeters/production-planning/1.0.0", "/sites/{siteRef}/productionplanning/unithierachy/{ParentUnitId}", "application/json")
      .withPathParam("siteRef", siteRef)
      .withPathParam("ParentUnitId", parentUnitId)
      .withSuccessResponse[UnitHierachyModel](200)
      .withErrorResponse[ApiErrorResponse](401)
      .withErrorResponse[ApiErrorResponse](500)
        /**
   * Returns a list of the transport capacities for a site or unit ID
   * 
   * Expected answers:
   *   code 200 : TransportCapacitiesModel (successful operation)
   *   code 401 : ApiErrorResponse (Unauthorised)
   *   code 500 : ApiErrorResponse (Internal server error)
   * 
   * @param siteRef Site reference for the required site. The use of @all will return UOM for all sites.
   * @param unitId Unit Id for the required site. The use of @all will return unit ID for all sites.
   */
  def getTransportCapacities(siteRef: String, unitId: String): ApiRequest[TransportCapacitiesModel] =
    ApiRequest[TransportCapacitiesModel](ApiMethods.GET, "https://virtserver.swaggerhub.com/ewanpeters/production-planning/1.0.0", "/sites/{siteRef}/productionplanning/transportcapacities/{UnitId}", "application/json")
      .withPathParam("siteRef", siteRef)
      .withPathParam("UnitId", unitId)
      .withSuccessResponse[TransportCapacitiesModel](200)
      .withErrorResponse[ApiErrorResponse](401)
      .withErrorResponse[ApiErrorResponse](500)
        /**
   * Returns a list of unit avalibilities for a site or unit ID
   * 
   * Expected answers:
   *   code 200 : UnitAvalibilitiesModel (successful operation)
   *   code 401 : ApiErrorResponse (Unauthorised)
   *   code 500 : ApiErrorResponse (Internal server error)
   * 
   * @param siteRef Site reference for the required site. The use of @all will return UOM for all sites.
   * @param unitId Unit Id for the required site. The use of @all will return unit ID for all sites.
   */
  def getUnitAvalibilities(siteRef: String, unitId: String): ApiRequest[UnitAvalibilitiesModel] =
    ApiRequest[UnitAvalibilitiesModel](ApiMethods.GET, "https://virtserver.swaggerhub.com/ewanpeters/production-planning/1.0.0", "/sites/{siteRef}/productionplanning/unitavalibilities/{UnitId}", "application/json")
      .withPathParam("siteRef", siteRef)
      .withPathParam("UnitId", unitId)
      .withSuccessResponse[UnitAvalibilitiesModel](200)
      .withErrorResponse[ApiErrorResponse](401)
      .withErrorResponse[ApiErrorResponse](500)
        /**
   * Returns a list of unit parent Ids for a site of a parent unit ID
   * 
   * Expected answers:
   *   code 200 : ParentUnitIdModel (successful operation)
   *   code 401 : ApiErrorResponse (Unauthorised)
   *   code 500 : ApiErrorResponse (Internal server error)
   * 
   * @param siteRef Site reference for the required site. The use of @all will return UOM for all sites.
   * @param parentUnitId Parent unit id for the site. The use of @all will retuen parent unit id for all sites.
   */
  def getUnitParentId(siteRef: String, parentUnitId: String): ApiRequest[ParentUnitIdModel] =
    ApiRequest[ParentUnitIdModel](ApiMethods.GET, "https://virtserver.swaggerhub.com/ewanpeters/production-planning/1.0.0", "/sites/{siteRef}/productionplanning/unitparentid/{ParentUnitId}", "application/json")
      .withPathParam("siteRef", siteRef)
      .withPathParam("ParentUnitId", parentUnitId)
      .withSuccessResponse[ParentUnitIdModel](200)
      .withErrorResponse[ApiErrorResponse](401)
      .withErrorResponse[ApiErrorResponse](500)
        /**
   * Returns a list of unit of measure (UoM)
   * 
   * Expected answers:
   *   code 200 : UnitsOfMeasureModel (successful operation)
   *   code 401 : ApiErrorResponse (Unauthorised)
   *   code 500 : ApiErrorResponse (Internal server error)
   * 
   * @param siteRef Site reference for the required site. The use of @all will return UOM for all sites.
   */
  def getUoM(siteRef: String): ApiRequest[UnitsOfMeasureModel] =
    ApiRequest[UnitsOfMeasureModel](ApiMethods.GET, "https://virtserver.swaggerhub.com/ewanpeters/production-planning/1.0.0", "/sites/{siteRef}/productionplanning/unitofmeasure", "application/json")
      .withPathParam("siteRef", siteRef)
      .withSuccessResponse[UnitsOfMeasureModel](200)
      .withErrorResponse[ApiErrorResponse](401)
      .withErrorResponse[ApiErrorResponse](500)
      

}

