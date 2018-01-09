package org.nuxeo.labs.geonames.core.operations;

import org.apache.commons.lang3.StringUtils;
import org.nuxeo.ecm.automation.core.Constants;
import org.nuxeo.ecm.automation.core.annotations.Context;
import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;
import org.nuxeo.ecm.automation.core.annotations.Param;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.PathRef;

/**
 *
 */
@Operation(id = FindNearbyPostalCodesOp.ID, category = Constants.CAT_SERVICES, label = "Find Nearby Postal Codes", description = "Use GeoNames API to find nearby postal codes.")
public class FindNearbyPostalCodesOp {

  public static final String ID = "GeoNames.FindNearbyPostalCodesOp";

  @Context
  protected CoreSession session;

  @Param(name = "path", required = false)
  protected String path;

  @OperationMethod
  public DocumentModel run() {
    if (StringUtils.isBlank(path)) {
      return session.getRootDocument();
    } else {
      return session.getDocument(new PathRef(path));
    }
  }
}
