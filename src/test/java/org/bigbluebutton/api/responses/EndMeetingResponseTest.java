package org.bigbluebutton.api.responses;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.bigbluebutton.api.test.XMLResponseTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

public class EndMeetingResponseTest extends XMLResponseTestCase {

    @BeforeEach
    public void setUp() {
        xmlResponseFile = "fixtures/end_meeting.xml";

        super.setUp();
    }

    @Test
    @DisplayName("API end meeting response content")
    void testEndMeetingResponseContent() throws StreamReadException, DatabindException, IOException {
        EndMeetingResponse endMeetingResponse = xmlMapper.readValue(xmlInput, EndMeetingResponse.class);
        assertEquals(endMeetingResponse.getReturnCode(), APIReturnCode.SUCCESS.getReturnCode());
        assertTrue(endMeetingResponse.success());
        assertFalse(endMeetingResponse.failed());
        assertFalse(endMeetingResponse.getMessage().isEmpty());
        assertFalse(endMeetingResponse.getMessageKey().isEmpty());
    }
}
