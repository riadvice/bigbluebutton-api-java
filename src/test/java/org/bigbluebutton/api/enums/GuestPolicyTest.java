/*
 * BigBlueButton open source conferencing system - https://www.bigbluebutton.org/.
 *
 * Copyright (c) 2023 BigBlueButton Inc. and by respective authors (see below).
 *
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation; either version 3.0 of the License, or (at your option) any later
 * version.
 *
 * BigBlueButton is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along
 * with BigBlueButton; if not, see <http://www.gnu.org/licenses/>.
 */

package org.bigbluebutton.api.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.bigbluebutton.api.test.BaseTestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GuestPolicyTest extends BaseTestCase {

    @Test
    @DisplayName("Test guest policy names")
    void featureNamesShouldMatch() {
        assertEquals(GuestPolicy.ALWAYS_ACCEPT.getName(), "ALWAYS_ACCEPT");
        assertEquals(GuestPolicy.ALWAYS_DENY.getName(), "ALWAYS_DENY");
        assertEquals(GuestPolicy.ASK_MODERATOR.getName(), "ASK_MODERATOR");
        assertEquals(GuestPolicy.ALWAYS_ACCEPT_AUTH.getName(), "ALWAYS_ACCEPT_AUTH");
    }
}
