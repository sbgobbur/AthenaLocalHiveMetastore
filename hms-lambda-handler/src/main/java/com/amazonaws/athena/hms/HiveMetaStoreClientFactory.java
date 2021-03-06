/*-
 * #%L
 * hms-lambda-handler
 * %%
 * Copyright (C) 2019 Amazon Web Services
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.amazonaws.athena.hms;

import org.apache.hadoop.hive.metastore.HiveMetaStoreClient;

public interface HiveMetaStoreClientFactory
{
  // Get the configuration
  HiveMetaStoreConf getConf();

  // customer could provide a custom HiveMetaStoreClient based on their own version of Hive Metastore
  HiveMetaStoreClient getHiveMetaStoreClient();

  // provide customer a way to provide a customer HandlerProvider
  HandlerProvider getHandlerProvider();
}
