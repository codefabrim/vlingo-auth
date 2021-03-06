// Copyright © 2012-2018 Vaughn Vernon. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.auth.model;

public interface Loader {
  public Group loadGroup(final TenantId tenantId, final String groupName);

  public Permission loadPermission(final TenantId tenantId, final String permissionName);

  public Role loadRole(final TenantId tenantId, final String roleName);
}
