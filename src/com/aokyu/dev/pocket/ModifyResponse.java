/*
 * Copyright 2012 Yu AOKI
 */

package com.aokyu.dev.pocket;

import org.json.JSONException;
import org.json.JSONObject;

public class ModifyResponse extends Response {

    public interface Parameter {

        public static final String ACTION_RESULTS = "action_results";
        public static final String STATUS = "status";

    }

    /* package */ ModifyResponse(JSONObject jsonObj) throws JSONException {
        super(jsonObj);
    }
}
