/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CancelMatchingRequest extends AbstractModel{

    /**
    * 匹配 Code
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
    * 要取消的匹配请求 Id
    */
    @SerializedName("MatchTicketId")
    @Expose
    private String MatchTicketId;

    /**
     * Get 匹配 Code 
     * @return MatchCode 匹配 Code
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set 匹配 Code
     * @param MatchCode 匹配 Code
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    /**
     * Get 要取消的匹配请求 Id 
     * @return MatchTicketId 要取消的匹配请求 Id
     */
    public String getMatchTicketId() {
        return this.MatchTicketId;
    }

    /**
     * Set 要取消的匹配请求 Id
     * @param MatchTicketId 要取消的匹配请求 Id
     */
    public void setMatchTicketId(String MatchTicketId) {
        this.MatchTicketId = MatchTicketId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);
        this.setParamSimple(map, prefix + "MatchTicketId", this.MatchTicketId);

    }
}

