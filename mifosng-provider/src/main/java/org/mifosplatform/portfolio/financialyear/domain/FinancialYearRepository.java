/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.financialyear.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface FinancialYearRepository extends JpaRepository<FinancialYear, Long>, JpaSpecificationExecutor<FinancialYear> {

    FinancialYear findById(Long id);

    @Modifying
    @Query("update FinancialYear fy set fy.current = ?1")
    int setAllCurrent(boolean current);
}
