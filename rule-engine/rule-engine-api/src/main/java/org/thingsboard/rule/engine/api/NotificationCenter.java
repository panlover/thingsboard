/**
 * Copyright © 2016-2022 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.rule.engine.api;

import org.thingsboard.server.common.data.id.NotificationId;
import org.thingsboard.server.common.data.id.NotificationRequestId;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.common.data.id.UserId;
import org.thingsboard.server.common.data.notification.NotificationRequest;

public interface NotificationCenter {

    NotificationRequest processNotificationRequest(TenantId tenantId, NotificationRequest notificationRequest);

    void deleteNotificationRequest(TenantId tenantId, NotificationRequestId notificationRequestId);

    NotificationRequest updateNotificationRequest(TenantId tenantId, NotificationRequest notificationRequest);

    void sendBasicNotification(TenantId tenantId, UserId recipientId, String subject, String text);


    void markNotificationAsRead(TenantId tenantId, UserId recipientId, NotificationId notificationId);

    void deleteNotification(TenantId tenantId, UserId recipientId, NotificationId notificationId);

}