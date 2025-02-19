/**
 * The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License");
 * you may not use this file except in compliance with the License. You may obtain a copy of the
 * License at http://www.mozilla.org/MPL/
 *
 * <p>Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF
 * ANY KIND, either express or implied. See the License for the specific language governing rights
 * and limitations under the License.
 *
 * <p>The Original Code is OpenELIS code.
 *
 * <p>Copyright (C) ITECH, University of Washington, Seattle WA. All Rights Reserved.
 */
package org.openelisglobal.qaevent.dao;

import org.openelisglobal.common.dao.BaseDAO;
import org.openelisglobal.common.exception.LIMSRuntimeException;
import org.openelisglobal.qaevent.valueholder.QaObservation;

public interface QaObservationDAO extends BaseDAO<QaObservation, String> {

    // public void insertData(QaObservation qaObservation) throws
    // LIMSRuntimeException;

    // public void updateData(QaObservation qaObservation) throws
    // LIMSRuntimeException;

    public QaObservation getQaObservationByTypeAndObserved(String typeName, String observedType, String observedId)
            throws LIMSRuntimeException;
}
