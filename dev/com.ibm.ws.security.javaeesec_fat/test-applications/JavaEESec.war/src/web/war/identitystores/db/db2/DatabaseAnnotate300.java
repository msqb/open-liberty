/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package web.war.identitystores.db.db2;

import java.util.logging.Logger;
import javax.security.enterprise.identitystore.DatabaseIdentityStoreDefinition;

@DatabaseIdentityStoreDefinition(
                                 dataSourceLookup="jdbc/db2",
                                 priority=300,
                                 callerQuery = "select password from callers where name = ?",
                                 groupsQuery = "select group_name from caller_groups where caller_name = ?")

public class DatabaseAnnotate300 {
    private static Logger log = Logger.getLogger(DatabaseAnnotate300.class.getName());
    public DatabaseAnnotate300() {
        log.info("<ctor>");
    }
}
