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

package org.bigbluebutton.api.parameters;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hc.core5.http.NameValuePair;
import org.bigbluebutton.api.ApiParams;

import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public class PublishRecordingsParameters extends BaseParameters {

    @Getter
    List<String> recordIds = new ArrayList<>();

    @Getter
    protected Boolean publish;

    public void addRecordId(String recordId) {
        recordIds.add(recordId);
    }

    public PublishRecordingsParameters(List<String> recordIds, Boolean publish) {
        this.recordIds = recordIds;
        this.publish   = publish;
    }

    public PublishRecordingsParameters(String recordId, Boolean publish) {
        this.recordIds.add(recordId);
        this.publish = publish;
    }

    public List<NameValuePair> getQueryParms() throws UnsupportedEncodingException {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        addStringValue(params, ApiParams.RECORD_ID, String.join(",", recordIds));
        addBooleanValue(params, ApiParams.PUBLISH, getPublish());
        return params;
    }
}
