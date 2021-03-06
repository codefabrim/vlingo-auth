// Copyright © 2012-2018 Vaughn Vernon. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.auth.infra.persistence;

import io.vlingo.auth.model.TenantId;

abstract class BaseRepository {
  protected String keyFor(final TenantId tenantId) {
    return tenantId.value + ":";
  }

  protected String keyFor(final TenantId tenantId, final String groupName) {
    return tenantId.value + ":" + groupName;
  }
}
